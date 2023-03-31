interface MyFunction2 {
//	인터페이스 안에서 정의된 메소드는 컴파일될때 ` static abstract ` 키워드가 자동으로 붙는다
	int calc(int x); 
}

public class LambdaEx2 {
	public static void main(String[] args) {	
	
		MyFunction2 square = x -> x*x;		
		System.out.println( square.calc(2) );
		
	}
}
