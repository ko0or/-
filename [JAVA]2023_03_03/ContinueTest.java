public class ContinueTest {
/*
문자열에서 특정 문자를 찾는다.
*/
    public static void main(String[] args) {
        
        // 알파벳 n의 갯수 구하기
        int count = 0;
        String s = "no news is good news";

        // 문자열 크기(20)만큼 반복하며, charAt을 통해 문자열의 i 번째 문자위치를 찾음
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'n') {
                count++;
            }
        }
        
        // 반복문이 종료되고, 증가된 count 갯수를 출력
        System.out.println("찾은 갯수 > " + count);

    }
}
