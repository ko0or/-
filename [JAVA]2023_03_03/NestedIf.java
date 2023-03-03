import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        
        // 내가작성한 코드
        /*
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("점수를 입력하세요(0~100): ");
        int grade = scanner.nextInt();

        System.out.print("학년을 입력하세요(1~4): ");
        int haknyeon = scanner.nextInt();

        if (haknyeon == 4 ) {
            if (grade >70) { System.out.println("합격"); }
            else { System.out.println("불합격"); }
            
        } else { // 4학년이 아니면
            if (grade >60) { System.out.println("합격"); }
            else { System.out.println("불합격"); }

        }

        scanner.close();
         */




        // 강사님 ver
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("점수를 입력하세요(0~100): ");
        int score = scanner.nextInt();

        System.out.print("학년을 입력하세요(1~4): ");
        int year = scanner.nextInt();

        if (score >= 60) {
            if (year != 4) {
                System.out.println("합격!");
            } else if (score >= 70) {
                System.out.println("합격!");
            }

        } else {
            System.out.println("불합격");
            
        }

        scanner.close();        



    }
}
