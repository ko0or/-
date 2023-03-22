import java.util.Scanner;

public class ComputeInterest {
	public static void main(String[] args) {
		
		// 변수
		int years = 0;
		double balance;
		
		// 입력받기
		Scanner scanner = new Scanner(System.in);
		System.out.print("원금을 입력하세요: ");
		int principal = scanner.nextInt();
		System.out.print("연이율을 입력하세요: ");
		double rate = scanner.nextDouble();
		
		// 출력하기
		System.out.println("연도수\t원리금");
		balance = principal;
		
		// balance가 principal 의 두배보다 작거나 or 같으면 반복,
		// 반복할때마다 balance의 값이 증가되고,  조건을 벗어나게되면 탈출하게된다.
		while (balance <= (principal*2) ) { 	
			years ++;
			balance *= 1.0 + rate / 100.0;
			System.out.println(years+"\t"+balance);
		}
		

		// 반복문 탈출시,  필요한 연도수 years 를 표시
		System.out.println("필요한 연도수 = " + years);
		scanner.close();
		
		
		
	}
}
