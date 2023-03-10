import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayAccess {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        /*
            내가 작성한 코드
         
        int arr[] = new int[5];
        int max = 0;

        System.out.println("양수 5개를 입력하세요.");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            max = (arr[i] > max) ? arr[i] : max;
        }

        // 기본방법
        System.out.println("가장 큰 수는 " + max + "입니다. ");
        
        
        
        // 내가 따로 시도해본거 
        // 오름차순 정렬후 (낮은 숫자부터 시작함),  맨 마지막 - 1 (인덱스 크기가 요소갯수 -1니까)  으로 찾기
        Integer[] getMax = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(getMax);
        System.out.println("오름차순 정렬로 찾은 큰 값 : " + getMax[getMax.length-1]);
        
        // 내림차순 정렬후 (높은 숫자부터 시작함), 첫번째 인덱스 출력하는 방법
        Arrays.sort(getMax, Collections.reverseOrder());
        System.out.println("내림차순 정렬로 찾은 큰 값 : " + getMax[0]);
        */




        // 강사님 ver

        System.out.println("양수 5개를 입력하세요.");
        int[] intArray = new int[5];
        int max = 0;

        for (int i = 0; i < args.length; i++) {
            intArray[i] = scanner.nextInt();
        }

        for (int i = 0; i < args.length; i++) {
            if (intArray[i] > max) { 
                max = intArray[i];
            }
        }

        System.out.println("가증 큰 수는 " + max + "입니다.");

        

        scanner.close();


    }
}
