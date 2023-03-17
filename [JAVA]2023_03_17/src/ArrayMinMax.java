import java.util.Arrays;
import java.util.Scanner;
public class ArrayMinMax {
	public static void main(String[] args) {
		
		// 객체생성
		Scanner scanner = new Scanner(System.in);
		int intArray[] = new int[10];
		
		// 10번 입력받은후,  낮은 값부터 ~ 높은 값으로 정렬시킨다. 
		for (int i = 0; i < intArray.length; i++) { intArray[i] = scanner.nextInt(); }
		Arrays.sort(intArray);
		
		// 정렬된 내용 출력
		System.out.printf(
				"가장 작은 수는 %d이고, 가장 큰 수는 %d이고, 최소값 + 최대값은 %d입니다. \n" ,
				intArray[0] , intArray[intArray.length - 1], ( intArray[0] + intArray[intArray.length - 1] )
		);
		
		// 종료
		scanner.close();
		
		
	}
	
}
