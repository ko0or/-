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
	String QUERY = "";

	final String CLASS_NAME = "oracle.jdbc.driver.OracleDriver";
	final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	final String ID = "scott";
	final String PW = "tiger";
	
%>

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





<table>
	<tr>
		<td></td>
		<td></td>
	</tr>
</table>



<table width="400"  border="1">

	<tr>
		<td>아이디</td>
		<td>이름</td>
		<td>등급</td>
		<td>전화번호</td>
	</tr>
	

<%
	
	try {
	
		QUERY = "SELECT * FROM MEMBER2";
		rs = stmt.executeQuery(  QUERY );
	
	while ( rs.next() ) {
		
%>

	<tr> 	
<%-- 		<td><%= rs.getString("ID") %></td> --%>
		
<!-- 		ID 출력 + 쿼리스트링 [키: id,  벨류: rs.getString("ID") ] -->
		<td>
			<a href="../chapter13/updateMember.jsp?id=<%= rs.getString("ID") %>">
				<%= rs.getString("ID") %>
			</a>
		</td>
		
<!-- 		이름 출력 -->
		<td><%= rs.getString("NAME") %></td>
		
<!-- 		교수 or 학생 출력 -->
		<td>
			<% 
			
				int n_class = rs.getInt("CLASS");
			
				if ( n_class == 1 ) {
					out.print("일반회원");
				} else {
					out.print("교수님");
				}
			
			%>
		</td>
		<td><%= rs.getString("TEL") %></td>	
	</tr>

<%
		
		
	} // ~~~ while 반복문 종료
	
	
	
	
	// 에러발생시 예외처리 ▼
	} catch (SQLException se) {
		se.printStackTrace();
	
	} finally {
	
		try { 
			if (rs != null) { rs.close(); }
			if (stmt != null) { stmt.close(); }
			if (conn != null) { conn.close(); }
		
		} catch(SQLException e) { e.printStackTrace();  }

	}
	
	
%>

</table>