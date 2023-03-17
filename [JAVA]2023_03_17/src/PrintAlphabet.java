import java.util.Scanner;

public class PrintAlphabet {
	public static void main(String[] args) { 
		
		// 스캐내 객체생성 + 영어알파벳 배열만들기 !
		Scanner scanner = new Scanner(System.in);
		char english[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		
		
		// 입력받기
		System.out.print("소문자 알파벳 하나를 입력하시요>> ");
		String findMe = scanner.next();
		
		
		// 단어 모두 검사
		for (int count = 0; count < english.length; count++) {
			
			// 만약, 일치하는 단어가 발견되었다면 .. !
			if ( english[count] == findMe.charAt(0) ) {

				// row  = 반복된 횟수 ,  	column = 1씩 감소하게되는 row 
				for (int row=count; row > 0; row--) {
				for (int column=0; column<row; column++) { 
						System.out.print( english[column] );
					}
					// row 가 넘어갈때마다 줄 바꿔주기 : )
					System.out.println(); 
				}
				
			} // .. 조건문 종료
		} // .. 반복문 종료 
		
		
		scanner.close();
		
	}
}
