import java.util.Arrays;

public class ArraysTest2 {
	public static void main(String[] args) {
		int[] array = { 9, 4, 5, 6, 2, 1 };
		Arrays.sort(array); // 배열을 정렬한다
		
		printArray(array);
		
//		 9 를 탐색한다 ( 인덱스 반환, 없으면 음수 )
		System.out.println( "\n" + Arrays.binarySearch(array, 9) );
		
//		특정한 값으로 채운다
		Arrays.fill(array, 8); 
		printArray(array);
		
	}
	
//	배열을 매개변수로 받아서 출력하는 메소드
	private static void printArray(int[] array) {
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			System.out.print( " " + array[i] + " ");
		}		
		System.out.print("]");
	}
}
