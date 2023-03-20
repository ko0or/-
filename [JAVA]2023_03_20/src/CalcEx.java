// 접근지정자 : default
class Calc {
		//public int abs(int a) { 								// non-static -> 객체생성해야만 쓸 수 있음 
		//static int abs(int a) { 								// static -> 객체생성없이도 쓸 수 있음 
		//private static int abs(int a) { 				// 접근제한자 private -> 같은 클래스안에서만 접근가능
		//static int abs(int a) { 								// 접근제한자 default -> 같은 패키지안에서만 접근가능
		protected static int abs(int a) { 			// 같은 패키지 or 상속관계에서만 접근가능
		return a>0?a:-a; // 절대값 반환 (삼항연산자 이용)
	}
		
		static int max(int a, int b) {
			return a>b?a:b; // 둘중에 더 큰 값 반환
		}
		static int min(int a, int b) {
			return a<b?a:b; // 둘중에 더 큰 값 반환
		}
}

// 접근지정자 : public 
public class CalcEx {
	public static void main(String[] args) {
		
		System.out.println( Calc.abs(-5) );
		System.out.println( Calc.max(10,8) );
		System.out.println( Calc.min(-3, -8) );
		
		
		
		
		
	}	
}
