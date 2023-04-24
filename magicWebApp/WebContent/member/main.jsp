<%@page import="magic.member.MemberDBBean"%>
<%@page import="magic.member.memberBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>

<% 
if ( session.getAttribute("member") == null ) { 
	response.sendRedirect("login.jsp");
}  else {
%>

<%
	MemberDBBean manager = MemberDBBean.getInstance();


	String getID = session.getAttribute("member").toString();	
	
	memberBean member = manager.getMember( getID );	

%>
    
 <table border="1">
 	<tr>
 		<td>안녕하세요 <%= member.getMEM_NAME() %>(<%= member.getMEM_UID() %>)님</td>
 	</tr>
 	<tr>
 		<td>
 			<button type="button" onclick="location.href='logOut.jsp'">로그아웃</button>
 			<button type="button" onclick="location.href='memberUpdate.jsp'">회원정보 변경</button>
 		</td>
 	</tr>
 </table>
 
 <% 
 } 
 %>