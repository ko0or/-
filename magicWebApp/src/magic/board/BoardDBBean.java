package magic.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;


public class BoardDBBean {

// ============================================================== >>>
/*	
		*. 메소드 정보
			1. 게시글 추가 : insertBoard()
			2. 게시글 모두 반환 : listBoard()
			3. 게시글 단일 반환 : getBoard()
	
*/
// ============================================================== >>>
	
	
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
			sql = "INSERT INTO boardT VALUES( (SELECT COUNT(B_ID) FROM boardT)+1  , ? , ? , ? , ? , ? )";
			pstmt = conn.prepareStatement(sql);
			
			// [ 3 ] PK 제외한 나머지 값 할당 + DB에 저장
			pstmt.setString( 1 , board.getB_name()  );
			pstmt.setString( 2 , board.getB_email()  );
			pstmt.setString( 3 , board.getB_title()  );
			pstmt.setString( 4 , board.getB_content()  );
			pstmt.setTimestamp(5, new Timestamp(System.currentTimeMillis()));
			re = pstmt.executeUpdate();
			
			// [ 4 ] 자원반납
			pstmt.close();
			conn.close();			
			
		} catch (SQLException e) { e.printStackTrace(); 
		} catch (Exception e) { e.printStackTrace(); }		
		
		return re;
	}
			
	
	/* ====  게시글 목록을 반환하는 메소드   ====  */
	public ArrayList<BoardBean> listBoard(int pageNumber) {
		
		String sql = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<BoardBean> boards = new ArrayList<>();
		
		try {
			
			conn = getConnection();			

			sql = "SELECT *  FROM"
					+ " ( "
					+ "SELECT ROWNUM rnum, t.* "
					+ "FROM (SELECT * FROM boardT ORDER BY B_ID DESC) t "
					+ ") "
					+ "WHERE rnum BETWEEN ? AND ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt( 1 , pageNumber == 1 ? 1 : pageNumber * 10 -9 );
			pstmt.setInt( 2 , pageNumber*10 );
			rs = pstmt.executeQuery();
			
			while ( rs.next() ) {
				
				BoardBean board = new BoardBean();
				board.setB_id(rs.getInt("B_ID") );
				board.setB_email( rs.getString("B_EMAIL") );
				board.setB_name( rs.getString("B_NAME") );
				board.setB_title( rs.getString("B_TITLE") );
				board.setB_content( rs.getString("B_CONTENT") );
				board.setB_date( rs.getTimestamp("B_DATE") );
				
				boards.add( board );				

			}
			
			rs.close();
			pstmt.close();
			conn.close();			
			
		} catch (SQLException e) { e.printStackTrace(); 
		} catch (Exception e) { e.printStackTrace(); }		
		
		return boards;
	}
	
	
	/* ====  단일 게시글 정보를 반환하는 메소드   ====  */
	public BoardBean getBoard(int boardPK) {
		BoardBean board = new BoardBean();
		
		String sql = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			
			conn = getConnection();			
			sql = "SELECT * FROM boardT WHERE B_ID = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt( 1,boardPK );
			rs = pstmt.executeQuery();
			
			
			
			if ( rs.next() ) {
				
				board.setB_id(rs.getInt("B_ID") );
				board.setB_email( rs.getString("B_EMAIL") );
				board.setB_name( rs.getString("B_NAME") );
				board.setB_title( rs.getString("B_TITLE") );
				board.setB_content( rs.getString("B_CONTENT") );
				board.setB_date( rs.getTimestamp("B_DATE") );
			}
			
			rs.close();
			pstmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return board;
	}
	
	/* ====  게시글 정보 업데이트 [ 성공시 1반환, 실패시 -1 반환 ]   ====  */
	public int updateBoard(BoardBean board) {
		
		String sql = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = -1;
		
		try {
			
			conn = getConnection();			
			sql = "UPDATE boardT SET B_TITLE = ?, B_CONTENT = ? WHERE B_ID = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString( 1 , board.getB_title() );
			pstmt.setString( 2 , board.getB_content() );
			pstmt.setInt( 3 , board.getB_id() );
			result = pstmt.executeUpdate();

			pstmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return result;
	}
}
