import java.util.Scanner;

public class ChangeMoney {
	public static void main(String[] args) {
		
		/* 
					기본세팅
									unit : 거스름 돈 단위 (나누기 할 값)
									exchangeMoney : 거스름 돈 단위의 갯수 (나누기된 몫의 갯수)
									
					배열인덱스
									5만원,  1만원,  천원, 백원, 십원, 일원 
		 */
		int unit[] = { 
				50_000, 10_000,  
				1_000, 100, 10, 1 
		};
		int exchangeMoney[] = new int[unit.length];
		Scanner scanner = new Scanner(System.in);
		
		
		
		// 입력받기
		System.out.print("금액을 입력하시요: ");
		int input = scanner.nextInt();
		
		for (int count = 0; count < exchangeMoney.length; count++) {
				exchangeMoney[count] = input/unit[count];
				input -= exchangeMoney[count] * unit[count];
				// 강사님 방법 // input = input % unit[count];
				System.out.println(unit[count] + "원 짜리 : " + exchangeMoney[count] + "개");
		}
		
		
		
		
		scanner.close();
	}
}
