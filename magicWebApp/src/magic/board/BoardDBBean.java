package magic.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;


public class BoardDBBean {

	/* ====  [공통] DBCP 를 사용하기위한 기본 메소드및 전역변수   ====  */		
	private static BoardDBBean instance = new BoardDBBean();
	
	public static BoardDBBean getInstance() {
		return instance;
	}

	public Connection getConnection() throws Exception {
		Context ctx = new InitialContext();
		DataSource ds = (DataSource) ctx.lookup("java:comp/env/jdbc/oracle");
		return ds.getConnection(); 				
	}
	
	
	
// ============================================================== >>>
	
	
	
	/* ====  게시글 추가하는 메소드 [ 성공시 1,  실패시 -1 반환 ]   ====  */
	public int insertBoard(BoardBean board) {
		
		String sql = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		int re = -1;
		int pk = 0;
		
		try {
			
			// [ 1 ] DB 연결
			conn = getConnection();
			
			// [ 2 ] PK값에는 COUNT() 그룹함수 +1 해서 맨 뒤에 값 추가해주기
			sql = "INSERT INTO boardT VALUES( (SELECT COUNT(B_ID) FROM boardT)+1  , ? , ? , ? , ? )";
			pstmt = conn.prepareStatement(sql);
			
			// [ 3 ] PK 제외한 나머지 값 할당 + DB에 저장
			pstmt.setString( 1 , board.getB_name()  );
			pstmt.setString( 2 , board.getB_email()  );
			pstmt.setString( 3 , board.getB_title()  );
			pstmt.setString( 4 , board.getB_content()  );
			re = pstmt.executeUpdate();
			
			// [ 4 ] 자원반납
			pstmt.close();
			conn.close();			
			
		} catch (SQLException e) { e.printStackTrace(); 
		} catch (Exception e) { e.printStackTrace(); }		
		
		return re;
	}
			
	
	
	
	
	
}
