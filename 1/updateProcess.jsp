<%@page import="java.sql.SQLException"%>
<%@page import="javax.naming.NamingException"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!
		Connection conn = null;
		PreparedStatement pstmt = null;
		DataSource ds=null;
	%>
	<%
		try{
// 			Context ctx = new InitialContext();
// 			ds = (DataSource)ctx.lookup("java:comp/env/jdbc/oracle");
// 			conn = ds.getConnection();
			conn = ((DataSource)(new InitialContext().lookup("java:comp/env/jdbc/oracle"))).getConnection();
		}catch(NamingException ne){
			ne.printStackTrace();
		}catch(SQLException se){
			se.printStackTrace();
		}

// 	*.updateMember.jsp 에서 넘어오는 값들
// 	name="id"
// 	name="name"
// 	name="mclass"
// 	name="tel"
	
		String id="", name="", vclass="", tel="";
		id = request.getParameter("id");
		name = request.getParameter("name");
		vclass = request.getParameter("mclass");
		tel = request.getParameter("tel");
		
		StringBuffer updateQuery=new StringBuffer();
// 		MEMBER2 테이블의 NAME 컬럼명의 값을 aaa 로 수정
		updateQuery.append("UPDATE MEMBER2 SET NAME=?, CLASS=?,TEL=? WHERE ID=?");

		try{
			pstmt = conn.prepareStatement(updateQuery.toString());
// 			? 4개를 순서대로 값을 셋팅
			pstmt.setString(1, name);//VARCHAR2 타입은 setString 메소드 사용
			pstmt.setInt(2, Integer.parseInt(vclass));//NUMBER 타입은 setInt 메소드 사용
			pstmt.setString(3, tel);//VARCHAR2 타입은 setString 메소드 사용
			pstmt.setString(4, id);//VARCHAR2 타입은 setString 메소드 사용
			int re = pstmt.executeUpdate();//정상적으로 수정시 1이 반환됨
			
			if(re == 1){
				%>
					<%= id %>의 정보가 수정되었습니다.<br>
					[<a href="viewMember.jsp">목록보기</a>]
				<%
			}else{
				%>
					변경 실패
				<%
			}
		}catch(SQLException se){
			se.printStackTrace();
			%>
				서버 불량 잠시 후 다시 시도
			<%
		}
	%>
</body>
</html>








