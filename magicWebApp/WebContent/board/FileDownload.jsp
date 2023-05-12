<%@page import="java.io.BufferedOutputStream"%>
<%@page import="java.io.FileInputStream"%>
<%@page import="java.io.BufferedInputStream"%>
<%@page import="java.io.File"%>
<%@page import="com.oreilly.servlet.MultipartResponse"%>
<%@page import="magic.board.BoardBean"%>
<%@page import="magic.board.BoardDBBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	int boardPK = Integer.parseInt( request.getParameter("fileNumber") );
	BoardDBBean manager = new BoardDBBean();
	BoardBean board = manager.getFileName(boardPK);
	
	String fileName = "";
	String realFileName = "";
	
// 	첨부파일이 있으면
	if ( board != null ) {
		fileName = board.getB_fname();
		realFileName = board.getB_rfname();
	}
	
// 	실제 업로드되어있는 경로
	String saveDirectory = application.getRealPath("/uploadFiles");
	
// 	File.separator : 디렉토리명과 파일명을 연결하는 구분자 (운영체제에마다 다른걸 맞춰줌)
	String path = saveDirectory + File.separator + fileName; // fileName : 넘버링된 파일명(고유식별)
	
	
// 	file : 다운로드 대상파일
	File file = new File(path);
	long length = file.length();
	
// 	jsp 기본한글처리
	realFileName = new String(realFileName.getBytes("ms949"), "8859_1");

// 	response 객체에 필요한 내용들을 담아서 전송
	response.setContentType("application/octet-stream"); // octet-stream : 기본타입 
	response.setContentLength((int)length);
	response.setHeader("Content-Disposition", "attachment;filename=" + realFileName); 
	
// 	파일 다운로드할때 임시 저장공간을 사용
	BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));

// 	기존 파일이 남아있는경우 초기화
	out.clear();
// 	다운로드 준비
	pageContext.pushBody();

// 	사용자가 다운로드할 수 있게 유저에게 전송한다
	BufferedOutputStream bos = new BufferedOutputStream( response.getOutputStream() );

// 	bis로 읽어서 bos 에 쓰기 ( 파일입출력 api 할때 했던..? )
	int data;
	while ( (data=bis.read()) != -1 ) {
		bos.write(data);
	}
	
// 	자원반납
	bis.close();
	bos.close();
	

%>
















