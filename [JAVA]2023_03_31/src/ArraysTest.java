import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraysTest {
	public static void main(String[] args) {
		
		String[] a = { "a" , "b" , "c" , "d" };
		int[] b = { 1, 5, 7, 3, 3, 42, 6, 8, 45323, 4, 63, 2, 1 };
		
		//  asList 리턴하는 내용 = new ArrayList<>  
		// asList 리턴타입  List<T> = new ArrayList<>
		
		
//		배열[]  ->  리스트 ArrayList
		System.out.println( Arrays.asList( a ) );
		
//		부분정렬:	(대상) 인덱스 4 ~ 13까지만 정렬 (방법) 오름차순
		Arrays.sort(b, 4, 13);
		System.out.println( Arrays.toString(b) );
		
//		전체정렬 : (대상) 전체 (방법) 오름차순
		Arrays.sort( b ); 
		System.out.println( Arrays.toString(b) );
		
//		문자열 배열을 거꾸로하기
		Arrays.sort(a, Collections.reverseOrder()); 
		System.out.println( Arrays.toString(a) );
		
	}
}
