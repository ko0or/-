import java.util.Scanner;

public class InputException {
/*
	정수 3개 입력받음
	정수가 아닌경우 패스
	3개의 합 출력
	예외처리 이용
 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 3개를 입력하세요.");
		int sum = 0, n = 0;

		for (int i = 0; i < 3; i++) {
		
			try {
				System.out.print(i + " >> ");
				n = scanner.nextInt();
				sum += n;
			
			// InputMismatchException
			} catch (Exception e) {
				System.out.println("숫자만 입력가능합니다. (오류내용: " + e.getClass() + ")" );
				scanner.next();
				i--;
			}
			
		}
		
		System.out.println( "합은 " + sum );
		scanner.close();
		
		
	}
}
