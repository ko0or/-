package Chapter02;

import java.util.Scanner;

public class Won2Dollar {
	public static void main(String[] args) {
		
		// 내가 작성했던 메소드
		toDollar();
		
		// 강사님이 작성해주신 메소드
		
		
	}
	
	
	/* 내가 작성했던 소스코드 */
	public static void toDollar() {
		// 준비
		Scanner stdin = new Scanner(System.in);
		
		// 입력받기
		System.out.print("원화를 입력하세요(단위 원)>> ");
		int onehwa = stdin.nextInt();
		
		// 계산
		double dollar = onehwa/1100;
		
		// 출력
		System.out.println( onehwa + "원은  $" + dollar + "달러 입니다." );
	}
	
	
	
	/* 강사님이 작성해주신 소스코드 */
	public static void Teacher() {
		
		
		
		
	}
	
	
	
	
}
