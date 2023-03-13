import java.util.Scanner;

public class DivideByZeroHandlling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dividend;
        int divisor;


        while (true) {
            System.out.println("분자를 입력하세요");
            dividend = scanner.nextInt();

            System.out.println("분모를 입력하세요");
            divisor = scanner.nextInt();

            try {
                // 오류가 발생할 수 있는 행위
                System.out.println(dividend + "를  " + divisor + "으로 나눈 몫은 " + dividend/divisor);
            } catch (Exception e) {
                // 오류가 발생했을때
                System.out.println( "0으로 나눌 수 없습니다." );

            } finally {
                scanner.close();
                break;
            }


        }





    }
}