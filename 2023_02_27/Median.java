import java.util.Scanner;

public class Median {
    /*
        Scanner 클래스로 정수 3개를 입력 받고 
        3개의 숫자 중,  중간 크기의 수를 출력하라.
        
        중복되지 않는 숫자를 입력하라.
        평균값을 구하는 것이 아님에 주의하라.
        
        *.출력
        정수 3개 입력>>20 100 33
        중간 값은 33
     */
    public static void main(String[] args) {

        /* ============= 내가 작성한 코드 ============= */
        /*
        Scanner scanner = new Scanner(System.in);


        System.out.print("정수 3개 입력>> ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        System.out.print("중간 값은 ");

        if (num1 > num2 && num1 < num3) System.out.println(num1);
        if (num1 > num3 && num1 < num2) System.out.println(num1);

        if (num2 > num1 && num2 < num3) System.out.println(num2);
        if (num2 > num3 && num2 < num1) System.out.println(num2);

        if (num3 > num1 && num3 < num2) System.out.println(num3);
        if (num3 > num2 && num3 < num3) System.out.println(num3);
        

        scanner.close();
        */

     
        /* ============= 강사님이 작성하신 코드 ============= */
        Scanner scanner = new Scanner(System.in);
        int median = 0;

        
        System.out.print("정수 3개 입력>> ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();


        if      ( (a>b && a<c) || (a>c && a<b ) ) { median = a; }
        else if ( (b>a && b<c) || (b>c && b<a ) ) { median = b; }
        else if ( (c>a && c<b) || (c>b && c<a ) ) { median = c; }


        System.out.println("중간 값은 " + median);
        scanner.close();


    }
}
