<%@page import="javax.naming.Context"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="java.sql.SQLException"%>
<%@page import="javax.naming.NamingException"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- ------------------------------------------------------------------------------------  -->
<%! 
	
	// 	데이터베이스 연결하기위해 필요한 정보들
	
	DataSource ds = null;
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	
%>

<!-- ------------------------------------------------------------------------------------  -->
<%

	try {	
		
		/* =======   DBCP 연동하기   =======  */
			Context ctx = new InitialContext();
			ds = (DataSource) ctx.lookup("java:comp/env/jdbc/oracle");
			conn = ds.getConnection();
		
			
		
		/* =======   정보 갖고오기   =======  */
		
		
// 	[회원정보 조회용]  
		StringBuffer selectQuery = new StringBuffer();
		selectQuery.append("SELECT * FROM MEMBER2 WHERE ID = ? ");

		
// 	[ 정보갖고오기 ] by  [쿼리스트링 ID 값] + [셀렉트 쿼리문]
		String getID = request.getParameter("id");
		pstmt = conn.prepareStatement( selectQuery.toString() );
		
		
// 	[ 갖고온 정보 사용해서 결과 받아오기 ] 
		pstmt.setString( 1 , getID );
		rs = pstmt.executeQuery();
	
		
		
		
		
		/* =======   정보 표시하기   =======  */
		
		
// 	[ 정보표시 - 정보유무에따른 분기처리 ]
		if ( rs.next() ) {%>
		
			<form action="updateProcess.jsp" method="post">				
				아 이 디 : <input type="text" name="id" value="<%= getID %>" /><br />
				이름 : <input type="text" name="name" value="<%= rs.getString("NAME") %>" /><br />
				회원등급 : <input type="text" name="mclass" value="<%= rs.getString("CLASS") %>" /><br />
				전화번호 : <input type="text" name="tel" value="<%= rs.getString("TEL") %>" /><br />
				
				<input type="submit" value="수정완료" /> 
				<a href="../chapter12/viewMember.jsp">목록보기</a>
			</form>
			
	
	
		
<%	
// 	[표시할 정보가 없을때]
		} else {%> 
		
			<font color="red">아이디 없3~~</font>	
			<a href="../chapter12/viewMember.jsp">목록보기</a>
			
			
			
			
			
			
			
<%
		}


// 오류발생시 예외처리
	} catch (NamingException ne) { ne.printStackTrace(); 	
	} catch (SQLException se) { se.printStackTrace();


// 종료시 자원반납
	} finally {
		
		try { 
			if (rs != null) { rs.close(); }
			if (pstmt != null) { pstmt.close(); }
			if (conn != null) { conn.close(); }
		
		} catch(SQLException e) { e.printStackTrace();  }
	
	}
%>