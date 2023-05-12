package magic.board;

import java.sql.Timestamp;

public class BoardBean {

//	빈 프로퍼티 1
	public static int pageSize = 10; // 한 페이지당 10개씩 출력
	public static int pageCount= 1; // 총 페이지 갯수
	public static int pageNumber = 1;   // 현재 페이지번호
	
	/* === 리턴 : [ 이전 ] + 페이지번호 + [다음] === */
	/* === 매개변수 limit -> 페이지네이션 출력갯수  === */
	public static String pageButtons(int limit) {
		String str = "";
		int temp = (pageNumber-1) % limit; //  0 
		int startPage = pageNumber - temp; // 1
		
		// [이전] 출력여부
		if ((startPage - limit) > 0) { // 1-4 > 0 ? 거짓 , 그래서 출력되지않는다
			str = "<a href='list.jsp?page="+(startPage-1)+"'>[이전]</a>" + "&nbsp&nbsp";
		}
		
		// 페이지번호 나열하기
		for (int i=startPage; i < (startPage+limit);  i++) { // (startPage+limit) -> 1+4 -> 5
			
			if ( i == pageNumber ) { // 같은 페이지일때
				str += "[" + pageNumber  +"]" + "&nbsp&nbsp";
				/* === 요기서 오류 나면 -> str += "[" + i  +"]" + "&nbsp&nbsp"; 로 대체하기 === */
				
			} else { // 다른 페이지일때
				str += "<a href='list.jsp?page=" + i + "'>" + "[" + i + "]</a>" + "&nbsp&nbsp";
			}			
			if ( i >= pageCount) break;

		}

		// [다음] 출력여부
		if ((startPage + limit) <= pageCount ) {
			str += "<a href='list.jsp?page="+(startPage+limit)+"'>[다음]</a>" + "&nbsp&nbsp";
		}
		
		return str;
	}
	
	
//	빈 프로퍼티 2
	private int b_id;
	private String b_name; 
	private String b_email; 
	private String b_title; 
	private String b_content;
	private Timestamp b_date;
	private int b_hit;
	private String b_pwd;
	private String b_ip;
	
	private int b_ref;
	private int b_step;
	private int b_level;
	
	private String b_fname;
	private int b_fsize;
	private String b_rfname;
	
	
	
	
	//	게터
	public int getB_id() { return b_id; }
	public String getB_name() { return b_name; }
	public String getB_email() { return b_email; }
	public String getB_title() { return b_title; }
	public String getB_content() { return b_content; }
	public Timestamp getB_date() { return b_date; }
	public int getB_hit() { return b_hit; }
	public String getB_pwd() { return b_pwd; }
	public String getB_ip() { return b_ip; }
	public int getB_ref() { return b_ref; }
	public int getB_step() { return b_step; }
	public int getB_level() { return b_level; }
	public String getB_fname() { return b_fname; }
	public int getB_fsize() { return b_fsize; }
	public String getB_rfname() { return b_rfname; }
	
//	세터
	public void setB_id(int b_id) { this.b_id = b_id; }
	public void setB_name(String b_name) { this.b_name = b_name; }
	public void setB_email(String b_email) { this.b_email = b_email; }
	public void setB_title(String b_title) { this.b_title = b_title; }
	public void setB_content(String b_content) { this.b_content = b_content; }
	public void setB_date(Timestamp b_date) { this.b_date = b_date; }
	public void setB_hit(int b_hit) { this.b_hit = b_hit; }
	public void setB_pwd(String b_pwd) { this.b_pwd = b_pwd; }
	public void setB_ip(String b_ip) { this.b_ip = b_ip; }
	public void setB_ref(int b_ref) { this.b_ref = b_ref; }
	public void setB_step(int b_step) { this.b_step = b_step; }
	public void setB_level(int b_level) { this.b_level = b_level; }
	public void setB_fname(String b_fname) { this.b_fname = b_fname; }
	public void setB_fsize(int b_fsize) { this.b_fsize = b_fsize; }
	public void setB_rfname(String b_rfname) { this.b_rfname = b_rfname; }

	
	@Override
	public String toString() {
		return "BoardBean [b_id=" + b_id + ", b_name=" + b_name + ", b_email=" + b_email + ", b_title=" + b_title
				+ ", b_content=" + b_content + ", b_date=" + b_date + ", b_hit=" + b_hit + ", b_pwd=" + b_pwd
				+ ", b_ip=" + b_ip + ", b_ref=" + b_ref + ", b_step=" + b_step + ", b_level=" + b_level + ", b_fname="
				+ b_fname + ", b_fsize=" + b_fsize + "]";
	}
	

}
