import java.util.Scanner;

public class RandomArray2 {
	// 중복확인하는 메소드
	public static boolean check(int[] a, int b) {
		for (int i = 0; i < a.length; i++) {
			if ( a[i] == b) {  return true;  }
		}
		return false;		
	}
	
	public static void main(String[] args) {
		
		int intArray[];
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수몇개?");
		int setLength = scanner.nextInt();
		intArray = new int[setLength % 100];
		
		
		for (int i = 0; i < intArray.length; i++) {
			int getRandom = (int)(Math.random()*100)+1;
			
			if (check(intArray, getRandom)) { i--; continue; }
			intArray[i] = getRandom;
			
			if ( i != 0 && i % 10 == 0 ) { System.out.println(); }
			System.out.print( intArray[i] + " ");
		}
		
		scanner.close();
	}
}
