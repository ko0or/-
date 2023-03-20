import java.util.Scanner;


// 접근제한자 : default (같은 패키지에서만 접근허용)
class CurrencyConverter {
	
	// 본인 클래스에서만 접근, 객체 생성없이 사용가능
	// 맴버변수는 일반적으로 private 많이 사용 (보안), jsp및   spring 할때도 많이사용
	// 메소드를 사용해서 맴버변수를 접근해서 사용 ( 직접적인 값 수정을 막음 -> 보안 )
	private static double rate;


	// [2] 환율을 매개변수로 받는다
	public static void setRate(double rate) {
		
		// [3] 매개변수로 받은 환율을 클래스맴버(static키워드가붙은 맴버변수)로 저장한다.
		CurrencyConverter.rate = rate;
	}
	
	public static double getRate() {
		return rate;
	}
	
	public static double toDollar(double won) {
		// 달러 = 원화 / 환율 
		// 예시->  1300원, 환율:1300 -> 1300원/환율1300 = 1달러
		return won/rate; 
	}
	
	public static double toKWR(double dollar) {
		// 예시 -> 환율 1300 * 1달러 = 1300원
		return dollar*rate; // 
	}
	
	
	
	
}

// 접근제한자 : public (모든 패키지에서 접근허용)
public class StaticMember {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("환율(1달러) >> ");
		double rate = scanner.nextDouble();
		
		// [1] 입력받은 환율을 넘긴다.
		CurrencyConverter.setRate(rate);
		
		System.out.println( "백만원은 $" + CurrencyConverter.toDollar(1_000_000) + "입니다.");
		System.out.println( "100$는 " + CurrencyConverter.toKWR(100) + "원 입니다.");
		
		
		
		scanner.close();
	}
}
