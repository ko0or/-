<%@page import="java.util.ArrayList"%>
<%@page import="magic.board.BoardBean"%>
<%@page import="magic.board.BoardDBBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


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
<% String pageNumber = "1"; %>
	<div class="body-wrapper">
	
		<h1>게시판에 등록된 글 목록 보기</h1>
		<a href="write.jsp?page=<%=pageNumber%>">글 쓰기</a>

<%
	
	ArrayList<BoardBean> boards = null;

	if ( request.getParameter("page") == null ) {
		pageNumber = "1";
	} else {
		
		pageNumber = request.getParameter("page");
	}
	
	
		BoardDBBean manager = new BoardDBBean();	
		boards = manager.listBoard( pageNumber );		
	
	
%>

		<table border="1">
		
			<tr>
				<td>번호</td>
				<td>첨부파일</td>
				<td>글제목</td>
				<td>작성자</td>
				<td>작성일</td>
				<td>조회수</td>
			</tr>

<%
	
			if ( boards.size() == 0 ) { %>
			
			<tr>
				<td colspan="6" style="color: grey">아직 등록된 게시글이 없습니다.</td>
			</tr>
				
			<%}

%>

			
<%		for ( int index = 0; index < boards.size(); index++ ) { %>				
			<tr>
				
				<!--  게시글 일련번호  -->
				<td width="50px"><%=boards.get(index).getB_id() %></td>
				
				
				
				
				<!--  게시글 첨부파일 여부 -->
				<td width="50px"><% if ( boards.get(index).getB_fsize() > 0 ) { %>
				
					<img src="../images/zip.gif">			
								
				<%} %></td>
				
				
				
				
				<!--  글제목 (원글, 답글여부 표시)  -->
				<td width="300px" style="text-align: left;">
				
<%
				if ( boards.get(index).getB_level() > 0 ) {
					for ( int i=1; i < boards.get(index).getB_level(); i++) { out.print("&nbsp&nbsp&nbsp&nbsp"); }
					%><img src="../images/AnswerLine.gif" />
				<%}%>

				
				
				<!-- 			제목눌렀을때, 이동하는 버튼			-->
				<a href="show.jsp?page=<%=pageNumber%>&PK=<%=boards.get(index).getB_id()%> ">
				<%=boards.get(index).getB_title() %></a>				
				</td>
				
				
				
				
				<td width="100px">
					<!-- 			작성자 표시 (이메일 버튼)			-->
					<a href="mailto:<%=boards.get(index).getB_name()%>" >
					<%=boards.get(index).getB_name() %></a>
				</td>
				
				
				
				
				
				<!-- 				작성일 표시				 -->
				<td width="100px">
				<%= new java.text.SimpleDateFormat("yyyy-MM-dd(E) a hh:mm").format(boards.get(index).getB_date()) %>






				<!-- 				조회수 표시				 -->
				</td>
				<td width="50px">
				<%=boards.get(index).getB_hit() %>
				</td>
			</tr>
<% } %>
		
		</table>
	<%= BoardBean.pageButtons(5) %>
	</div>
</body>
</html>

