import java.util.Scanner;

public class ExArea {
    public static void main(String[] args) {
        
        /*
        Scanner 를 이용하여 
        삼각형의 변의 길이를 나타내는 정수를 3개 입력받고 
        
        이 3개의 수로 삼각형을 만들 수 있는지 판별하라. 
        삼각형이 되려면 두 변의 합이 다른 한 변의 합보다 커야 한다.
        
        *.출력
        정수 3개를 입력하시오>>4 3 5
        삼각형이 됩니다

        정수 를 입력하시오>>2 3 4
        사다리꼴의 넓이는 10.0
         */


        new Teacher();


    }
}



// 내가 해본거
class Student {
    Student() {
        Scanner scanner = new Scanner(System.in);

        // 입력
        System.out.print("정수를 입력하시오>> ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
    
    
        // 입력값이 2개일경우,  3개일경우 분리해서 계산
        if (z != 0) {
        // 3개일경우  사다리꼴 넓이 계산
            System.out.println("사다리꼴의 넓이는 " + (double)((x*y)+z) );
        } else {
            System.out.println("삼각형의 넓이는 " + (double)((x*y)/2));
        }

        // 종료
        scanner.close();
    }
}



// 강사님의 답안
class Teacher {

    Teacher() {

        // 입력
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력하시오>> ");

        int l1 = scanner.nextInt();
        int l2 = scanner.nextInt();
        int l3 = scanner.nextInt();

        // 계산, 출력
        if (l3 == 0) {
            float triangle = (l1*l2)/2;
            System.out.println("삼각형의 넓이는 " + triangle);
            
            // 마지막 숫자가 0이 아니면 사다리꼴의 넓이
        } else {
            float trapezium = (l1+l2)*l3/2;
            System.out.println("사다리꼴의 넓이는 " + trapezium);
        }

        // 종료
        scanner.close();
    }
}

