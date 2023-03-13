import java.util.Scanner;

public class ChangeMoney {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		/* 내가 작성한 코드
		
		// exchangeMoney[] : 	잔돈갯수를 보관하는 배열
		// exchangeValue[] : 		잔돈단위를 보관하는 배열
		// exchangeText[] : 		잔돈단위를 나타내는 배열

		int exchangeMoney[] = new int[7];
		int exchangeValue[] = { 50_000, 10_000, 1_000, 100, 50, 10 , 1 };
		String exchangeText[] = { "오만원권 ", "만원권 ", "천원권 ", "백원 ", "오십원 ", "십원 ", "일원 " };
		
		System.out.print("금액을 입력하시요>> ");
		int money = scanner.nextInt();
		
		for (int i =0; i < exchangeMoney.length; i++) {			
			exchangeMoney[i] = money/exchangeValue[i];
			money -= exchangeMoney[i] * exchangeValue[i];
			
			if (i <2) {
				System.out.println( exchangeText[i] + exchangeMoney[i] + "매"); 
			
			} else { 
				System.out.println( exchangeText[i] + exchangeMoney[i] + "개"); 
			}
		
		
		}
		
		*/
		
		

		
		 // 강사님 ver
		
		 int 오만원 = 50000;
		 int 만원 = 10000;
		 int 천원 = 1000;
		 int 백원 = 100;
		 int 오십원 = 50;
		 int 십원 = 10;
		 int 일원 = 1;
		
		int res, money;
		
		System.out.print("금액을 입력하시요>> ");
		money = scanner.nextInt();
		
		res = money/오만원;
		if (res > 0) { 	
			System.out.println("오만원권 " + res + "매"); 
		}
		
		money = money%오만원;
		res = money/만원;
		if (res > 0) { 	
			System.out.println("만원권 " + res + "매"); 
		}
		
		money = money%만원;
		res = money/천원;
		if (res > 0) { 	
			System.out.println("천원권 " + res + "매"); 
		}
		res = money%천원;
		
		money = money%천원;
		res = money/백원;
		if (res > 0) { 	
			System.out.println("백원 " + res + "개"); 
		}
		res = money%백원;
		
		money = money%백원;
		res = money/오십원;
		if (res > 0) { 	
			System.out.println("오십원 " + res + "개"); 
		}
		res = money%오십원;
		
		money = money%오십원;
		res = money/십원;
		if (res > 0) { 	
			System.out.println("십원 " + res + "개"); 
		}
		
		money = money%십원;
		res = money/일원;
		if (res > 0) { 	
			System.out.println("일원 " + res + "개"); 
		}
		
		
		
		
		
		
		scanner.close();
		
	}
}
