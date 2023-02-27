import java.util.Scanner;

public class SeasonExSwitch {
/*
  switch문 사용하기 !


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

        switch (month) {
            
            // 겨울 (9 ~12)
            case 12:
            case 1:
            case 2:
                System.out.println("겨울");
                break;
            
            // 봄 (3 ~5)
            case 3:
            case 4:
            case 5:
                System.out.println("봄");
                break;
            
            // 여름 (6 ~8)
            case 6:
            case 7:
            case 8:
                System.out.println("여름");
                break;
            
            // 가을 (9 ~11)
            case 9:
            case 10:
            case 11:
                System.out.println("가을");
                break;
        
            
            // 그외
            default:
                System.out.println("잘못입력");
                break;
        }


        scanner.close();
        */




        /* ============= 강사님이 작성하신 코드 ============= */
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("달을 입력하세요(1~12)>> ");
        int month = scanner.nextInt();

        switch(month) {
            case 3:
            case 4:
            case 5:
                System.out.println("봄");
                break;
                
            case 6:
            case 7:
            case 8:
                System.out.println("여름");
                break;
                    
            case 9:
            case 10:
            case 11:
                System.out.println("가을");
                break;

            case 12:
            case 1:
            case 2:
                System.out.println("겨울");
                break;

            default:
                System.out.println("잘못입력");
                break;
        }
                    
        scanner.close();
         
    



    }
}
