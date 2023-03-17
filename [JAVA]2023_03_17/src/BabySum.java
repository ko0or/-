public class BabySum {
	public static void main(String[] args) {
		// 101, 102, .. 105    ::    201, 202 .. 205 ..  :: 12001 , 12002 .. 12005
		
		int intArray[][] = new int[120][5];
		int sum = 0;
		
		for (int i = 0; i < intArray.length; i++) {  				//  0 ~ 119 까지,  총 120번
		for (int j = 0; j < intArray[0].length; j++) { 		//  0 ~ 4 	 까지,  총 5번 
				intArray[i][j] = (i+1)*100 + j+1;						// i에 1 더하고 * 100 ,그리고  i 의 index 숫자 + 1  
				sum += intArray[i][j];
			}
		}
		
		System.out.println( " 10년간 5개 나라의 총 신생아 수는 " + sum);

		
	}
}
