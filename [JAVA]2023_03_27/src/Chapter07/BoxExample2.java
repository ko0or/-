package Chapter07;

public class BoxExample2 {
	public static void main(String[] args) {
		
		// BoxExample 1 과 달리,  이후에 다운캐스팅 할 필요가 없음 
		// 자바 7부터는 new에 붙는 <> 생략가능 -> 다이아몬드 파라미터
		
		// Box1에 T 가 들어간 내용은 모 ~두  String 으로 변경된다. (매개변수 타입, 리턴타입.. 등등 )
		Box2<String> Box1 = new Box2<>();
		
		
		// 제네릭을통해 객체 내부는 String으로 명시적 형변환되어버렸기에
		// 꺼내올때는 자동형변환이 되고, 그래서 전과 달리 명시적 형변환을 할 필요가 없다.
		// 이게, 제네릭을 사용해야하는 이유이다.
		Box1.set("hello");
		// Box1.set(777); // 다른 타입감지
		
		String greet = Box1.get();
		System.out.println(greet);
		
		
		
		
		Box2<Integer> box2 = new Box2<Integer>();
		box2.set(777);
		int value = box2.get(); // auto-unBoxing
		System.out.println( value );
		
		
		
		
	}
}
