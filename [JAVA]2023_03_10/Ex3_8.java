public class Ex3_8 {
    public static void main(String[] args) {
        
        // 문자열에서 r 알파벳 갯수 구하기
        // toCharArray() 메소드 사용

        int count = 0;
        String  str = "Programing is fun! Right?";

        // toCharArray() : 문자열에서 문자를 하나씩 갖고 옴
        char[] charArr = str.toCharArray();

        for (int i = 0; i < charArr.length; i++) 
        if (charArr[i] == 'R' || charArr[i] == 'r') { count++; }
        
        
        System.out.println( str );
        System.out.println( "=> R(r)의 갯수 : " + count );




    }
}
