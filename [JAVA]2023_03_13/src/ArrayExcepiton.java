public class ArrayExcepiton {
	public static void main(String[] args) {
		
		int[] intArray = new int[5];
		intArray[0] = 0;
		
/* 
	i 값이 0 ~ 4 까지인데,  5를 넣으려했기에 범위초과 (ArrayIndexOutBound 발생)  
	# 기존 에러출력내용
		Exception in thread "main" 0
		1
		3
		6
		java.lang.ArrayIndexOutOfBoundsException: 5
		at ArrayExcepiton.main(ArrayExcepiton.java:10)
 */

		try {
			for (int i = 0; i < intArray.length; i++) {
				intArray[ i + 1 ] = intArray[ i ] + i + 1;
				System.out.println( intArray[ i ] );
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println( "오류발생 : " + e.getClass() );
			
		}
		
		
	}
}
