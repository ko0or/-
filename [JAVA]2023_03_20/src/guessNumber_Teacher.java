import java.util.Scanner;

public class guessNumber_Teacher {
	public static void main(String[] args) {

		int rNumber = (int)(Math.random()*10)+1;
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("추측한 숫자를 입력하세요: ");
			int input = scanner.nextInt();
			
			if (input == rNumber) { break; }			
			else if ( input > rNumber ) { System.out.println("추측한 숫자가 너무 큽니다"); }
			else if ( input < rNumber ) { System.out.println("추측한 숫자가 너무 작습니다"); }
		}
		
		System.out.println("맞추셨습니다");
		scanner.close();
		
		
		
		
	}
}
