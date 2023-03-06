//import java.text.DecimalFormat;
import java.util.Scanner;

public class ComputeBalance {
/*
 (1) 변수들
 purchaseAmount: 구매금액
 balance: 청구금액
 (2) 알고리즘
 1. 구매금액을 입력 받는다.
 2. 구매금액이 300000원 이상이면 청구금액 = 구매금액 – 30000
 3. 구매금액이 300000원 미만이고 100000원 이상이면 청구금액 = 구매금액 – 5000
 4. 구매금액이 100000원 미만이면 청구금액 = 구매금액

 5. 구매금액과 청구금액을 출력한다.
 예시)
    구매 금액을 입력하세요: 300000
    구매금액 = 300000
    청구 금액 = 270000
    
    구매 금액을 입력하세요: 100000
    구매금액 = 100000
    청구 금액 = 95000
    
    구매 금액을 입력하세요: 90000
    구매금액 = 90000
    청구 금액 = 90000
 */
    public static void main(String[] args) {
        
        // 내가 작성한 코드
        /*

        // 객체생성
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0");
        
        // 변수 할당,  초기화
        System.out.print("구매 금액을 입력하세요: ");
        int money = scanner.nextInt();
        int buy = money;

        // 30만원 이상구매시 -3만원, 10~ 30만원일때 -5천원 할인
        if (money >= 300_000) { money -= 30_000; }
        else if (money >= 100_000) { money -= 5_000; }
        
        // 결과출력
        System.out.println("구매금액: " + df.format(buy) );
        System.out.println("청구금액: " + df.format(money) );

        // 종료
        scanner.close();
         */




         // 강사님 ver
         Scanner scanner = new Scanner(System.in);
         int purchaseAmount;
         int balance = 0;
         
         System.out.println("구매 금액을 입력하세요: ");
         purchaseAmount = scanner.nextInt();

         
         if (purchaseAmount >= 300000) {
            // 구매금액 30만원 이상일땐 3만원 할인
            balance = purchaseAmount - 30000;
         } else if (purchaseAmount >= 100000) {
            // 구매금액 10만원 이상일땐 5천원 할인
            balance = purchaseAmount - 5000;
         }
         
         System.out.println("구매금액: " + purchaseAmount);
         System.out.println("청구금액: " + balance);
         scanner.close();

    }
}
