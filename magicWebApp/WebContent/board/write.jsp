<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<center>
	<h1>글 올 리 기</h1>
	
	<form id="myForm" action="write_ok.jsp" method="post">

		<table style="max-width: 700px">
			<tr>
				<td width="50px">작성자</td>
				<td><input type="text" name="b_name" width="10px" maxlength="20"></td>
				<td width="50px">이메일</td>
				<td><input type="text" name="b_email" maxlength="50"></td>
			</tr>
			<tr>
				<td>글제목</td>
				<td colspan="3"><input type="text" name="b_title" maxlength="80"
					style="width: 410px"></td>
			</tr>
			<tr>
				<td colspan="4">
					<textarea name="b_content" cols="65" rows="10"  maxlength="3000">
					</textarea>
				</td>
			</tr>
			<tr>
				<td colspan="4" style="text-align: center;">
					<input onclick="check_ok()" type="button" value="글쓰기">
				 	<input type="reset" value="다시작성"></td>
			</tr>
		</table>
	</form>
</center>

</body>
<script type="text/javascript" src="./board.js"></script>
</html>