<%@page import="magic.board.BoardBean"%>
<%@page import="magic.board.BoardDBBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="inputPWD" class="magic.board.BoardBean" />
<%

	int boardPK = Integer.parseInt( request.getParameter( "PK" ) );
	int pageNumber = Integer.parseInt( request.getParameter("page") );
	String tryPWD = request.getParameter("tryPWD");
	
	BoardDBBean manager = new BoardDBBean();
	BoardBean board = manager.getBoard(boardPK, false);
	
	
	if ( tryPWD.equals( board.getB_pwd() ) && manager.deleteBoard(board) == 1) {
		
		response.sendRedirect("list.jsp?page="+pageNumber); 
		
	} else { 
	%> 
	<script>
		alert("게시글 삭제실패");
		location.href = "show.jsp?page=<%=pageNumber%>&PK=<%=boardPK%>"; 
	</script> 
	<% 
	
	}
	

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>