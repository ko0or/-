import java.util.Scanner;

public class ExGlobalStock {
/*
 1. 매수금액, 매도금액을 입력 받는다.
 2. 매도금액이 매수금액보다 크면
    양도세=(매도금액-매수금액)*22%
 3. 매도금액이 매수금액보다 같거나 작으면
    양도세=0
 4. 양도세를 출력한다.
 *.출력
    매수금액을 입력하세요: 100000
    매도금액을 입력하세요: 150000
    양도세 = 11000.0
    
    매수금액을 입력하세요: 90000
    매도금액을 입력하세요: 80000
    양도세 = 0.0
*/
    public static void main(String[] args) {

        // 내가 작성한 코드
        /* 
        Scanner 스캐너 = new Scanner(System.in);
        double 양도세 = 0;

        System.out.print("매수금액을 입력하세요: ");
        int 매수금액 = 스캐너.nextInt();
        System.out.print("매도금액을 입력하세요: ");
        int 매도금액 = 스캐너.nextInt();

        if (매도금액 > 매수금액) {
            양도세 = (매도금액-매수금액)*0.22;
        }

        System.out.println("양도세 = " + 양도세);
        스캐너.close();
        */



        // 강사님 ver

        Scanner scanner = new Scanner(System.in);
        int purchaseAmount;
        int slaeAmount;
        double transferTax;
        
        System.out.print("매수금액을 입력하세요");
        purchaseAmount = scanner.nextInt();

        System.out.print("매도금액을 입력하세요");
        slaeAmount = scanner.nextInt();
        
        if (slaeAmount > purchaseAmount) {
            transferTax = (slaeAmount - purchaseAmount) * 0.22;
        } else {
            transferTax = 0;
        }

        System.out.println("양도세 = " + transferTax);
        scanner.close();


    }
}
