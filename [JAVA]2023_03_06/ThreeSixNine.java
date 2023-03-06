import java.util.Scanner;
public class ThreeSixNine {
/*
 369 게임을 간단히 작성해 보자.
 10~99까지의 정수를 입력받고 정수에 3,6,9 중 
  하나가 있는 경우는 “박수짝” 을 출력하고 
  두 개 있는 경우는 “박수짝짝” 을 출력하는 프로그램을 작성하라.

 예를 들면, 키보드로 입력된 수가 
  13인 경우 “박수짝”  을, 
  36인 경우 “박수짝짝” 을 출력하면 된다.
 
*/
    public static void main(String[] args) {
        
        /* 
        count   :   3, 6, 9 갯수
        num     :   입력받은 정수
        a       :   10의 자리
        b       :    1의 자리
        ------------------------->
        
        */
        
        
        Scanner scanner = new Scanner(System.in);
        int count =0, num, a, b;
        
        System.out.print("1~99사이의 정수를 입력하시요>> ");
        num = scanner.nextInt();

        a = num / 10;
        b = num % 10;

        /* 10의 자리 */ if (a%3 == 0)           count ++;
        /* 1의  자리 */ if (b%3 == 0 && b != 0) count ++;


        // 증가된 카운트로 구분
        if (count == 1) System.out.println("박수짝");
        if (count == 2) System.out.println("박수짝짝");


        scanner.close();


    }
}
