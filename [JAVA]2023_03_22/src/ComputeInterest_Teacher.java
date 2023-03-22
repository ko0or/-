import java.util.Scanner;

public class ComputeInterest_Teacher {
	public static void main(String[] args) {
		
		int principal;					// 원금
		double rate;					// 연이율
		double balance;			// 원리금
		int years=0;					
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("원금을 입력하세요: ");
		principal = scanner.nextInt();
		System.out.print("연이율을 입력하세요: ");
		rate = scanner.nextDouble();
		
		balance = principal;
		System.out.println("\n연도수\t원리금");
		
		do {
			years++;
			balance = balance * (1.0+rate/100.0);
			System.out.println(years+"\t"+balance);
		} while ( balance <= (principal * 2.0) );
		
		
		
		System.out.println("\n필요한 연도수 = " + years);
		scanner.close();
		
		
		
	}
}
