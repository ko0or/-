import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        
        /* 내가 작성한 코드
        boolean multiple = false;

        System.out.print("양의 정수를 입력하세요: ");
        int number = scan.nextInt();
        
        if (number %3 == 0) { multiple=true; System.out.println("3의 배수이다"); }
        if (number %5 == 0) { multiple=true; System.out.println("5의 배수이다"); }
        if (number %8 == 0) { multiple=true; System.out.println("8의 배수이다"); }
        if (!multiple) System.out.println("아무 배수도 아니다");
        
        */



        // 강사님 ver
        int number;
        boolean multiple;
        multiple=false;

        System.out.println("양의 정수를 입력하세요: ");
        number = scan.nextInt();

        if (number % 3 == 0) {
            System.out.println("3의 배수이다.");
            multiple = true;
        }

        if (number % 5 == 0) {
            System.out.println("5의 배수이다.");
            multiple = true;
        }

        if (number % 8 == 0) {
            System.out.println("8의 배수이다.");
            multiple = true;
        }

        if (multiple == false) {
            System.out.println("아무 배수도 아니다.");
        }


        scan.close();
    
    }
}

