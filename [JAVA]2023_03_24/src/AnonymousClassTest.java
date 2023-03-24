interface RemoteControl {
	void turnOn();
	void turnOff();
}

public class AnonymousClassTest {
	public static void main(String[] args) {
		
		// 익명클래스 정의 (인터페이스 이름 사용)
		RemoteControl ac = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("TV run0n");
			}			
			@Override
			public void turnOff() {
				System.out.println("TV run0ff");
			}
		};
		
		// 생성된 익명클래스의 맴버함수 호출 (AnonymousClass)
		ac.turnOn();
		ac.turnOff();
		
		
	}
}
