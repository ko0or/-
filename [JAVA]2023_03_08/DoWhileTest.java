public class DoWhileTest {
    public static void main(String[] args) {
        
        // 내가 작성한 코드 
        /*
        int sum =0, i = 0;
        do {
            // 방법 1 ( 짝수일때 증가시키기 )
            if (i%2 == 0) sum += i;
            i++;


            // 방법 2 ( 그냥 2씩 증가시키기 )
            // sum += i;
            // i += 2;

        } while (i < 100);
        
        System.out.println(sum);
        */
        




         // 강사님 ver

        int sum=0, i=0;
        do {
            if (i>99) {
                break;
            }
            sum += i;
            i += 2;

        } while (true);
        
        System.out.println(sum);



    }
}
