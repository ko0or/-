package Chapter07;

// 대문자 알페벳 T를 타입 파라미터로 받은 제네릭
public class Box2<T> { 
	
	// 타입 파라미터를 t의 타입으로 사용
	private T t;
	
	// 게터 : 타입 파라미터를 메소드의 리턴타입으로 사용
	public T get() {
		return t;
	}
	
	// 세터 : 타입 파라미터를 메소드의 매개변수 타입으로 사용
	public void set(T t) {
		this.t = t;
	}
	
	
	
}
