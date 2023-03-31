import java.util.function.Supplier;

public class InstanceMethod {
//	Supplier 인터페이스 : 매개변수는 없고, 반환값만 있음 
	static void print(Supplier<Integer> f) {
		System.out.println( f.get() );
	}

	public static void main(String[] args) {		
		
		String s = "Hello World :)";
//		System.out.println( s.length() ); // s.length() = 14
		
//		print( () -> s.length() ); // 기존 : 람다식 작성방법 () -> {} 
		print(s::length); // 변경 : 메소드 참조 :: 사용
		
	}
}
