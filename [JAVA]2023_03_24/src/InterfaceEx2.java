/*  전화걸기, 받기, 화면에 폰이라고 출력 */
interface PhoneInterface2 { 
//	public static final int TIMEOUT = 100;
	int TIMEOUT = 100;   
	
//	public abstract void sendCall();
	void sendCall(); 
	void receiveCall();
	
	// default라고 명시한경우에는, 인터페이스가 아닌 기본 맴버함수로 사용한다는 뜻 
	default void printLogo() { 
		System.out.println("** Phone **");
	}	
}


class SamsunPhone2 implements PhoneInterface2 {
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
 

// 문자를 보내고 받는 기능을 추상메소드로 선언
// 인터페이스간의 상속은 extends 를 사용하면된다. (클래스<>인터페이스간에는 implements)
interface MobilePhoneInterface extends PhoneInterface2 {
	void sendSMS();
	void receiveSMS();
}

interface MP3Interface {
	void play();
	void stop();
}

// PDA 기기 : 계산기능을 메소드로 구현
class PDA {
	public int calculate(int x, int y) { return x+y; }
}
class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface {

	@Override
	public void sendCall() {
		System.out.println("띠로리");
		
	}

	@Override
	public void receiveCall() {
		System.out.println("전화가 왔습니다.");
		
	}

	@Override
	public void play() {
		System.out.println("음악을 연주합니다,");
		
	}

	@Override
	public void stop() {
		System.out.println("음악을 중단합니다.");
		
	}

	@Override
	public void sendSMS() {
		System.out.println("문자 날라갑니다");
		
	}

	@Override
	public void receiveSMS() {
		System.out.println("문자가 날라왔네요");
		
	}
	
	public void schedule() {
		System.out.println("일정 관리합니다.");
	}
	
}

public class InterfaceEx2 {
	public static void main(String[] args) {
		
		SmartPhone phone = new SmartPhone();
		phone.printLogo();
		phone.sendCall();
		phone.play();
		System.out.println( phone.calculate(3, 5) );
		
		
		
		
	}
}
