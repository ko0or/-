<%@page import="magic.member.MemberDBBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:useBean class="magic.member.memberBean" id="member" />
<jsp:setProperty property="*" name="member"/>

<%

	MemberDBBean manager = MemberDBBean.getInstance();

	if ( manager.confirmID(member.getMEM_UID()) == 1 ) {
%> 
<script>
	alert("중복되는 아이디가 존재 합니다.");
	history.back(); 
</script>
<%

		
		
	} else {		
		int re = manager.insertMember(member);
		if ( re == 1) {

%> 
<script>
		alert("회원가입을 축하드립니다.\n회원으로 로그인 해주세요.");
		document.location.href="login.jsp"
</script>		 
<%
			
		
		} else {
%>  
<script>
	alert("회원가입에 실패했습니다.");
	document.location.href="login.jsp"
</script>
<%

			out.print("회원가입에 실패했습니다.");
		}
		
		out.print("<a href='login.jsp'>로그인 화면으로</a>");
	}

%>
