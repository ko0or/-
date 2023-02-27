import java.text.DecimalFormat;
import java.util.Scanner;

public class Pay {
    public static void main(String[] args) {
        
        // 포맷용
        DecimalFormat df = new DecimalFormat("#,##0");

        // 시간을 입력받아서 임금계산 ( 시간당 10,000원 )
        Scanner scanner = new Scanner(System.in);
        final int RATE = 10_000; 
        
        // 시간
        int hours = 0; 
        // 1시간 임금을 시간에 곱한 값
        int pay = 0;


        // 입력받기
        System.out.print("근무시간을 입력해주세요: ");
        hours = scanner.nextInt();

        // 8시간 이하 : 1시간임금 * 시간
        // 초과시간에 대해선 1시간당 임금 * 시간 * 1.5
        if (hours > 8) {
            pay = (int) (RATE * 8 + (1.5 * RATE * (hours - 8)));
        } else {
            pay = hours * RATE;
        }

        // 출력
        System.out.println(
            "\n" + "근무시간: " + hours +
            "\n" + "급여: "     + df.format(pay) + "원"
        );


    }
}
