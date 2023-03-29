public class ThreadMainEx {
	public static void main(String[] args) {
		
		// 현재 실행중인 스레드의 이름
		String name = Thread.currentThread().getName();
		
		// 현재 실행중인 스레드의 고유한 번호(ID)
		long id = Thread.currentThread().getId();
		
		// 현재 실행중인 스레드의 실행순위
		int priority = Thread.currentThread().getPriority();
		
		// 현재 실행중인 스레드의 상태
		Thread.State state = Thread.currentThread().getState();
		
		// 출력
		System.out.println("현재 스레드 이름 : " + name );
		System.out.println("현재 스레드 ID : " + id );
		System.out.println("현재 스레드의 우선순위 값(기본값=5) : " + priority );
		System.out.println("현재 스레드의 상태 : " + state );
		
		
	}
}
