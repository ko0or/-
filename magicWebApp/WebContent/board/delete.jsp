<%@page import="magic.board.BoardDBBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	int boardPK = Integer.parseInt( request.getParameter("PK") );
	int pageNumber = Integer.parseInt( request.getParameter("page") );

	
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>글 삭제하기</h1>
	<p>>> 암호를 입력하세요 <<</p>
	
	<form action="delete_ok.jsp?page=<%=pageNumber%>&PK=<%=boardPK%>" method="post">
		<tr>
			암호 <input type="password" name="tryPWD" />
		</tr>
	
		<tr>
			<button type="submit">글삭제</button>
			<button type="reset">다시작성</button>
			<button onclick="history.back()" type="button">글목록</button>
		</tr>
	</form>
</body>
</html>