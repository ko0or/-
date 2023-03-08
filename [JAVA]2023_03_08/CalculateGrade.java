import java.util.Scanner;
public class CalculateGrade {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        /* 내가 작성한 코드 
        
        // 문자 grade , 숫자 totalscore attendrate, 참거짓 cheating
        char grade;
        boolean cheating;
        int totalscore =0, attendrate;

        // 부정행위 여부 입력받기
        System.out.print("부정행위 여부(true 혹은 false): ");
        cheating = scanner.nextBoolean();

        // 부정행위면 F 학점
        if (cheating) { grade = 'F'; }
        
        // 부정행위가 아니라면 ~~
        else {
            System.out.print("출석률(0~100사이의 정수값): ");
            attendrate = scanner.nextInt();

            System.out.print("총점(0~100사이의 정수값): ");
            totalscore = scanner.nextInt();

            if (attendrate < 80) { grade = 'F'; }
            else if (totalscore >= 90 ) { grade = 'A'; }
            else if (totalscore >= 80 ) { grade = 'B'; }
            else if (totalscore >= 70 ) { grade = 'C'; }
            else if (totalscore >= 60 ) { grade = 'D'; }
            else { grade = 'F'; }

        }

        // 결과출력
        System.out.println("학점 = " + grade);
        

        */

        
        
        // 강사님 ver

        int attendrate, totalscore;
        boolean cheating;
        char grade;

        System.out.print("부정행위 여부(true 혹은 false): ");
        cheating = scanner.nextBoolean();
        
        System.out.print("출석률(0~100)사이의 정수값: ");
        attendrate = scanner.nextInt();
        System.out.print("총점(0~100)사이의 정수값: ");
        totalscore = scanner.nextInt();
        
        if (cheating) {
            grade = 'F';
        
        } else if (attendrate < 80) { 
            grade = 'F';            
        } else {
            if (totalscore >= 90) {
                grade = 'A';            
            } else if (totalscore >= 80) {
                grade = 'B';            
            } else if (totalscore >= 70) {
                grade = 'C';            
            } else if (totalscore >= 60) {
               grade = 'D';            
            } else {
                grade = 'F';
            }
        }

        System.out.println("학점 = " + grade);




        
        scanner.close();




        
    }
}
