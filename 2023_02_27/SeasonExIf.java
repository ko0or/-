import java.util.Scanner;

public class SeasonExIf {
/*
  if, if-else문 사용하기 !

  
  숫자를 입력 받아 
  3~5는 “봄”, 6~8은 “여름”, 9~11은 “가을”, 12,1,2의 경우 “겨울” 
  그 외 숫자를 입력한 경우 “잘못입력” 을 출력하는 프로그램을 작성하라.
  
  *.출력
  달을 입력하세요(1~12)>>9
  가을
  if-else 문을 이용하여 프로그램을 작성하라.
 */
    public static void main(String[] args) {
        
        /* ============= 내가 작성한 코드 ============= */
        /*
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("달을 입력하세요(1~12)>> ");
        int month = scanner.nextInt();

        if (month >= 3 && month <= 5 ) { System.out.println("봄"); }
        else if (month >= 6 && month <= 8 ) { System.out.println("여름"); }
        else if (month >= 9 && month <= 11 ) { System.out.println("가을"); }
        else if (month == 12 || month == 1 || month == 2 ) { System.out.println("겨을"); }
        else { System.out.println("잘못입력"); }

        scanner.close();
         */




        /* ============= 강사님이 작성하신 코드 ============= */
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("달을 입력하세요(1~12)>> ");
        int month = scanner.nextInt();

        if (month >= 3 && month <= 5) {
            System.out.println("봄");
        } else if (month >= 6 && month <= 8) {
            System.out.println("여름");
        } else if (month >= 9 && month <= 11) {
            System.out.println("가을");
        } else if (month == 12 || month == 1 || month == 2) {
            System.out.println("겨울");
        } else {
            System.out.println("잘못입력");
         }

        scanner.close();




    }
}
