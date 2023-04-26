<%@page import="magic.board.BoardDBBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%  request.setCharacterEncoding("utf-8");  %>

<jsp:useBean class="magic.board.BoardBean" id="board" />
<jsp:setProperty property="*" name="board"/>


<%= board.toString() %>

<%

	BoardDBBean manager = BoardDBBean.getInstance();
	manager.insertBoard(board);

%>