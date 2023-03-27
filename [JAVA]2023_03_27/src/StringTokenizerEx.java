import java.util.StringTokenizer;

public class StringTokenizerEx {
	public static void main(String[] args) {
		
		// 문자열 / 기준으로 자른다 (토큰생성) -> 그리고, 잘린 토큰을 t로 받는다
		StringTokenizer t = new StringTokenizer("홍길동/장화/홍련/콩쥐/팥쥐", "/");
		
		// 만약 t 가 갖고있는 token이 존재한다면, 하나씩 출력한다 
		while ( t.hasMoreTokens() ) {	
			System.out.println( t.nextToken() ); 	
			}
		
	}
}