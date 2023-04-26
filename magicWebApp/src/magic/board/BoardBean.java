package magic.board;

public class BoardBean {

//	빈 프로퍼티
	private int b_id;
	private String b_name; 
	private String b_email; 
	private String b_title; 
	private String b_content;
	
	
//	게터
	public int getB_id() { return b_id; }
	public String getB_name() { return b_name; }
	public String getB_email() { return b_email; }
	public String getB_title() { return b_title; }
	public String getB_content() { return b_content; }
	
//	세터
	public void setB_id(int b_id) { this.b_id = b_id; }
	public void setB_name(String b_name) { this.b_name = b_name; }
	public void setB_email(String b_email) { this.b_email = b_email; }
	public void setB_title(String b_title) { this.b_title = b_title; }
	public void setB_content(String b_content) { this.b_content = b_content; }
	
	@Override
	public String toString() {
		return "BoardBean [b_name=" + b_name + ", b_email=" + b_email + ", b_title=" + b_title + ", b_content="
				+ b_content + "]";
	}
}
