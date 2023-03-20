public class ArrayParameterEx {
	
	// [5] 공백을 쉼표로 바꾸는 메소드
	static void replaceSpace(char a[]) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == ' ') {
				a[i] = ',';
			}
			
		}
	}
	
	
	// [2] 호출되는 메소드
	static void printCharArray(char a[]) {
		
		// [3] 매개변수 크기만큼 반복 :  배열 원소출력
		for (int i = 0; i < a.length; i++) {
			System.out.print( a[i] );
		}  
		
		// 끝나면 줄바꿈
		System.out.println();
		
		
	}
	
	public static void main(String[] args) {		
		char c[] = {
				'T', 'h',  'i',  's',  ' ',  'i',  's',  ' ',  'a',  ' ',
				'p',  'e',  'n',  'c',  'i',  'l',  '.' 
		};
		
		// [1] 메소드 호출
		printCharArray(c);
		
		// [4] 메소드 호출
		replaceSpace(c);
		printCharArray(c);
		
		
	}
}
