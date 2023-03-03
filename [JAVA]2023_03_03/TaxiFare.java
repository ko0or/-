import java.util.Scanner;

public class TaxiFare {
    public static void main(String[] args) {
        
        // 내가한 방법
        /*
        // 객체생성 + 변수 초기화
        Scanner scanner = new Scanner(System.in);
        int fare, income = 0;


        // 10번 반복 (요금을 입력받고, income에 누적시키는걸 반복함)
        for (int i=0; i<10; i++) {
            System.out.print("요금을 입력하세요: ");
            fare = scanner.nextInt();
            income += fare;
        }

        // 반복이 끝나면 출력하고, 종료
        System.out.println("총 수입: " + income);
        scanner.close();
         */



        // 강사님 ver
        
        int fare;
        int income = 0;

        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<10; i++) {
            System.out.print("요금을 입력하세요: ");
            fare = scanner.nextInt();
            income += fare;
        }
        
        System.out.println("총수입 : " + income);
        scanner.close();

    }
}
