<%@page import="java.util.ArrayList"%>
<%@page import="magic.board.BoardBean"%>
<%@page import="magic.board.BoardDBBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%

	if ( request.getParameter("page") == null ) {
		response.sendRedirect("list.jsp?page=1");
	} else {
		
		int pageNumber = Integer.parseInt(request.getParameter("page"));
		BoardDBBean manager = new BoardDBBean();
	
		ArrayList<BoardBean> boards = manager.listBoard(pageNumber);
		if ( boards.size() == 0) { response.sendRedirect("list.jsp?page=1"); }

		
	
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
		text-align: center;
		justify-content: center;
	}
	
	a { text-decoration: none; color: black; transtion: color 0.15s }
	a:hover { color: blue; }
	
	table { 
		min-width: 960px;
		 border-style: none;
		 border-radius: 15px;
		 border-collapse: collapse;
		margin: 20px auto;
		 box-shadow: 5px 5px 15px rgba(0,0,0,0.2);
	}
	table tr { 
			padding: 10px; 
			transition: background-color 0.15s;
		}		
	table tr:hover:not(:nth-child(1)) {
		background-color : #eee ;		
	}	
	table td {
		 border-style: none;
		text-align: center;
		padding: 10px; 
	}	

</style>
</head>
<body>

	<div class="body-wrapper">
	
		<h1>게시판에 등록된 글 목록 보기</h1>
		<a href="write.jsp">글 쓰기</a>
		
		<table border="1">
		
			<tr>
				<td width="20px;">번호</td>
				<td>글제목</td>
				<td>작성자</td>
				<td>작성일</td>
				<td>조회수</td>
			</tr>
			
<%		for ( int index = 0; index < boards.size(); index++ ) { %>				
			<tr>
				
				<td><%=boards.get(index).getB_id() %></td>
				<td width="500px" style="text-align: left;">
				
<%
				if ( boards.get(index).getB_level() > 0 ) {
					for ( int i=1; i < boards.get(index).getB_level(); i++) { out.print("&nbsp&nbsp&nbsp&nbsp"); }
					%><img src="../images/AnswerLine.gif" /><%
%>
						
<% 
						
				}
%>				
				
				
				<!-- 			게시글 이동버튼			-->
				<a href="show.jsp?page=<%=pageNumber%>&PK=<%=boards.get(index).getB_id()%> ">
				<%=boards.get(index).getB_title() %></a>				
				</td>
				
				
				<td width="100px">
					<!-- 			이메일 버튼			-->
					<a href="mailto:<%=boards.get(index).getB_name()%>" >
					<%=boards.get(index).getB_name() %></a>
				</td>
				
				<td width="100px">
				<%= new java.text.SimpleDateFormat("yyyy-MM-dd(E) a hh:mm").format(boards.get(index).getB_date()) %>

				</td>
				<td width="50px">
				<%=boards.get(index).getB_hit() %>
				</td>
			</tr>
<% 
	}
} 
%>
		
		</table>
	</div>

</body>
</html>

