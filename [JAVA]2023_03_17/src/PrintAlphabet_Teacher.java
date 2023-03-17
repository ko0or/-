import java.util.Scanner;

public class PrintAlphabet_Teacher {
	public static void main(String[] args) {
		
		
		
		// 소문자 입력받기
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("소문자 알파벳 하나를 입력하시요>> ");
		 String s = scanner.next();
		 char c = s.charAt(0);
		 
		 for (char i = c; i >= 'a'; i--) { 		
			 for (char j = 'a'; j <= i; j++) {
				 System.out.print(j);
			 }
			 System.out.println();
		 }

		
		 scanner.close();
		
	}
}
