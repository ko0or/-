package magic.board;

import java.net.InetAddress;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;


public class BoardDBBean {
	// ============================================================== >>>
	/*	
			*. BoardDBBean 안에서 공용으로 사용하는 정보들
			
			-- 기본생성자(NoArgumnet) : 
			외부에서 나를 생성했을때, 바로 데이터베이스로 연결되도록 동작.
			 따라서, 생성될때 DBCP 연결하는 getConnection() 호출
			 
			-- 전역변수 4개 : 	
			sql  ,  rs   ,   conn   ,   pstmt
			
			-- 생성자에 의해 호출되는 메소드 getConnection()
			DBCP방식으로 데이터베이스에 연결하는 동작
			
			-- 자원사용후 반납을 간단하게 returnOfResource()
			모든 메소드들에서 사용된이후 자원반납을 해주는 메소드 !
			
	*/
	// ============================================================== >>>
	
	/* === 객체생성시 디비와 연결을 시도하고, 실패시 오류메시지 출력 === */
	public BoardDBBean() { 
		try {
			conn = getConnection();			
		} catch (Exception e) { e.printStackTrace(); }
	}
	
	/* === JDBC를 사용하기위해 필요한 전역변수들 === */
	private static String sql = null;
	private static ResultSet rs = null;
	private static Connection conn = null;
	private static PreparedStatement pstmt = null;

	
	/* ====  [공통] DBCP 를 사용하기위한 기본 메소드   ====  */			

	public Connection getConnection() throws Exception {
		Context ctx = new InitialContext();
		DataSource ds = (DataSource) ctx.lookup("java:comp/env/jdbc/oracle");
		return ds.getConnection(); 				
	}
		
	/* === [공통] 자원사용후 반납하기 위한 메소드 === */
	private void returnOfResource() {
		try {
			
			if ( rs != null ) { rs.close(); }
			if (pstmt != null ) { pstmt.close(); }
			if ( conn != null ) { conn.close(); }
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		

// ============================================================== >>>
/*	
		*. 메소드 정보
			0. DBCP 연결 : getInstance()
		
			1. 게시글 추가 : insertBoard()
			
			2. 게시글 모두 반환 : listBoard()
			3. 게시글 단일 반환 : getBoard()
			
			4. 게시글 갱신 : updateBoard()
			5. 게시글 삭제 : deleteBoard()
*/
// ============================================================== >>>
	
	
	/* ====  게시글 추가하는 메소드 [ 성공시 1,  실패시 -1 반환 ]   ====  */
	public int insertBoard(BoardBean board) {
	    int re = -1;
	    int id = board.getB_id();
	    int ref = board.getB_ref();
	    int step = board.getB_step();
	    int level = board.getB_level();

	    try {
	        conn = getConnection();

	        if (id != 0) {
	            sql = "UPDATE boardT SET b_step = b_step+1 WHERE b_ref = ? AND b_step > ?";
	            pstmt = conn.prepareStatement(sql);
	            pstmt.setInt(1, ref);
	            pstmt.setInt(2, step);
	            pstmt.executeUpdate();

	            ref = board.getB_ref();
	            step = step + 1;
	            level = level + 1;

	        } else {
	            sql = "SELECT COUNT(B_ID)+1 FROM boardT";
	            pstmt = conn.prepareStatement(sql);
	            rs = pstmt.executeQuery();
	            
	            if ( rs.next() ) {
	            	ref = rs.getInt(1);
	            }
	            step = 0;
	            level = 0;
	        }

	        sql = "INSERT INTO boardT VALUES((SELECT NVL(MAX(B_ID), 0) FROM boardT)+1, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	        pstmt = conn.prepareStatement(sql);
	        pstmt.setString(1, board.getB_name());
	        pstmt.setString(2, board.getB_email());
	        pstmt.setString(3, board.getB_title());
	        pstmt.setString(4, board.getB_content());
	        pstmt.setTimestamp(5, new Timestamp(System.currentTimeMillis()));
	        pstmt.setInt(6, 0);
	        pstmt.setString(7, board.getB_pwd());
	        pstmt.setString(8, InetAddress.getLocalHost().getHostAddress());
	        pstmt.setInt(9, ref);
	        pstmt.setInt(10, step);
	        pstmt.setInt(11, level);

	        re = pstmt.executeUpdate();
	        returnOfResource();

	    } catch (SQLException e) {
	        e.printStackTrace();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return re;
	}

			
	
	/* ====  게시글 목록을 반환하는 메소드   ====  */
	public ArrayList<BoardBean> listBoard(int pageNumber) {
		
		ArrayList<BoardBean> boards = new ArrayList<>();
		
		try {

			
			sql = "SELECT *  FROM"
					+ " ( "
					+ "SELECT ROWNUM rnum, t.* "
					+ "FROM (SELECT * FROM boardT ORDER BY b_ref DESC, b_step ASC) t "
					// ORDER BY b_ref DESC, b_step ASC, 최신글 순이고, 답글 순
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
				board.setB_hit( rs.getInt("B_HIT") );
				board.setB_pwd( rs.getString("B_PWD" ));
				board.setB_ip( rs.getString("B_IP") );				
				
				board.setB_ref( rs.getInt("B_REF") );
				board.setB_step( rs.getInt("B_STEP") );
				board.setB_level( rs.getInt("B_LEVEL") );
				
				boards.add( board );				

			}
			
			// 자원반납
			returnOfResource();	
			
		} catch (SQLException e) { e.printStackTrace(); 
		} catch (Exception e) { e.printStackTrace(); }		
		
		return boards;
	}
	
	
	/* ====  단일 게시글 정보를 반환하는 메소드   ====  */
	public BoardBean getBoard(int boardPK, boolean isRead) {
		BoardBean board = new BoardBean();
		
		try {

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
				board.setB_hit( rs.getInt("B_HIT") + 1 );
				board.setB_pwd( rs.getString("B_PWD"));
				board.setB_ip( rs.getString("B_IP") );
				
				board.setB_ref( rs.getInt("B_REF") );
				board.setB_step( rs.getInt("B_STEP") );
				board.setB_level( rs.getInt("B_LEVEL") );
				
				if ( isRead ) {
					sql = "UPDATE boardT SET B_HIT = ? WHERE B_ID = ?";
					pstmt = conn.prepareStatement(sql);
					pstmt.setInt( 1 , rs.getInt("B_HIT") + 1 );
					pstmt.setInt( 2 , rs.getInt("B_ID") );
					pstmt.executeUpdate();
				}
			}
			
			// 자원반납
			returnOfResource();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return board;
	}
	
	/* ====  게시글 정보 업데이트 [ 성공시 1반환, 실패시 -1 반환 ]   ====  */
	public int updateBoard(BoardBean board) {

		int result = -1;
		
		try {
			
			conn = getConnection();			
			sql = "UPDATE boardT SET B_TITLE = ?, B_CONTENT = ? WHERE B_ID = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString( 1 , board.getB_title() );
			pstmt.setString( 2 , board.getB_content() );
			pstmt.setInt( 3 , board.getB_id() );
			result = pstmt.executeUpdate();

			// 자원반납
			returnOfResource();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return result;
	}
	
	/* ====  게시글 삭제 [ 성공시 1반환, 실패시 -1 반환 ]   ====  */
	public int deleteBoard(BoardBean board) {

		int result = -1;
		
		try {
			conn = getConnection();
			sql = "DELETE FROM boardT WHERE B_ID = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt( 1 , board.getB_id() );
			result = pstmt.executeUpdate();

			// 자원반납
			returnOfResource();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return result;
	}
}
