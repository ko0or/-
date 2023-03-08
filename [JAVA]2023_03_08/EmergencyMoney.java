import java.util.Scanner;

public class EmergencyMoney {
    public static void main(String[] args) {
        
        // 내가 작성한 코드
        
        /*
        // 스캐너 객체생성및 상수, 변수 초기화
        final int RATE = 1200;
        int dollar_100, dollar_10, money =0;
        Scanner scanner = new Scanner(System.in);

        // 가구원 수 입력받기
        System.out.print("가구수를 입력하시오>> ");
        int family = scanner.nextInt();

        // 가구원 수에 따라서 한화 지급
        if      (family == 1) { money = 400_000;   }
        else if (family == 2) { money = 600_000;   }
        else if (family == 3) { money = 800_000;   }
        else if (family >= 4) { money = 1_000_000; }
        
        // 환율을 구하고, 100달러권과 10달러권 계산하기
        money      /= RATE;
        dollar_100  = money/100;
        dollar_10   = (money%100)/10;

        // 결과출력
        System.out.println("100달러짜리 " + dollar_100 + "매");
        System.out.println("10달러짜리 "  + dollar_10  + "매");

        // 스캐너 종료
        scanner.close();
        */




        // 강사님 ver
        
        
        Scanner scanner = new Scanner(System.in);

        // 상수 100달러 원화 계산
        final int hundred = 120000;
        final int ten = 12000;
        int res, money, num;

        System.out.print("가구수를 입력하시오>> ");
        num = scanner.nextInt();

        if (num == 1) {
            money = 400000;
        } else if (num == 2) {
            money = 600000;
        } else if (num == 3) {
            money = 800000;
        } else {
            money = 1000000;
        }

        res = money/hundred;
        if (res > 0) {
            System.out.println("100달러 " + res + "매");
        }
        
        money = money%hundred;
        res = money/ten;
        if (res > 0) {
            System.out.println("10달러 " + res + "매");
        }

        scanner.close();
    }
}
