<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%!
// 	데이터베이스 연결하기위해 필요한 정보
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	String SQL = "";

	final String CLASS_NAME = "oracle.jdbc.driver.OracleDriver";
	final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	final String ID = "scott";
	final String PW = "tiger";
	
%>
<!-- ----------------------------------------------------- -->

<%


	try {					
		
// 		데이터베이스 접근 
		Class.forName( CLASS_NAME ); 	
		conn = DriverManager.getConnection( URL, ID, PW );
		
		
// 		쿼리 준비
		stmt = conn.createStatement();
		
		
		
	/* =====   접근실패사유에 따른 예외처리   =====   */
	} catch (SQLException se) {
		out.print("연결실패 [SQL 문제발생]" + "<br>" + se.getMessage() );
		
	} catch (ClassNotFoundException nfe) {
		out.print("연결실패 [파일찾을 수 없음]" + "<br>" + nfe.getMessage() );
		
	} catch (Exception e) {
		out.print("연결실패 [예측할 수 없는 오류]" + "<br>" + e.getMessage() );
	
		
	/* =====   자원반납후 종료 ( 커넥션정보가 유효할때 )   =====   */
	
		
	}
    
%>
<!-- ----------------------------------------------------- -->

	
<%
		
		

	try {
		
		String id="", pw="", name="", sclass="", p1="", p2="", p3=""; 
	
		id = request.getParameter("id");
		pw = request.getParameter("pw");
		name = request.getParameter("name");
		sclass = request.getParameter("mclass");
		p1 = request.getParameter("phone1");
		p2 = request.getParameter("phone2");
		p3 = request.getParameter("phone3");
		
		// SQL = "INSERT INTO MEMBER2 VALUES( 'myID', 'pwd@#$' , '새로운유저' , '01012345678'  , 1  );";
		
		
		StringBuffer insertQuery = new StringBuffer();
		
		insertQuery.append("INSERT INTO MEMBER2 VALUES("	)
							   .append("'" + id + "', ")
							   .append("'" + pw + "', ")
							   .append("'" + name + "', ")
							   .append("'" + p1 + "-" + p2 + "-" + p3 + "', ")
							   .append( sclass )
							  .append(")");
							  
		// 조립한 쿼리 확인
		System.out.println( insertQuery.toString() );

		int result = stmt.executeUpdate( insertQuery.toString() );
		
		if (result == 1) {
%>
	
	추가성공 <br />
	<a href="addForm.html">추가작업</a> | <a href="viewMember.jsp">검색작업</a>
	
	
			
<%			
		
		
		} else {
			
			%> <font color="red">추가 실패 ㅠ.ㅠ</font>  <%
			
		}
		
	
	// 에러발생시 예외처리 ▼
	} catch (SQLException se) {
		se.printStackTrace();
		
		%>
		
		서버불량 잠시 후 다시 시도
		
		<%
	
	} finally {
	
		try { 
			if (rs != null) { rs.close(); }
			if (stmt != null) { stmt.close(); }
			if (conn != null) { conn.close(); }
		
		} catch(SQLException e) { e.printStackTrace();  }

	}
	
	
%>