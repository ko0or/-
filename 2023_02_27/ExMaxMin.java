import java.util.Scanner;

public class ExMaxMin {
/*
  Scanner 클래스로 정수 3개를 입력 받고 
  3개의 숫자 중 최대값과 최소값을 출력하라.
  중복되지 않는 숫자를 입력하라.

  *.출력
  정수 3개 입력>>20 100 33
  최대값은 100
  최소값은 20
*/

    public static void main(String[] args) {
        
        /* ============= 내가 작성한 코드 ============= */
        
        Scanner scanner = new Scanner(System.in);
        int max, min;

        System.out.print("정수 3개 입력>> ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        max = getMax(a, b, c);        
        min = getMin(a, b, c);

        System.out.println("최대값은 " + max);
        System.out.println("최소값은 " + min);

        scanner.close();
        





        /* ============= 강사님이 작성하신 코드 ============= */
        /*
        int max=0;
        int min=0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 3개 입력>> ");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if ( a>b && a>c ) { max = a; }
        else if ( b>c && b>a ) { max = b; }
        else if ( c>a && c>b ) { max = c; }
        
        if ( a<b && a<c ) { min = a; }
        else if ( b<c && b<a ) { min = b; }
        else if ( c<a && c<b ) { min = c; }

        System.out.println("최대값은 " + max);
        System.out.println("최소값은 " + min);

        scanner.close();
        */


    }

    /* ============= 내가 작성한 메소드 ============= */
    public static int getMax(int num1, int num2, int num3) {
        int temp = (num1 > num2) ? num1 : num2;
        return (temp > num3) ? temp : num3 ;
    }

    public static int getMin(int num1, int num2, int num3) {
        int temp = (num1 < num2) ? num1 : num2;
        return (temp < num3) ? temp : num3 ;
    }
    
    
}
