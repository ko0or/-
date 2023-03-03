public class ForTest {
/*
 for을 이용하여 0부터 99까지 짝수들의 합을 계산하라.
 
 */
    public static void main(String[] args) {
        // 내가해본거
        /*

        // 초기화
        int sum=0;
        
        // 2씩 증가된 값을, sum이 갖고있는 값에 추가해줌
        for (int i=0; i<100; i+=2) sum+=i;
        
        // 출력
        System.out.println(sum);
        */



        // 강사님 ver
        
        int sum=0, i;
        // 0 ~ 99 까지 짝수만
        for (i =0; i < 100; i+=2) {
            sum += i;
        }
        System.out.println(sum);
    }
}
