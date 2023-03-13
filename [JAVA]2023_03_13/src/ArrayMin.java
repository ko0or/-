import java.util.Scanner;
public class ArrayMin {
	/*
			양수값을 7개 입력받고,  그중 가장 작은 수를 출력하라 ( ★ 배열을 활용해야한다 )
			
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int intArray[] = new int[7];
		int min = 0;
		
		System.out.println("양수 7개를 입력하세요.");
		
		
		/* 내가 작성한 코드
		
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = scanner.nextInt();
			
			// 음수가 입력되었다면, 양수로 다시 입력해달라고 출력
			if (intArray[i] < 0) { 
				System.out.println("양수로 다시 입력해주세요");
				i --;
				
			// 양수가 입력되었을때 처음일땐 입력값을 저장, 이후부터는 작은 수일때만 저장
			}	else if (min == 0 || min > intArray[i]) { 	min = intArray[i]; 	}
		}
		
		System.out.println("가장 작은 수는 " + min + "입니다.");
		
		*/
		
		
		
		
		// 강사님 ver
		
		// 첫번째 방법 : min = Integer.MAX_VALUE; 사용하기 (최대값)
		// 두번째 방법 : i == 0 일때  min = intArray[i]; 하기
		
		
		
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = scanner.nextInt();
			
			if (intArray[i] < min || i == 0) { 
				min = intArray[i]; 
			}
			
		}
		System.out.println("가장 작은 수는 " + min + "입니다.");
		
		
		
		
		scanner.close();
	}
}
