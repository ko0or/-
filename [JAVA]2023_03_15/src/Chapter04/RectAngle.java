package Chapter04;

import java.util.Scanner;

public class RectAngle {
	
	
	/* 클래스 필드 (맴버변수) */
	int width;
	int height;
	
	/* 맴버함수 (메소드) */
	public int getArea() { return width*height; }
	// =================================================>>>>
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 선언, 생성 같이해버림
		RectAngle rect = new RectAngle(); /* 맴버 3개 ( 맴버변수 2개, 맴버함수 1개 ) */
		
		// 스캐너로 입력받은 값을 맴버변수에 할당해주기
		System.out.print(">> ");
		rect.width = scanner.nextInt(); 	
		rect.height= scanner.nextInt();	
		
		// 입력받은 결과를 맴버함수를 통해 출력
		System.out.println( "사각형의 면적은 " + rect.getArea() );
				
		
		
		
		
		scanner.close();		
	}
}
