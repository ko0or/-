import java.util.Scanner;

public class ArrayLength {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);


        /* 내가 작성한 코드        
        int[] intArray = new int[5];
        double sum = 0;
        
        System.out.print("5개의 정수를 입력하세요>> ");
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = scanner.nextInt();
            sum += intArray[i];
        }

        System.out.println("평균은 " + sum/intArray.length);
         */




        // 강사님 ver
        int intArray[] = new int[5];
        int sum = 0;

        System.out.println(intArray.length + "개의 정수를 입력하세요>> ");

        for (int i = 0; i < intArray.length; i++) {
            // 5번 반복해서 배열원소에 정수를 저장
            intArray[i] = scanner.nextInt();
            // sum += intArray[i];
        }

        for (int i = 0; i < intArray.length; i++) {
            sum += intArray[i];
        }

        System.out.println("평균은 " + (double)sum/intArray.length);
        scanner.close();
        
    }
}
