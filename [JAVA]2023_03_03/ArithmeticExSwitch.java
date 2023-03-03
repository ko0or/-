import java.util.Scanner;

public class ArithmeticExSwitch {
    public static void main(String[] args) {

        // 내가 작성한 코드

        Scanner scanner = new Scanner(System.in);

        System.out.print("연산>> ");
        int op1 = scanner.nextInt();
        String op = scanner.next();
        int op2 = scanner.nextInt();
        int res = 0;

        switch (op) {
            case "+": res = op1 + op2;
            System.out.println( op1 + op + op2 + "의 계산결과는 " + res );
            break;

            case "-": res = op1 - op2;
            System.out.println( op1 + op + op2 + "의 계산결과는 " + res );
            break;

            case "*": res = op1 * op2;
            System.out.println( op1 + op + op2 + "의 계산결과는 " + res );
            break;

            case "/":
                switch(op2) {
                    case 0: System.out.println("0은 나눌 수 없습니다");
                    break;

                    default: 
                    System.out.println( op1 + op + op2 + "의 계산결과는 " + res );
                    break;
                }

            default:
                System.out.println("사칙연산이 아닙니다.");
        }

        scanner.close();



    }
}
