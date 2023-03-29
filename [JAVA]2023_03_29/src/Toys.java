import java.util.Scanner;

public class Toys {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 몇개?");
		
		int setLength = scanner.nextInt();		
		int randomArray[] = new int[setLength];
		
		for (int i = 0; i < randomArray.length; i++) {
			if ( i%10 == 0 && i != 0 ) { System.out.println( );}
			randomArray[i] = (int) (Math.random() * 100)+1;
			System.out.print( randomArray[i] + " " );
		}		
		
		scanner.close();
	}
}
