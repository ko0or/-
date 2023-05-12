<%@page import="magic.board.BoardBean"%>
<%@page import="magic.board.BoardDBBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	int boardID = Integer.parseInt( request.getParameter("PK") );
	int pageNumber = Integer.parseInt( request.getParameter("page") );
	
	BoardDBBean manager = new BoardDBBean();
	BoardBean board = manager.getBoard( boardID, false );

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
	
	input[type=text], textarea { font-size: 15px; }
	button { border: none; background: white; cursor: pointer; font-size: 14px; }
	button:hover { color: blue; }
	
</style>
</head>
<body>

	<div class="body-wrapper">
		<h1>글 수정하기</h1>
		
		<form action="edit_ok.jsp?pageNumber=<%=pageNumber%>&PK=<%=boardID%>" method="post">
		<input type="hidden" name="pageNumber" />
		<input type="hidden" name="pageNumber" value="<%=pageNumber%>" />
		<input type="hidden" name="b_id" value="<%=board.getB_id()%>" />
		<input type="hidden" name="b_name" value="<%=board.getB_name()%>" />
		
		<table id="myForm" border="1">
			
			<tr>
				<td width="100px;">글번호</td>
				<td><%=board.getB_id()%></td>
				<td>조회수</td>
				<td><%=board.getB_hit() %></td>
			</tr>
			
			<tr>
				<td>작성자</td>
				<td><%=board.getB_name()%></td>
				<td>작성일</td><td>
				<%= new java.text.SimpleDateFormat("yyyy-MM-dd(E) a hh:mm").format( board.getB_date() ) %>
			</tr>
			
			<tr>
				<td>글제목</td>
				<td colspan="3"><input type="text" name="b_title" value="<%=board.getB_title()%>" /></td>
			</tr>
			
			<tr height="30">
				<td>파 일</td>
				<td colspan="3" width="140">				
					<input type="file" name="b_fname" size="40" maxlength="100">				
				</td>			
			</tr>
			
			<tr>
				<td style="vertical-align: top;">글내용</td>
				<td colspan="3">
					<textarea name="b_content" cols="65" rows="10"  maxlength="3000" style="resize: none;"><%=board.getB_content() %></textarea>
				</td>
			</tr>
			
			<tr>
				<td>
					암호
				</td>
				<td colspan="3">
					<input type="password" name="tryPWD"  />
				</td>
			</tr>
			
			<tr>
				<td colspan="4">
				
					<div class="btn-group">
						<button type="button"  onclick="location.href='show.jsp?page=<%=pageNumber%>&PK=<%=boardID%>'" >
						뒤로가기</button>
						
						<button onclick="boardEdit()" type="button">
						수정완료</button>
					</div>
				</td>
			</tr>
		</table>

</form>
</div>
</body>
<script src="board.js?ver=123"></script>
</html>