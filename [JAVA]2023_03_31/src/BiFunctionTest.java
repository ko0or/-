import java.util.function.BiFunction;

class Calculator {
	public static int add(int a, int b) {
		return a+b;
	}
}

public class BiFunctionTest {
	public static void main(String[] args) {
		
//		BiFunction 인터페이스는 매개변수 2개를 받고, 한개를 반환
//		BiFunction<입력타입1, 입력타입2, 반환타입> 참조변수 = 람다식
		BiFunction<Integer, Integer, Integer> obj = (x1, x2) -> x1+x2;
		int result = obj.apply(5, 10);
		System.out.println( "주어진 수의 덧셈: " + result );
		
		
		
//		 ====>>
//		:: 메소드참조
//		특정 객체의 메소드 참조
		BiFunction<Integer, Integer, Integer> newObj = Calculator::add;
		System.out.println( newObj.apply(15, 15) );
		
		// Calculator 가 갖고있는 메소드 =  add(int a, int b) { ...  }
	}
}

