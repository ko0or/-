public class Ex3_7 {
    public static void main(String[] args) {
        
        int[] evens = 
        { 0, 2, 4, 6, 8, 10, 12, 14, 16, 18 };
        
        int[] primes = 
        { 2, 3, 5, 7, 11, 13, 17, 19  };

        // 짝수 배열을 메소드 매개변수로 호출
        // System.out.println( sum(evens[]) ); // 오류
        // 1. 배열을 sum 메소드에 인수로(arg) 전달한다

        // 5. 합게를 받아서  저장
        int evenSum = sum(evens);
        int primeSum = sum(primes);

        System.out.println( "짝수 배열의 합: " + evenSum );
        System.out.println( "솟수 배열의 합: " + primeSum );
                       
    }

    // 2. int타입의 배열을 받는 arr 이 있다
    public static int sum(int[] arr) {
        
        // 3. 매개변수 배열크기만큼 반복하면서 sum에 누적
        int sum = 0;
        for (int i = 0; i < arr.length; i++) { sum += arr[i]; }

        // 4. 결과 돌려주기 (배열x 그냥 int 타입)
        return sum;

    }



}
