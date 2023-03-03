import java.util.Scanner;

public class WhileExample {
/*
정수입력받음
입력받은 갯수와 평균 출력
마지막에 -1을 입력하면 중단

*/
    public static void main(String[] args) {
 
        // 객체생성
        Scanner scanner = new Scanner(System.in);
        
        // 변수 초기화
        int count = 0;
        int sum = 0;

        
        // 입력받기
        System.out.print("정수를 입력하고 마지막에 -1을 입력하세요.");
        
        // 숫자 -1 을 입력받을때까지 계~~ 속 반복 ( != not 연산 )
        int n = scanner.nextInt();
        while(n != -1) {
            
            // 입력받은 값을 더해주고
            sum += n;
            // 실행될때마다 count가 증가함
            count++;
            
            // 또 입력받음
            n = scanner.nextInt();
        }

        // 반복문 탈출시( -1을 입력받았을때 )
        if (count ==0) { System.out.println("입력된 수가 없습니다.");} 
        else {
            System.out.println("정수의 갯수는 " + count + "개 ");
            System.out.println("정수의 평균은 " + (double)sum/count + "입니다.");
        }

        // 종료
        scanner.close();




    }
}
