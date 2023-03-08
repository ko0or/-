import java.util.Scanner;

public class PrintAsterisk {
    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);
        
        // 내가 작성한 코드

        /*
        System.out.print("정수를 입력하시오>> ");
        int count = scanner.nextInt();

        for (int row = count ;   row     > 0     ;    row--      ) {
        for (int column = row;   column  > 0     ;    column--   ) {
                System.out.print("*");
            }
            System.out.println();
        }
         */


        // 강사님 ver

        System.out.print("정수를 입력하시오>> ");
        int n = scanner.nextInt();

        // 갯수를 행과 열 출력 -> 2중 for 사용
        // for (int i = 0; i < n; i++) {
        for (int i = n; i > 0; i--) {
            
            // for (int j=0; j<n; j++) {
            // 하나씩 줄이기 위해서 i값 사용
            for (int j=0; j<i; j++) {
                System.out.print('*');

            }
            // 5개 출력후 엔터 필요
            System.out.println();
        }





        scanner.close();

    }
}
