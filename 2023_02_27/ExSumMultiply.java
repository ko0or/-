import java.util.Scanner;

public class ExSumMultiply {
    public static void main(String[] args) {
        
        /*
            Scanner 클래스를 이용하여 
            3자리의 정수(100~999사이)를 입력받고 
            백의 자리와 십의 자리는 합하고,
            10의 자리와 1의 자리를 곱하기를 출력하는 프로그램 작성
            
            *.출력
            3자리수 정수 입력(100~999)>>321
            100의 자리와 10의 자리의 합은 5
            10의 자리와 1의 자리의 곱은 2
         */


         /* ============= 내가 작성한 코드 ============= */
         /*
         Scanner scanner = new Scanner(System.in);
         System.out.print("3자리수 정수 입력(100~999)>> ");
         int n = scanner.nextInt();
         
         int n_100 = n/100;
         int n_10 = n%100 / 10;
         int n_1 = n%n_10;
         
         System.out.println( "100의 자리와 10의 자리의 합은 " + (n_100 + n_10) );
         System.out.println( "10의 자리와 1의 자리의 곱은 " + (n_10 * n_1) );
         
         scanner.close();
         */
        
        
        /* ============= 강사님이 작성하신 코드 ============= */
        Scanner scanner = new Scanner(System.in);
        System.out.print("3자리 정수 입력(100~999)>> ");

        int n = scanner.nextInt();
        
        // 100자리수: 나누기 100 결과
        // 10 자리수: 나누기100의 나머지를 10으로 나눈 결과
        // 1  자리수: 나누기 100의 나머지를 10으로 나눈 나머지

        int hundred = n/100;        // 100의 자릿 수
        int hundredRest = n%100;    
        
        int ten = hundredRest/10;   // 10의 자릿 수
        int one = hundredRest%10;       // 1의 자릿 수


        // 결과
        int sum = hundred+ten;
        int multiply = ten * one;


        // 출력
        System.out.println("100의 자리와 10의 자리의 합은 " + sum);
        System.out.println("10의 자리와 1의 자리의 곱은 " + multiply);

        // 종료
        scanner.close();

        
    }
}