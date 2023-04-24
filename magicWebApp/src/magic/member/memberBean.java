package magic.member;


/* 		===== 회원정보 저장용 =====		 */
public class memberBean {

//	빈 프로퍼티 (Bean Property)
	private String MEM_UID;
	private String MEM_PWD;
	private String MEM_NAME;
	private String MEM_EMAIL;
	private String MEM_ADDRESS;
	
	
	
	
	
	
//	게터 + 세터
	public String getMEM_UID() {
		return MEM_UID;
	}
	public String getMEM_PWD() {
		return MEM_PWD;
	}
	public String getMEM_NAME() {
		return MEM_NAME;
	}
	public String getMEM_EMAIL() {
		return MEM_EMAIL;
	}
	public String getMEM_ADDRESS() {
		return MEM_ADDRESS;
	}
	public void setMEM_UID(String mEM_UID) {
		MEM_UID = mEM_UID;
	}
	public void setMEM_PWD(String mEM_PWD) {
		MEM_PWD = mEM_PWD;
	}
	public void setMEM_NAME(String mEM_NAME) {
		MEM_NAME = mEM_NAME;
	}
	public void setMEM_EMAIL(String mEM_EMAIL) {
		MEM_EMAIL = mEM_EMAIL;
	}
	public void setMEM_ADDRESS(String mEM_ADDRESS) {
		MEM_ADDRESS = mEM_ADDRESS;
	}

	
	
}
