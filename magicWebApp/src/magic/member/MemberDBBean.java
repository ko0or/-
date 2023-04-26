package magic.member;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;


/* 		===== 회원정보 처리용 =====		 */
public class MemberDBBean {
	
//	jsp 소스에서 빈 객체 생성을 위한 참조변수
	private static MemberDBBean instance = new MemberDBBean();

	
	
//	1 ) MemberDBBean 객체 레퍼런스를 리턴하는 메소드
	public static MemberDBBean getInstance() {
		return instance;
	}
	
//	2 ) 쿼리작업에 사용할 커넥션 객체를 리턴하는 메소드 (DBCP)
	public Connection getConnection() throws Exception {
		Context ctx = new InitialContext();
		DataSource ds = (DataSource) ctx.lookup("java:comp/env/jdbc/oracle");
		return ds.getConnection(); 				
	}
	
	
// ============================================================== >>>
	
//	3 ) 전달받은 인자로 member를 memberT 텓이름에 삽입하는 메소드
	public int insertMember(memberBean member) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO boardT VALUES( ? , ? , ? , ? , ? )";
		int re = -1; // 초기값 -1, insert 정상적으로 실행되면 1
		
		try {
			
//			dbcp 기법의 연결객체
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString( 1 , member.getMEM_UID() );
			pstmt.setString( 2 , member.getMEM_PWD() );
			pstmt.setString( 3 , member.getMEM_NAME() );
			pstmt.setString( 4 , member.getMEM_EMAIL() );
			pstmt.setString( 5 , member.getMEM_ADDRESS() );
			pstmt.executeUpdate();
			
			re = 1;
			
			pstmt.close();
			conn.close();
			System.out.println("추가 성공");
			
		} catch (Exception e) {
			System.out.println("추가 실패");
			e.printStackTrace();
		}			
		
		return re;
	}
	
	
	
//	4 ) 회원 가입시 아이디 중복 확인할 때 사용하는 메소드
	public int confirmID(String id) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT MEM_UID FROM memberT WHERE MEM_UID = ?";
		int re = -1; // 초기값 -1, 아이디가 중복되면 1;
		
		try {
			
//			dbcp 기법의 연결객체
			conn = getConnection();
			
//			쿼리 날림
			pstmt = conn.prepareStatement(sql);
			pstmt.setString( 1 , id );
			
//			결과받음
			rs = pstmt.executeQuery();
			
			
			/* === [분기처리] 값이 존재하는지 === */
			if ( rs.next() ) { 
				re = 1;
			} else {
				re = -1;
			}
			
			rs.close();
			pstmt.close();
			conn.close();
		
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		return re;
	}
	
	
	
// ============================================================== >>>
	
//	5 ) 사용자 ID, PW 검증하는 메소드 [ 초기값 -1, 비밀번호 불일치시 0, 비밀번호 일치시 1 ]
	public int userCheck(String id, String pwd) {
		
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT MEM_PWD FROM memberT WHERE MEM_UID = ?";
		int re = -1; // 초기값 -1, 비밀번호 불일치시 0, 비밀번호 일치시 1
		
		try {
			
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString( 1 , id );
			rs = pstmt.executeQuery();
			
			if ( rs.next() ) {
				
				/*   ===== USER ID를 통해서 갖고온 PW가 일치하는지  ===== */
				if ( rs.getString("MEM_PWD").equals(  pwd  ) == true ) {
				
					re = 1;
				
				/*   ===== ID는 맞지만, PW가 틀렸을때  ===== */
				} else {
					
					re = 0;
					
				}
			
			
/*   ===== [비가입자] ID에 해당하는 정보가 없을때  ===== */
			} else {
				re = -1;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return re;
	}
	
	
//	6) 아이디가 일치하는 맴버의 정보를 얻어오는 메소드
	public memberBean getMember(String id) {
		
		memberBean member = null;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT "
				+ "MEM_UID, MEM_PWD, MEM_NAME, MEM_EMAIL, MEM_ADDRESS "
				+ "FROM memberT WHERE MEM_UID = ?";
		
		try {
			
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString( 1 , id );
			rs = pstmt.executeQuery();
			
			if ( rs.next() ) {
				
				member = new memberBean();
				member.setMEM_UID( rs.getString("MEM_UID") );
				member.setMEM_PWD( rs.getString("MEM_PWD") );
				member.setMEM_NAME( rs.getString("MEM_NAME") );
				member.setMEM_EMAIL( rs.getString("MEM_EMAIL") );
				member.setMEM_ADDRESS( rs.getString("MEM_ADDRESS") );

			}
			
			rs.close();
			pstmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
		
		
		return member;
	}
	
	
	
	// ============================================================== >>>
	
	/*   ===== [업데이트, 갱신] memberUpdate.jsp 에서 요청한 업데이트 요청 처리  ===== */
	public int updateMember(memberBean member) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		StringBuffer sql = new StringBuffer();
		sql.append("UPDATE memberT ")
		     .append("SET ")
		     .append("MEM_PWD=?,MEM_EMAIL=?,MEM_ADDRESS=? ")
		     .append("WHERE MEM_UID=?");
		int re = -1; // 초기값 -1, 변경된 행 갯수 1

		try {
			
//			dbcp 기법의 연결객체
			conn = getConnection();
			
//			쿼리 날림
			pstmt = conn.prepareStatement( sql.toString() );
			pstmt.setString( 1 , member.getMEM_PWD() );
			pstmt.setString( 2 , member.getMEM_EMAIL() );
			pstmt.setString( 3 , member.getMEM_ADDRESS() );
			pstmt.setString( 4 , member.getMEM_UID() );
			re = pstmt.executeUpdate();
		
			pstmt.close();
			conn.close();
			
//		실패시 예외처리
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("변경 실패");
		}
		
		
		return re;
	}
	

}
