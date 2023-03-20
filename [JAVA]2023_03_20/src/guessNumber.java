import java.util.Scanner;

public class guessNumber {
	public static void main(String[] args) {

		// 난수를 만들어두고 : 정수 1 ~ 10까지
		int numberToGuess = (int)(Math.random()*10)+1;
		Scanner scanner = new Scanner(System.in);
		
		// 만들어진 난수값과, 입력된 값을 비교
		while(true) {
			System.out.print("추측한 숫자를 입력하세요: ");
			int guess = scanner.nextInt();
			
			if (guess == numberToGuess) { break; }			
			else if ( guess > numberToGuess ) { System.out.println("추측한 숫자가 너무 큽니다"); }
			else if ( guess < numberToGuess ) { System.out.println("추측한 숫자가 너무 작습니다"); }
		}
		
		// 입력된값과 일치하면 반복문이 탈출되고, 맞추셨습니다를 출력한다.
		System.out.println("맞추셨습니다");
		scanner.close();
		
		
		
		
	}
}
