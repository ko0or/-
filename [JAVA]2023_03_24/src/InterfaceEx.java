/*  전화걸기, 받기, 화면에 폰이라고 출력 */
interface PhoneInterface {
//	public static final int TIMEOUT = 100;
	int TIMEOUT = 100;   // 컴파일시 위 주석처리된 내용으로 이해한 다음에,   실행된다

	
//	public abstract void sendCall();
	void sendCall(); // 컴파일시 위 주석처리된 내용으로 이해한 다음에,   실행된다
	void receiveCall();
	
	// default라고 명시한경우에는, 인터페이스가 아닌 기본 맴버함수로 사용한다는 뜻
	// 그러니까, 평소와같이 블럭 {} 을 만들어줘야한다. 
	default void printLogo() { 
		System.out.println("** Phone **");
	}	
}

// 삼성폰을 만들때, 기본폰 기능을 사용 (전화걸고, 받는 것)
class SamsunPhone implements PhoneInterface {
	@Override
	public void receiveCall() {
		System.out.println("띠리리리리링");
	}
	@Override
	public void sendCall() {
		System.out.println("전화가 왔습니다.");
	}	
	
	public void flash() { System.out.println("전화기에 불이 켜졌습니다."); }
}
 


public class InterfaceEx {
	public static void main(String[] args) {
		
		SamsunPhone phone = new SamsunPhone();
		phone.printLogo(); // 인터페이스에서 구현된 default method 사용
		
		phone.sendCall();			// 추상메소드 오버라딩해서 사용
		phone.receiveCall();	// 추상메소드 오버라딩해서 사용
		phone.flash();				// 삼성폰만의 기능
		
		
		
		
	}
}
