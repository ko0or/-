@FunctionalInterface
interface MyFunction3 {
//	인터페이스 안에서 정의된 메소드는 컴파일될때 ` static abstract ` 키워드가 자동으로 붙는다
	void print();
}

public class LambdaEx3 {
	public static void main(String[] args) {	
	
//		람다식 작성 ( 매개변수가 없음으로 소괄호에 아무것도 작성하지않는다 )
		MyFunction3 f = () -> { System.out.println("Hello"); };
		// MyFunction3 f = () -> { System.out.println("Hello"); };
		//@Override print() { System.out.println("Hello"); }
		
//		Hello 가 출력된다
		f.print();
		
//		람다식 재작성 ( 똑같이, 매개변수가 없음으로 소괄호에는 아무것도 안들억나다 )
		f = () -> System.out.println("안녕");
		f.print();
		
		
		
	}
}
