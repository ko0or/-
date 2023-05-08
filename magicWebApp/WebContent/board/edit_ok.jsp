<%@page import="magic.board.BoardBean"%>
<%@page import="magic.board.BoardDBBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("utf-8"); %>
<jsp:useBean class="magic.board.BoardBean" id="board" />
<jsp:setProperty property="*" name="board"/>
<%

	BoardDBBean manager = new BoardDBBean();
	int pageNumber = Integer.parseInt( request.getParameter("pageNumber") );
	int PK = Integer.parseInt( request.getParameter("b_id") );
	String tryPWD = request.getParameter("tryPWD");
	
	BoardBean getBoard = manager.getBoard(PK, false);
	
	
	if ( getBoard.getB_pwd().equals(tryPWD) && manager.updateBoard(board) == 1 ) {
		response.sendRedirect("show.jsp?page="+pageNumber+"&PK="+PK);
		
		
	} else {
		%> <script> 
		alert("게시글 수정실패!"); 
		location.href="show.jsp?page=<%=pageNumber%>&PK=<%=PK%>"
		</script> <%
		 
	}


%>