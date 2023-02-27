package Package_for_while;

import java.util.Scanner;

public class LoopExample2 {
    public static void main(String[] args) {
        
        // 기본세팅
        int n;
        int i = 1;
        Scanner scanner = new Scanner(System.in);


        // 입력받기
        System.out.print("구구단 중에서 출력하고 싶은 단을 입력하시오: ");
        n = scanner.nextInt();


        // 1 ~ 9 까지 반복
        while (i <= 9) { 
            System.out.println(n + " * " + i + " = " + n*i );
            i ++;
        }


        // 반복문 종료시
        System.out.println("구구단 종료");



    }
}
