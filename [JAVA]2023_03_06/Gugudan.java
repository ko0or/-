public class Gugudan {
/*
    2중 for문을 사용해서
    구구단을 1단부터 9단까지 출력하기
*/
    public static void main(String[] args) {
        
        // 내가 작성한 코드

        /*
        for (int a =1; a<=9; a++) { 
            // 구구단 a * b = (a*b) 줄바꿈없이 출력
            for (int b =1; b<=9; b++) {
                System.out.print(a + "*" + b + "= " + (a*b) + "\t");
            
            } 
            // 단이 넘어갈때마다 줄바꿈 처리
            System.out.println();

        } // 반복문 종료
        */



        // 강사님 ver

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) { 
                System.out.print(i + "*" + j + "=" + (i*j) + "\t" );
            } 
            // 단이 끝날때마다 엔터
            System.out.println();
        }


    }
}
