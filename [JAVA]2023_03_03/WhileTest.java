public class WhileTest {
/*
  while 을 이용하여 0부터 시작하여 99까지
  짝수들의 합을 계산하라.

  *.출력
  2450    

  */
    public static void main(String[] args) {
        
        // 내가한 방법
        /*
        int n = 0;
        int result = 0;

        while (n < 100) {
            if (n %2 == 0) result += n;
            n++;
        }

        System.out.println(".출력");
        System.out.println(result);
        */
        


        // 강사님 방법
        int sum=0; int i=0;

        while (i<100) {
            sum+=i;
            i+=2;
        }
        System.out.println(sum);
    }
}