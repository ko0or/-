import java.util.ArrayList;
import java.util.Scanner;

public class RandomArray {
	public static void main(String[] args) {
		
		// 객체생성
		ArrayList<Integer> randomNumber = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		// 입력받기
		System.out.print("정수 몇개?");		
		int setLength = scanner.nextInt() % 100;
		
		// 입력받은 갯수만큼 반복 + Math.random() 으로 난수저장 + 출력 (10개 단위로 줄바꿈)
		for (int i=0; i < setLength; i++) {
			if ( i % 10 == 0 && i != 0 ) { System.out.println(); }
			randomNumber.add( (int) (Math.random()*100) + 1 );
			System.out.print( randomNumber.get(i) + " ");
		}
		
		// 종료
		scanner.close();
	}
}
