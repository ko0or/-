@FunctionalInterface // 어노테이션 역할 : 추상 메소드가 1개만 작성될 수 있게 체크
interface MyFunction5<T> { // 제네릭 타입 T를 가진 함수형 인터페이스 (함수형 인터페이스: 추상 메소드가 1개만 존재하는 인터페이스)
	void print(T x);
}

public class LambddaEx5 {
	public static void main(String[] args) {

		MyFunction5<String> f1 = (x) -> {
			System.out.print("타입: " + x.getClass().getName() );
			System.out.println(", 내용: " + x );
		};
		
		f1.print( "ABC" );
		
		MyFunction5<Integer> f2 = (x) -> {
			System.out.print("타입: " + x.getClass().getName() );
			System.out.println(", 내용: " + x );
		};
		
		f2.print( 123 );
		
	}	
}
