package Chapter07;

public class BoxExample {
	public static void main(String[] args) {
		
		Box box = new Box();
		
		// Object object = 홍길동; (업캐스팅)
		box.set("홍길동");
			
		// String = Object (다운캐스팅)
		String name = (String) box.get();
		System.out.println( name );

		
		
		// Object object = 777; (업캐스팅)
		box.set(777);
		
		// 다운캐스팅
		int number = (int) box.get();
		System.out.println( number );
		
		
		// 세터로 넘겨질때  업,  게터로 받아올때 다운캐스팅
		box.set( new Apple() );
		Apple apple = (Apple)box.get();
		System.out.println( apple );
		
		
		
	}
}
