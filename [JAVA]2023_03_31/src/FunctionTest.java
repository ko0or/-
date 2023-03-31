import java.util.function.Function;

public class FunctionTest {
	public static void main(String[] args) {
		
//		 인터페이스 사용 : Function (첫재 제네릭은 받고자 하는 타입, 둘째 제네릭은 반환해줄 타입)
		Function<Integer, Integer> f1 = i -> i*4;
		
//		 만들어진 람다식을 사용 : .apply() 메소드
		f1.apply(3);
		
		
		
//		 ===>
		
//		받는타입 String , 반환타입 Integer
//		매개변수 s 를 받아서 길이(s.length)를 반환하는 람다식
		Function<String, Integer> f2 = s->s.length();
		System.out.println( f2.apply("Hello") );
	}
}
