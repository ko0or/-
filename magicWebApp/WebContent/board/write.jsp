<%@page import="magic.board.BoardBean"%>
<%@page import="magic.board.BoardDBBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%

	int b_id = 0;
	int b_ref = 0;
	int b_step = 0;
	int b_level = 0;
	String b_title = null;
	
	int pageNumber = 1;

	// show.jsp 에서 글 번호를 갖고왔다면
	if ( request.getParameter("PK") != null ) {
		
		b_id = Integer.parseInt( request.getParameter("PK") ); 
		BoardDBBean manager = new BoardDBBean();
		BoardBean board = manager.getBoard(b_id, false);
			
		b_ref = board.getB_ref();
		b_step = board.getB_step(); 
		b_level = board.getB_level();
		b_title = board.getB_title();

}
	
	if ( request.getParameter("page") != null ) {	
		pageNumber = Integer.parseInt( request.getParameter("page") );		
	}
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<center>
	<h1>글 올 리 기</h1>
	
	<form 
		id="myForm"
		action="write_ok.jsp" 
		method="post" 
		enctype="multipart/form-data"
	>
	
	<input type="hidden" name="b_id" value="<%=b_id%>" />
	<input type="hidden" name="b_ref" value="<%=b_ref%>" />
	<input type="hidden" name="b_step" value="<%=b_step%>" />
	<input type="hidden" name="b_level" value="<%=b_level%>" />
	

		<table style="max-width: 700px">
			<tr>
				<td width="70px">작성자</td>
				<td><input type="text" name="b_name" width="10px" maxlength="20"></td>
				<td width="70px">이메일</td>
				<td><input type="text" name="b_email" maxlength="50"></td>
			</tr>
			<tr>
				<td>글제목</td>
				<%
//					[답변]: 의 존재여부
					if (b_id == 0) { // 신규글
%>	
				<td colspan="3"><input type="text" name="b_title" maxlength="80"
					style="width: 430px"></td>											
<%						
					} else { // 답변글
%>
				<td colspan="3"><input type="text" value="[답변]:<%=b_title%>" 
				name="b_title" maxlength="80" style="width: 430px"></td>
<%
					}
%>

			</tr>
			
			<tr height="30">
				<td>파 일</td>
				<td colspan="3" width="140">
				
					<input type="file" name="b_fname" size="40" maxlength="100">
				
				</td>
			
			</tr>
			
			
			<tr>
				<td colspan="4">
					<textarea name="b_content" cols="70" rows="10"  maxlength="3000" style="resize: none;"></textarea>
				</td>
			</tr>
			<tr>
				<td width="70px">암호입력 </td>
				<td colspan="3" ><input type="password" name="b_pwd"  style="width: 430px;" /></td>
			</tr>
			<tr>
				<td colspan="4" style="text-align: center;">
					<input onclick="check_ok()" type="button" value="글쓰기">
				 	<input type="reset" value="다시작성">
				 	<input onclick="location.href='list.jsp?page=<%=pageNumber%>'" type="button" value="글목록">
				 </td>
			</tr>
		</table>
	</form>
</center>

</body>
<script type="text/javascript" src="./board.js"></script>
</html>
