<%@page import="magic.board.BoardBean"%>
<%@page import="magic.board.BoardDBBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	int boardID = Integer.parseInt( request.getParameter("PK") );
	int pageNumber = Integer.parseInt( request.getParameter("page") );
	
	BoardDBBean manager = BoardDBBean.getInstance();
	BoardBean board = manager.getBoard( boardID );

%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>

	.body-wrapper {
		width: 960px; 
		margin: auto auto;
		text-align: left;
		justify-content: center;
		padding: 20px;
	}
	
	a { text-decoration: none; color: black; transtion: color 0.15s }
	a:hover { color: blue; }
	
	table { 
			min-width: 960px;
			border-style: none;
			border-radius: 15px;
			border-collapse: collapse;
			argin: 20px auto;
			box-shadow: 5px 5px 15px rgba(0,0,0,0.2);
	}
	table tr { 
			padding: 20px; 
		}		

	table td {
		 border-style: none;
		padding: 20px; 
	}
	
	table .btn-group {
		margin-top: 50px;
	}
	
	h1 {
		text-align: center;
	}
	
</style>
</head>
<body>

	<div class="body-wrapper">
		<h1>글 내용보기</h1>
		<table border="1">
			
			<tr>
				<td width="100px;">글번호</td>
				<td colspan="3"><%=board.getB_id()%></td>
			</tr>
			
			<tr>
				<td>작성자</td>
				<td><%=board.getB_name()%></td>
				<td>작성일</td><td>
				<%= new java.text.SimpleDateFormat("yyyy-MM-dd(E) a hh:mm").format( board.getB_date() ) %>
				</td>
			</tr>
			
			<tr>
				<td>글제목</td>
				<td colspan="3"><%=board.getB_title() %></td>
			</tr>
			
			<tr>
				<td style="vertical-align: top;">글내용</td>
				<td colspan="3" style="white-space: pre"><%=board.getB_content() %></td>
			</tr>
			
			<tr>
				<td colspan="4">
				
					<div class="btn-group">
						<a href="list.jsp?page=<%=pageNumber%>">뒤로가기</a>
						<a href="edit.jsp?page=<%=pageNumber%>&PK=<%=boardID%>">수정하기</a>
						<a href="#">삭제하기</a>
					</div>
				</td>
			</tr>
		</table>
</div>
</body>
</html>