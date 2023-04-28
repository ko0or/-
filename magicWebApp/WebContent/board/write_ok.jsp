<%@page import="magic.board.BoardDBBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%  request.setCharacterEncoding("utf-8");  %>

<jsp:useBean class="magic.board.BoardBean" id="board" />
<jsp:setProperty property="*" name="board"/>


<%= board.toString() %>

<%

BoardDBBean manager = BoardDBBean.getInstance();

	//글 쓰기 성공시 list.jsp 로 이동,   실패시 write.jsp로 이동
	if ( manager.insertBoard(board) == 1 ) {	
		response.sendRedirect("list.jsp?page=1"); 	
	
		} else { response.sendRedirect("write.jsp");
	}

%>