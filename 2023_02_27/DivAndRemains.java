import java.util.Scanner;

public class DivAndRemains {
    public static void main(String[] args) {
        
        /*
            Scanner 클래스를 이용하여 
            2자리의 정수(10~99사이)를 입력받고, 
            
            십의 자리와 1의 자리가 같은지 판별하여 
            판별된 내용을 출력하는 프로그램을 작성하라.
  
            *.출력
            2자리수 정수 입력(10~99)>>77
            Yes! 10의 자리와 1의 자리가 같습니다.
         */


         // 입력
         Scanner scanner = new Scanner(System.in);
         System.out.print("2자리의 정수(10~99사이)입력>> ");
         int n = scanner.nextInt();

         /*
            10의 자리 : 나누기 10을 해서 몫
            1의 자리 :  나누기 10을 해서 나머지
        */

        int ten = n/10;
        int one = n%10;


        // 계산, 출력
        if (ten == one) { 
            System.out.println("Yes! 10의 자리와 1의 자리가 같습니다"); 
        
        } else { System.out.println("다릅니다."); }

         // 종료
         scanner.close();

         
    }
}

