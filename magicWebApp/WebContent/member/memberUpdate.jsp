<%@page import="magic.member.memberBean"%>
<%@page import="magic.member.MemberDBBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	
	if ( session.getAttribute("member") == null ) {
		response.sendRedirect("login.jsp");
	} else {

		String getID = session.getAttribute("member").toString();
		MemberDBBean manager = MemberDBBean.getInstance();	
		memberBean member = manager.getMember( getID );
			
	
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form id="myForm" action="" method="post" >
	<table border="1">
		<tr>
			<td colspan="3" style="text-align: center; padding: 10px;">
				<h1>회원 정보 수정</h1>
				<p>'*' 표시 항목은 필수 입력 항목입니다.</p>
			</td>

		</tr>
		<tr>
			<td>User ID</td>
			<td colspan="2"><%= member.getMEM_UID()  %></td>
		</tr>
		<tr>
			<td>암호</td>
			<td colspan="2"><input type="password" name="MEM_PWD" />*</td>

		</tr>
		<tr>
			<td>암호 확인</td>
			<td colspan="2"><input type="password" name="MEM_PWD2" />*</td>

		</tr>
		<tr>
			<td>이 름</td>
			<td colspan="2"><%=member.getMEM_NAME()%></td>

		</tr>
		<tr>
			<td>E-mail</td>
			<td colspan="2"><input type="text" name="MEM_EMAIL" value="<%=member.getMEM_EMAIL()%>" />*</td>

		</tr>
		<tr>
			<td>주소</td>
			<td colspan="2"><input type="text" name="MEM_ADDRESS" value="<%=member.getMEM_ADDRESS()%>" /></td>

		</tr>
		<tr>
			<td colspan="3" style="text-align: center;">
				<button type="button" onclick="update_check_ok()">수정</button>
				<button type="reset">다시입력</button>
				<button type="button" onclick="history.back()">수정안함</button>
			</td>
		</tr>
	</table>
</form>

</body>
<script type="text/javascript" src="./script.js"></script>
</html>


<%

}

%>