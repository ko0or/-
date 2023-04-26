<%@page import="magic.member.memberBean"%>
<%@page import="magic.member.MemberDBBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("utf-8"); %>
<jsp:useBean class="magic.member.memberBean" id="member" />
<jsp:setProperty property="*" name="member"/>

<%

	

	String getID = session.getAttribute("member").toString();
	MemberDBBean manager = MemberDBBean.getInstance();
	
	member.setMEM_UID( getID  );
	int re = manager.updateMember(member);	

	response.sendRedirect("main.jsp");
	
%>
