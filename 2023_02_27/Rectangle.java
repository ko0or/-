import java.util.Scanner;

public class Rectangle {
/*
  2차원 평면에서 직사각형은 
  왼쪽 하단 모서리와 오른쪽 상단 모서리의 두 점으로 표현한다.

  (100, 100)과 (200, 200)의 두점으로 이루어진 사각형이있을때, 
  Scanner 를 이용하여 정수 x와 y값을 입력받고  
  점(x,y)가 이 직사각형 안에 있는지를 판별하는 프로그램 작성.

  *.출력
  점(x,y)의 좌표를 입력하시오>>150 150
  (150, 150)는 사각형 안에 있습니다.
*/
    public static void main(String[] args) {
        
        /* ============= 내가 작성한 코드 ============= */
        /*
        // 준비
        Scanner scanner = new Scanner(System.in);

        // 입력
        System.out.print("점(x,y)의 좌표를 입력하시요>> ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        // 비교
        if (  ( x >= 100 && x <= 200 ) && ( y >= 100 && y <= 200 )  ) { 
            System.out.printf("(%d, %d)는 사각형 안에 있습니다. \n", x, y);
        } else { System.out.printf("(%d, %d)는 사각형 안에 없습니다. \n", x, y); }

        // 종료
        scanner.close();
        */



        /* ============= 강사님이 작성하신 코드 ============= */
        Scanner scanner = new Scanner(System.in);
        System.out.print("점(x,y)의 좌표를 입력하시요>> ");

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        
        if ( x>= 100 && x<=200  &&  y >= 100 && y <= 200) {
            System.out.println("(" + x + ", " + y + ")는 사각형 안에 있습니다.");
        } else {
            System.out.println("(" + x + ", " + y + ")는 사각형 안에 없습니다.");   
        }

        scanner.close();

    }
}
