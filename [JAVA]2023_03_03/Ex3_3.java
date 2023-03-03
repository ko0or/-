public class Ex3_3 {
/*
for 반복문 사용해서, 1 ~ 10까지 합계 출력
*/
    public static void main(String[] args) {
        
        int sum = 0;
        for (int i=1; i<=10; i++) {
            sum += i;
        }
        System.out.println("합계 > " + sum );

    }
}
