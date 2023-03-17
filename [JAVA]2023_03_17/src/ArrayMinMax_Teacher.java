import java.util.Arrays;
import java.util.Scanner;
public class ArrayMinMax_Teacher {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int intArray[] = new int[10];
		System.out.println("양수 10개를 입력하세요.");
		
		// int min = Integer.MAX_VALUE;
		int min = 0;
		int max = 0;
		
		//intArray.length : 10 (index:0~9) --> 10번 반복
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = scanner.nextInt();
			
			if (i == 0) {
				min = intArray[i]; 
			}
			
			if (intArray[i] < min) { // min이 더 작다면 실행 !
				min = intArray[i];
			}
			
			if (intArray[i] > max) { // min이 더 작다면 실행 !
				max = intArray[i];
			}
			
		} // .. 반복문 종료
		
		
		// 결과출력하기 !
		System.out.print("가장 작은 수는 " + min + "이고, ");
		System.out.print("가장 큰 수는 " + max + "이고, ");
		System.out.println("최소값+최대값은" + (min+max) + "입니다 ");
		
		
		scanner.close();
		
		
	}
	
}
