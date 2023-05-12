<%@page import="java.util.Enumeration"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="java.sql.Timestamp"%>
<%@page import="com.jspsmart.upload.File"%>
<%@page import="com.jspsmart.upload.SmartUpload"%>
<%@page import="java.net.InetAddress"%>
<%@page import="magic.board.BoardDBBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%  request.setCharacterEncoding("utf-8");  %>

<jsp:useBean class="magic.board.BoardBean" id="board"  />
<%-- 더 이상 사용불가 ==> <jsp:setProperty property="*" name="board"/> --%>


<%

/* 	SimpleUpload.jar 라이브러리 + 파일 업로드 처리 ===========================================

	// 파일업로드 라이브러리 기본세팅 
	SmartUpload uploadLibrary = new SmartUpload();
	uploadLibrary.initialize(pageContext);
	uploadLibrary.upload();
	String fName = "";
	int fileSize = 0;
	
	// 파일이 존재할경우, 워크스페이스에 저장 + 보드빈에는 파일명+파일사이즈 주입 
	File file = uploadLibrary.getFiles().getFile(0);
	if ( !file.isMissing() ) {
		fName = file.getFileName();
		file.saveAs( "/uploadFiles/" + fName );		
		fileSize = file.getSize();
		
	}
*/

	
	int sizeMaxium = 1024*1024;
	String path = request.getRealPath("/uploadFiles/");
	int fileSize = 0;
	String fileName=""; 
	String originalFile ="";
	
	// DefaultFileRenamePolicy : 파일명 넘버링 처리
	MultipartRequest multi = new MultipartRequest(request, path, sizeMaxium, "UTF-8", new DefaultFileRenamePolicy() );
	Enumeration files = multi.getFileNames();
	String str = files.nextElement().toString();
	
	// file : 넘버링된 파일명
	fileName = multi.getFilesystemName(str);
	
	if (fileName != null) {
		// originalFile : 실제파일이름 ( 넘버링되지않은 고유 파일명 )
		originalFile = multi.getOriginalFileName(str);
		fileSize = fileName.getBytes().length;
	}
%>





<%
//	데이터베이스에 저장하기 ====================================
	BoardDBBean manager = new BoardDBBean();

/* 	board.setB_id( Integer.parseInt(uploadLibrary.getRequest().getParameter("b_id")) );
	board.setB_ref( Integer.parseInt(uploadLibrary.getRequest().getParameter("b_ref")) );
	board.setB_step( Integer.parseInt(uploadLibrary.getRequest().getParameter("b_step")) );
	board.setB_level( Integer.parseInt(uploadLibrary.getRequest().getParameter("b_level")) );
	
	board.setB_name( uploadLibrary.getRequest().getParameter("b_name") );
	board.setB_email( uploadLibrary.getRequest().getParameter("b_email") );
	board.setB_title( uploadLibrary.getRequest().getParameter("b_title") );
	board.setB_content( uploadLibrary.getRequest().getParameter("b_content") );
	board.setB_pwd( uploadLibrary.getRequest().getParameter("b_pwd") );
	board.setB_ip( InetAddress.getLocalHost().getHostAddress() );
	board.setB_date( new Timestamp(System.currentTimeMillis())  );
	
	board.setB_fname( fName ); 
	board.setB_fsize( fileSize );  */

	board.setB_id( Integer.parseInt(multi.getParameter("b_id")) );
	board.setB_ref( Integer.parseInt(multi.getParameter("b_ref")) );
	board.setB_step( Integer.parseInt(multi.getParameter("b_step")) );
	board.setB_level( Integer.parseInt(multi.getParameter("b_level")) );
	
	board.setB_name( multi.getParameter("b_name") );
	board.setB_email( multi.getParameter("b_email") );
	board.setB_title( multi.getParameter("b_title") );
	board.setB_content( multi.getParameter("b_content") );
	board.setB_pwd( multi.getParameter("b_pwd") );
	board.setB_ip( InetAddress.getLocalHost().getHostAddress() );
	board.setB_date( new Timestamp(System.currentTimeMillis())  );
	
	if ( fileName != null) {
		board.setB_fname( fileName ); 
		board.setB_fsize( fileSize );
		board.setB_rfname( originalFile); 
	}


	//글 쓰기 성공시 list.jsp 로 이동,   실패시 write.jsp로 이동
	if ( manager.insertBoard(board) == 1 ) {	
		response.sendRedirect("list.jsp?page=1"); 	
	
		} else { response.sendRedirect("write.jsp");
	}

%>