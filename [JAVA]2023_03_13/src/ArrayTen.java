import java.util.Scanner;
// 10개의 정수를 배열로 입력받고, 합계를 출력하라
public class ArrayTen {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int intArray[] = new int[10];
		int sum = 0;
		
		/* 내가 작성한 코드
		System.out.print("10개의 정수를 입력하세요 >> ");
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = scanner.nextInt();
			sum += intArray[i];
		}
		System.out.println("합계는 " + sum );
		*/
		

		
		// 강사님 ver
		System.out.print(intArray.length + "개의 정수를 입력하세요>> ");
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = scanner.nextInt();
			sum += intArray[i];
		}
		System.out.println("합계는 " + sum );
		 
		
		scanner.close();
	}
}
