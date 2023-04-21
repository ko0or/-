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
	
// 데이터베이스 연결하기위해 필요한 정보들
	
	DataSource ds = null;
	Connection conn = null;
	PreparedStatement pstmt = null;
// 	ResultSet rs = null;

%>

<!-- ------------------------------------------------------------------------------------  -->
<%

// =======   DBCP 연동하기   ======= 
	
try {	

//			Context ctx = new InitialContext();
//			ds = (DataSource) ctx.lookup("java:comp/env/jdbc/oracle");
//			conn = ds.getConnection();
		

			
	conn = ((DataSource) (new InitialContext().lookup("java:comp/env/jdbc/oracle"))).getConnection();
	
	} catch (NamingException ne) { ne.printStackTrace(); 	
	} catch (SQLException se) { se.printStackTrace();
}
%>
<!-- ------------------------------------------------------------------------------------  -->

<%



try { 		
			
			/* =======   정보갱신 준비   =======  */
					
//		객체생성
			StringBuffer updateQuery = new StringBuffer();
			updateQuery.append("UPDATE MEMBER2 ")
			                        .append("SET NAME = ?, CLASS = ?, TEL = ? ")
			                        .append("WHERE ID = ?");			
			
//		넘어온 값들 매핑해주기
			String id="", name="", tel="";
			int vclass = 0;
			
			id = request.getParameter("id");
			tel = request.getParameter("tel");
			name = request.getParameter("name");
			vclass = Integer.parseInt( request.getParameter("mclass") );
			
//		매핑된 정보로 갱신요청하기
			pstmt = conn.prepareStatement( updateQuery.toString() );
			pstmt.setString( 1 , name );
			pstmt.setInt( 2 , vclass );
			pstmt.setString( 3 , tel );
			pstmt.setString( 4 , id  );
			
			
//		갱신이 잘되었는지 확인
			if ( pstmt.executeUpdate() > 0 ) {%>
			
				<%= id %> 님의 정보가 수정되었습니다.
				[<a href="../chapter12/viewMember.jsp">목록보기</a>]
			<%
			} else { %>
				
				변경 실패
			
			<%
			}
%>









<!-- ------------------------------------------------------------------------------------  -->

<%

// 			if (rs != null) { rs.close(); }
		if (pstmt != null) { pstmt.close(); }
		if (conn != null) { conn.close(); }
		
		
	
	} catch (Exception e) {%>
	
		서버 불량 잠시 후 다시 시도
		
	<%
	}
%>