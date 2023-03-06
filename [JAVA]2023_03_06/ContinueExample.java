import java.util.Scanner;

public class ContinueExample {
// 5개의 정수를 입력 받고 그 중 양수들만 합하여 출력
// ★ continue 를 이용할 것

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        
        
        // 내가 작성한 코드
        /*

        int result = 0;
        System.out.print("정수를 5개 입력하세요: ");

        for (int i=0; i<5; i++) {
            int number = scanner.nextInt();
            if (number <= 0) continue;

            // numbber가 0과 같거나 작다면(음수라면) 해당내용 실행 X
            result += number;
            
        }
        
        System.out.println("양수의 합은 " + result);
        */
        
        

        // 강사님 ver
        int n, sum =0;
        System.out.println("정수를 5개 입력하세요.");
        for (int i = 0; i < 5; i++) {
            n = scanner.nextInt();

            if ( n <= 0) {
                // i++ 증감폭으로 이동
                continue;
            } else {
                sum += n;
            }
        }
        System.out.println("양수의 합은 " + sum);






        

         scanner.close();


    }
}
