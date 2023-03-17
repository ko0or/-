import java.util.Scanner;

public class MutipleOfThree {
	public static void main(String[] args) {
		
		// 객체생성
		Scanner scanner = new Scanner(System.in);
		System.out.print("양의 정수 10개를 입력하시요>> ");
		int intArray[] = new int[10];
		
		// 입력받기
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = scanner.nextInt();
		}
		
		// 3의 배수 출력하기
		System.out.print("3의 배수는 ");
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] %3 == 0) { System.out.print(intArray[i] + " "); }
		}
		
		// 프로그램 종료
		scanner.close();
	}
}
