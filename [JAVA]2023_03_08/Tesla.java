import java.util.Scanner;

public class Tesla {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        /* 내가 작성한 코드

        System.out.print("매수 수량을 입력하시요>> ");
        int count = scanner.nextInt() * 520;
        
        int dollar_100 = count / 100;
        int dollar_10 = (count % 100) / 10;

        if (dollar_100 > 0) { System.out.println("100달러짜리 " + dollar_100 + "매"); }
        if (dollar_10  > 0) { System.out.println("10달러짜리 "  + dollar_10 +  "매"); }
        */


        // 강사님 ver
        int tesla = 520;
        int num; // 수량
        int money; // tesla * num
        int res; // 계산된 결과값

        System.out.print("매수 수량을 입력하시요>> ");
        num = scanner.nextInt();
        money = tesla * num;

        // money를 가지고 100달러, 10달러 계산해야함
        res = money/100;
        
        // 100달러짜리가 1매 이상일때
        if (res > 0) {
            System.out.println("100달러짜리 " + res + "매");
        }

        // 10달러짜리 계산
        money = money%100; // 나머지 돈을 다시 셋팅
        res = money/10;
        if (res > 0) {
            System.out.println("10달러 짜리 " + res + "매");
        }



        scanner.close();


    }    
}
