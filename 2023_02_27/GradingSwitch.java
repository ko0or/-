import java.util.Scanner;

public class GradingSwitch {
    public static void main(String[] args) {
        
        // 준비
        Scanner scanner = new Scanner(System.in);
        char grade;
        
        // 입력받기
        System.out.print("점수를 입력하세요(0~100): ");
        int score = scanner.nextInt();

        // 계산하기
        switch (score/10) {
            case 10: // 100점
                // grade = 'A';
                // break;
            
            case 9: // 90 ~99점
                grade = 'A';
                break;

            case 8: // 80 ~89점
                grade = 'B';
                break;
            
            case 7: // 70점
                grade = 'C';
                break;
                
            case 6: // 70점
                grade = 'D';
                break;

            default:
                grade = 'F';
                break;
        }

        
        // 출력
        System.out.println( "학점: " + grade );

        // 종료
        scanner.close();

        
    }
}