import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        /*
        Scanner 를 이용하여 
        삼각형의 변의 길이를 나타내는 정수를 3개 입력받고 
        
        이 3개의 수로 삼각형을 만들 수 있는지 판별하라. 
        삼각형이 되려면 두 변의 합이 다른 한 변의 합보다 커야 한다. 
        
        *.출력
        정수 3개를 입력하시오>>4 3 5
        삼각형이 됩니다
        */


        // 입력
        System.out.print("정수 3개를 입력하시요>> ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        // 계산
        if (  (x+y)<=z || (x+z)<=y || (y+z)<=x  ) {
            System.out.println("삼각형이 안됩니다");
        
        } else { System.out.println("삼각형입니다"); }


        // 종료
        scanner.close();


    }
}