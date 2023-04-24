<%@page import="magic.member.memberBean"%>
<%@page import="magic.member.MemberDBBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<%
	MemberDBBean manager = MemberDBBean.getInstance();

	String getID = request.getParameter("id");
	String getPW = request.getParameter("pw");

	int check = manager.userCheck( getID, getPW );
	memberBean mb = manager.getMember( getID );
	
	if (mb == null) {
%> 
<script>
	alert("존재하지 않는 회원");
	history.back();
</script> 
<%		
	}
	else {
		
		String name = mb.getMEM_NAME();
		if (check == 1) {
			// 세션에 사용자 정보 추가후 main.jsp 로 이동
			
			session.setAttribute("member", mb.getMEM_UID());
			response.sendRedirect("main.jsp");
			
		} else if (check == 0) {
%> 
<script> 
	alert("비밀번호가 맞지 않습니다.");
	history.back();
</script> 
<%
		} else {
%> 
<script> 
	alert("아이디가 맞지 않습니다.");
	history.back();
</script> 
<%

	}
}

%>