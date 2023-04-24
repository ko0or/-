<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form id="myForm" action="registerOk.jsp" method="post">
	
	<table border="1"> 
	<tr style="text-align: center;">
		<td colspan="3">
			<h1>회원 가입 신청</h1>
			<p>'*' 표시 항목은 필수 입력 항목입니다.</p>
		</td>
	</tr>
		<tr>
			<td>User ID</td>
			<td colspan="2" style="width: 300px;"><input type="text" name="MEM_UID" /> <i>*</i></td>
		</tr>
		<tr>
			<td>암호</td>
			<td colspan="2"><input type="text" name="MEM_PWD" /> <i>*</i></td>
		</tr>
		<tr>
			<td>암호 확인</td>
			<td colspan="2"><input type="text" name="MEM_PWD2" /> <i>*</i></td>
		</tr>
		<tr>
			<td>이름</td>
			<td colspan="2"><input type="text" name="MEM_NAME" /> <i>*</i></td>
		</tr>
		<tr>
			<td>E-mail</td>
			<td colspan="2"><input type="text" name="MEM_EMAIL" /> <i>*</i></td>
		</tr>
		<tr>
			<td>주소</td>
			<td colspan="2"><input type="text" name="MEM_ADDRESS" /></td>
		</tr>

		<tr style="text-align: center;">
			<td colspan="3">
			
				<button type="button" onclick="check_ok()">등록</button>
				<button type="reset">다시입력</button>
				<button type="button" onclick="location.href ='login.jsp'">가입안함</button>
			
			</td>
			
		</tr>
	</table>
</form>


</body>
<script type="text/javascript"  src="./script.js"  > </script>
</html>