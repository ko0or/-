public class TV {
	
	// 생성자 
	TV (String 제조사, int 제조연도, int 인치) {
		this.제조사 = 제조사;
		this.제조연도 = 제조연도;
		this.인치 = 인치;
	}
	
	// 맴버변수 
	String 제조사;
	int 제조연도;
	int 인치;
	
	// 맴버함수	
	void show() {
		System.out.println(
											   	this.제조사 		+ "에서 만든 "  
												+ this.제조연도 	+ "년형 " 
												+ this.인치 			+ "인치 TV"
										   );
	}
	// ---------------------------------------------------->>>>
	
	
	// main  -★
	public static void main(String[] args) {

	TV myTV = new TV("LG", 2017, 32); 
	myTV.show();	
	
	
	
	}
}
