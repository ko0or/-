import java.util.Scanner;
public class ArithmeticExIf {
/*
사칙연산을 입력받아 계산하는 프로그램을 작성하고자 한다. 

연산자는 +,-,*,/ 의 네가지로 하고 
피연산자는 모두 정수로 한다.

피연산자와 연산자는 실행 사례와 같이 빈 칸으로 분리하여 입력한다.

0으로 나누기 시 “0으로 나눌 수 없습니다.” 를 출력하고 종료한다.

*/
    public static void main(String[] args) {
        
        // 내가 작성한 코드
        /*
        // 객체생성
        Scanner scanner = new Scanner(System.in);


        // 입력받기 (띄어쓰기 단위로 int, String, int 타입으로 받음)
        System.out.print("연산>> ");
        int x = scanner.nextInt();
        String sign = scanner.next();
        int y = scanner.nextInt();


        // 입력받은 String 값에 따라 실행 .eqauls() 메소드 사용
        if ( sign.equals("+") ) {
            System.out.println(x + " + " + y + "의 계산결과는 " + (x+y));
        }
        else if ( sign.equals("-") ) {
            System.out.println(x + " - " + y + "의 계산결과는 " + (x-y));
        }
        else if ( sign.equals("*") ) {
            System.out.println(x + " * " + y + "의 계산결과는 " + (x*y));
        }
        else if ( sign.equals("/") ) {
            if (y != 0) { System.out.println(x + " / " + y + "의 계산결과는 " + (x/y)); } 
            else { System.out.println("0으로 나눌 수 없습니다."); }
        }
    
        
        // 종료
        scanner.close();
        */




        // 강사님 ver
        
        Scanner scanner = new Scanner(System.in);
        int res = 0;

        System.out.print("연산>> ");
        int op1 = scanner.nextInt();
        String op = scanner.next();
        int op2 = scanner.nextInt();

        if ( op.equals("+") ) {
            res = op1 + op2;
        }
        else if ( op.equals("-") ) {
            res = op1 - op2;
        }
        else if ( op.equals("*") ) {
            res = op1 * op2;
        }
        else if ( op.equals("/") ) {
            if (op2 == 0) { 
                System.out.println("0으로 나눌 수 없습니다."); 
                return;

            } else { 
                res = op1 / op2;
                System.out.println(op1 + " / " + op2 + "의 계산결과는 " + res); 
            }

        } else {
            System.out.println("사칙연산이 아닙니다.");
        }
        System.out.println( op1 + op + op2 + "의 계산결과는 " + res );
    
        scanner.close();
        

    }
}
