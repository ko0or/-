public class ForSample {
/*
    for문을 이용하여 1부터 10까지 덧셈을 표시하고 합을 구하시오. 
    출력예시) 1+2+3+4+5+6+6+7+8+9+10=55
*/
    public static void main(String[] args) {
        
        // 내가 작성한 코드
        /*
        for (int sum=0, i=1; i<=10; i++) {
            System.out.print(i);
            sum += i;
            if (i<10) { System.out.print("+");         }
            else      { System.out.println("=" + sum);  }   
        }
        */



        // 강사님 ver
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
           
            sum += i;
            if (i<=9) { 
                System.out.print(i+"+");
            } else {
                System.out.print(i+"=");
            }
        }
        System.out.println(sum);



    }
}
