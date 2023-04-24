<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<form action="loginOk.jsp" method="post">
	
		<table border="1">
			<tr>
				<td>사용자 ID</td>
				<td><input type="text" name="id" /></td>				
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="pw" /></td>
			</tr>
			<tr>
				<td colspan="2" style="text-align: center;">
					<button type="submit">로그인</button>
					<button type="button" onclick="location.href='register.jsp'">회원가입</button>
			</td>
			</tr>
		</table>
	
	</form>

</body>
</html>