interface MyFunction {
//	인터페이스 안에서 정의된 메소드는 컴파일될때 ` static abstract ` 키워드가 자동으로 붙는다
	int calc(int x, int y); 
}

public class LambdaEx1 {
	public static void main(String[] args) {	

//	객체타입	 참조변수		 =		 오버라이딩(?)
		MyFunction add = (x,y) -> { return x+y; }; // 기본 사용방법 1
		MyFunction minus = (x,y) -> x-y;					// 더 간결하게 써보기 : return 과 {} 중괄호 생략가능
		
		System.out.println( add.calc(1, 2) ); 			// 1 + 2 , 출력은 3
		System.out.println( minus.calc(10, 2) );		// 10 - 2 , 출력은 8
		
		
	}
}
