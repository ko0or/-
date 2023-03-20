import java.util.Random;
import java.util.Scanner;

public class RandomNumber_Teacher {
	public static void main(String[] args) {
		
		int numberToGuess;
		int guess;
		
		Random generator = new Random();
		Scanner scanner = new Scanner(System.in);

		numberToGuess = generator.nextInt(10)+1;
		
		System.out.print("추측한 숫자를 입력하세요: ");
		guess = scanner.nextInt();
	
		while (guess != numberToGuess) {
			System.out.println("추측한 숫자가 틀렸습니다.");
		
			if (guess > numberToGuess) {
				System.out.println("추측한 숫자가 너무 큽니다.");
			}	else {
				System.out.println("추측한 숫자가 너무 작습니다.");
			}
			
			guess = scanner.nextInt();
		}
		
		
		System.out.println("맞추셨습니다.");			
		scanner.close();
	}
}
