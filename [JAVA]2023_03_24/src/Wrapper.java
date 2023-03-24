public class Wrapper {
	public static void main(String[] args) {
		
		char c1='4', c2='F';
		
		// isDigit 숫자 체크하는 메소드 (Chracter Wrapper 클래스)
		if (Character.isDigit(c1)) {
			System.out.println("숫자다 !");
		} else { System.out.println("숫자가 아니였어 .. !"); }
		
		// isDigit 숫자 체크하는 메소드 (Chracter Wrapper 클래스)
		if (Character.isDigit(c2)) {
			System.out.println("숫자다 !");
		} else { System.out.println("숫자가 아니였어 .. !"); }
		
		// isAlphabetic 영문자 체크하는 메소드 (Chracter Wrapper 클래스)
		if (Character.isAlphabetic(c2)) {
			System.out.println("영어문자다 !");
		} else { System.out.println("영어문자가 아니였어 .. !"); }
		
		// isAlphabetic 영문자 체크하는 메소드 (Chracter Wrapper 클래스)
		if (Character.isAlphabetic(c1)) {
			System.out.println("영어문자다 !");
		} else { System.out.println("영어문자가 아니였어 .. !"); }
		
		
		// Integer : Wrapper 클래스,  parseInt 문자열을 정수로 변환
		System.out.println( Integer.parseInt("-123")  );
		System.out.println( Integer.parseInt("-28")  );
		System.out.println( Integer.toHexString(28)  ); 	  // 1c = 16+12=28 (16진수)
		System.out.println( Integer.toBinaryString(28)  ); //  111000=16+8+4=28
		System.out.println( Integer.bitCount(28) );				//   3(111000 -> 1이 3개)
		
		
		Double d = Double.valueOf(3.14);		// 3.14를 포함하는 객체를 가리키는 d 참조변수
		System.out.println( d.toString() );								  // 문자열로 출력
		System.out.println( Double.parseDouble("3.14") );  // 실수 3.14 출력
		
		
		boolean b = (4>3);
		System.out.println( Boolean.toString(b) ); 						// 문자열 true 출력
		System.out.println( Boolean.parseBoolean("true"));		// 문자열을 불린값으로
		
		
	}
}
