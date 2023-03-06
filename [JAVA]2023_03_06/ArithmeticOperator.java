import java.util.Scanner;

public class ArithmeticOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 내가 작성한 코드
        /*
        System.out.print("정수를 입력하세요: " );
        int time = scanner.nextInt();

        // 시분초 구하기
        int hour = time/(60*60); 
        int minute = time/60 - (hour*60);
        int second = time%60;

        // 출력
        System.out.println( 
            time     +  "초는 " 
            + hour   +  "시간" 
            + minute +  "분"
            + second +  "초입니다."
            );

         */
        


        // 강사님 ver
        System.out.println("정수를 입력하세요: ");
        int time = scanner.nextInt();
        
        int hour = time / 3600;
        int minute = (time / 60) % 60;
        int second = time % 60;

        System.out.println( 
            time     +  "초는 " 
            + hour   +  "시간" 
            + minute +  "분"
            + second +  "초입니다."
        );
        scanner.close();

    }
}
