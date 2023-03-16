public class AfterTest {
	
	// charAt(n) 번째 값이 3, 6, 9인지 확인해서 참, 거짓 형태로 반환해주는 메소드
	static boolean charAtThree(String getString, int index) {
		try {
			if (getString.charAt(index) == '3') return true;
			if (getString.charAt(index) == '6') return true;
			if (getString.charAt(index) == '9') return true;
		} catch (Exception e) { }
		return false;
	}
	
	public static void main(String[] args) {
		
		// 문자열로 확인하는 방법
		for (int i = 0; i < 100; i++) {
			
			int count = 0;
			String  getNumber = Integer.toString( i );

			if (charAtThree( getNumber, 0) ) { count ++; }
			if (charAtThree( getNumber, 1) ) { count ++; }			
			
			if (count == 1) { System.out.println( getNumber + "\t" + "박수한번"); }
			else if (count == 2)  { System.out.println( getNumber + "\t" + "박수두번"); }
				
		} // for 종료
				
		
			
	
		
	}
}
