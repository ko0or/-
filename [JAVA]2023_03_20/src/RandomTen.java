import java.util.Random;

public class RandomTen {
	public static void main(String[] args) {
		
		// [1] 준비RandomTen.java
		System.out.print("랜덤한 정수들 : ");
		Random r = new Random();
		int intArray[] = new int[10];
		int sum = 0;
		
		// [2] 반복하면서 요소에 값을 할당함, 동시에 sum에 할당된 값을 누적시킨다
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = r.nextInt(10)+1;
			System.out.print( intArray[i] + " ");
			sum += intArray[i];
		}
		
		// [3] 누적된 값을 double 타입으로 출력
		System.out.println( "\n" + "평균은 " + (double) sum/intArray.length  );
		
	}
}
