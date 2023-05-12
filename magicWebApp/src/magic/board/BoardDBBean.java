package magic.board;

import java.net.InetAddress;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.InitialContext;
import javax.sql.DataSource;


public class BoardDBBean {
	// ============================================================== >>>
	/*	
			*. BoardDBBean 안에서 공용으로 사용하는 정보들
			
			-- 기본생성자(NoArgumnet) : 
			외부에서 나를 생성했을때, 바로 데이터베이스로 연결되도록 동작.
			 따라서, 생성될때 DBCP 연결하는 getConnection() 호출
			 
			-- 전역변수 6개 : 	
			sql  ,  rs   ,   conn   ,   stmt, pstmt , pageSet
			
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
	private static Statement stmt = null;
	private static PreparedStatement pstmt = null;
	private static ResultSet pageSet = null;

	

	
	/* ====  [공통] DBCP 를 사용하기위한 기본 메소드   ====  */			
	public Connection getConnection() throws Exception {
	    return ((DataSource) new InitialContext().lookup("java:comp/env/jdbc/oracle")         
        ).getConnection();
	}
		
	/* === [공통] 자원사용후 반납하기 위한 메소드 === */
	private void returnOfResource() {
		try {
			
			if (rs != null) rs.close();
			if (stmt != null) stmt.close();
			if (pageSet != null) pageSet.close();
			if (pstmt != null) pstmt.close();
			if (conn != null) conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		


/*	============================================================== >>>
		*. 메소드 정보
			*. DBCP 연결 : getInstance()
			*. 자원반납 : returnOfResource()
			*. 보드빈 ResultSet 결과로 전체세팅 : setBoardBean() 
		
			1. 게시글 추가 : insertBoard(BoardBean타입)
			
			2. 게시글 모두 반환 : listBoard()
			3. 게시글 단일 반환 : getBoard(BoardBean타입, Boolean타입)
			ㄴ Boolean타입 매개변수는 단일 게시글정보를 호출할때 조회수 증가여부 !
			
			4. 게시글 갱신 : updateBoard(BoardBean타입)
			5. 게시글 삭제 : deleteBoard(BoardBean타입)
============================================================== */

	
	/* ====  전역변수 rs 값으로 BoardBean 주입하는 역할   ====  */
	public BoardBean setBoardBean() throws SQLException {
		
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
		
		board.setB_fname( rs.getNString("B_FNAME") );
		board.setB_fsize( rs.getInt("B_FSIZE") );
		board.setB_rfname( rs.getNString("B_RFNAME") );
		
		return board;
	}
	
	/* ====  게시글 추가하는 메소드 [ 성공시 1,  실패시 -1 반환 ]   ====  */
	public int insertBoard(BoardBean board) {
		
	    int re = -1;
	    int id = board.getB_id();
	    int ref = board.getB_ref();
	    int step = board.getB_step();
	    int level = board.getB_level();

	    try {

	        if (id != 0) {
	        	/* === 만약 게시글 번호가 존재한다면 ( 답변작성일경우 ) === */
	            
	        	// 나와 같은 그룹글이면서 and 기존글보다 step이 큰 값들은 (이후값들) +1씩 증가시켜준다 (뒤로밀기)
	        	// *. 기존글 step은 게시글 작성화면에서 pk값이 널이 아닐떄 getBoard() 로 이곳에 가져와서 사용하는거 !
	        	sql = "UPDATE boardT SET b_step = b_step+1 WHERE b_ref = ? AND b_step > ?";
	            pstmt = conn.prepareStatement(sql);
	            pstmt.setInt(1, ref);
	            pstmt.setInt(2, step);
	            pstmt.executeUpdate();

	            ref = board.getB_ref();
	            step = step + 1; // write_ok.jsp 에서 b_id 값이 0이 아닐경우 getBoard로 기존 step 값을 불러왔었는데,  그걸 +1 해준다 !
	            level = level + 1;

	        } else {
	        	/* === 새로 작성하는 글일경우  === */
	            sql = "SELECT COUNT(B_ID)+1 FROM boardT";
	            pstmt = conn.prepareStatement(sql);
	            rs = pstmt.executeQuery();
	            
	            if ( rs.next() ) {
	            	ref = rs.getInt(1);
	            }
	            step = 0;
	            level = 0;
	        }

	        /* === (공통) 답변이든, 아니든 관계없이 무조건 실행 === */
//	        sql = "INSERT INTO boardT VALUES((SELECT NVL(MAX(B_ID), 0) FROM boardT)+1, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	        sql = "INSERT INTO boardT VALUES((SELECT NVL(MAX(B_ID), 0) FROM boardT)+1";
	        for (int i=0; i < 14; i++) { sql += ", ? "; } sql +=")";
	        
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
	        
	        pstmt.setString(12, board.getB_fname());
	        pstmt.setInt(13, board.getB_fsize());
	        pstmt.setString(14, board.getB_rfname());

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
	public ArrayList<BoardBean> listBoard(String pageNumber) {

        // 페이징및 게시글 목록반환에 필요한 변수들
		ArrayList<BoardBean> boardList = new ArrayList<BoardBean>();
		int dbCount=0; 
		int absolutePage=1; 

        // 쿼리문 준비
		String sqlSelectAll = "SELECT * FROM boardT ORDER BY B_REF DESC, B_STEP asc";
		String sqlCount = "SELECT COUNT(B_ID) FROM boardT";				

		
		try {

            /* ========================================================
            ==>> [출력 준비] 게시글 전체 개수와 일련번호 부여 방법 
            ========================================================  */
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			pageSet = stmt.executeQuery( sqlCount ); 
						
			// DB에 저장된 게시글 총개수 저장
			if (pageSet.next()) {
				dbCount = pageSet.getInt(1);
				pageSet.close();
			}
			
			// 페이지마다, 미리 정해둔 개수(BoardBean.pageSize)만큼 표시
			if (dbCount % BoardBean.pageSize == 0) { 
				BoardBean.pageCount = dbCount / BoardBean.pageSize;
			} else { 
				BoardBean.pageCount = dbCount / BoardBean.pageSize + 1;
			}
			
            // 페이지 단위로 게시글 일련번호 부여하기 ( 페이지 1일땐 1부터, 2일땐 11부터, 3일땐 21부터 .. )
			if (pageNumber != null) {
				BoardBean.pageNumber = Integer.parseInt(pageNumber);
				absolutePage = (BoardBean.pageNumber - 1) * BoardBean.pageSize + 1;
			}
			


            /* ========================================================
            ==>> [출력하기] 준비된 일련번호 부여 + 화면에 게시글 표시
            ========================================================  */
			rs = stmt.executeQuery( sqlSelectAll ); 			
			if ( rs.next() ) {
				rs.absolute(absolutePage);

				// 조회된 게시글 갯수만큼 반복 (페이지변경처리 로직포함)
				for(int count=0; count < BoardBean.pageSize; count++) { 

					boardList.add( setBoardBean() );
					if (rs.isLast()) { break; }
					else { rs.next(); }					

				}
			}
			

        /* ========================================================
        ==>> [마무리] 예외처리 
             + returnOfResource() 메소드 이용해서 자원반납하기 
        ========================================================  */
		} catch (Exception e) { e.printStackTrace(); } 
		finally { returnOfResource(); }
		
		return boardList;
	
}
	
	
	/* ====  단일 게시글 정보를 반환하는 메소드   ====  */
	public BoardBean getBoard(int boardPK, boolean isRead) {
		
		BoardBean board = null;
		
		try {			
			
			sql = "SELECT * FROM boardT WHERE B_ID = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt( 1,boardPK );
			rs = pstmt.executeQuery();			
			
			if ( rs.next() ) {
				
				board = setBoardBean();
				
				if ( isRead ) {
					sql = "UPDATE boardT SET B_HIT = ? WHERE B_ID = ?";
					pstmt = conn.prepareStatement(sql);
					pstmt.setInt( 1 , rs.getInt("B_HIT") + 1 );
					pstmt.setInt( 2 , rs.getInt("B_ID") );
					pstmt.executeUpdate();
				}
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		
			// 자원반납
			returnOfResource();
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
	
	
	
	
	
	
	/* ====  ... ??  ====  */
	public BoardBean getFileName(int boardPK) {
		BoardBean board = null;
		
		try {
		
			sql = "SELECT b_fname, b_rfname FROM boardT WHERE b_id = ? ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt( 1 , boardPK );
			rs = pstmt.executeQuery();
			
			if ( rs.next() ) {
				board = new BoardBean();
				board.setB_fname( rs.getString("b_fname") );
				board.setB_rfname( rs.getString("b_rfname") );
				return board;
			}
		
		} catch (Exception e) { e.printStackTrace();
		} finally { returnOfResource(); }
		return null;
	}
}
