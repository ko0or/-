public class Main {
	public static void main(String[] args) {
		
		// new Animal(); // 객체생성 불가
		Animal a; // 참조변수 선언은 된다.
		
		Penguin p = new Penguin();
		
		p.swim();
		
		
		Bird p2 =  new Penguin(); // up-casting
		// p2.swim(); // 업캐스팅은 슈퍼클래스의 맴버만 접근 가능(오류발생)
		p2.walk(); // 슈퍼클래스 맴버 호출
		
		Penguin p3 = (Penguin)p2; // down-castiong : 명시적 형변환필요 (and 업캐스팅된 상태여야만 함)
		p3.swim();
		
		
		Bird d = new duck(); // up-casting
		d.eat(); //업캐스팅은  슈퍼클래스의 맴버만 접근가능
		
		duck d2 = (duck)d; // down-casting
		d2.fly(); // 다운캐스팅은 모든 맴버 접근가능
		
		Animal d3 = new duck();
		int x = d3.life;
		System.out.println("x=====>  " + x );
		
		// new Swim2(); // 인터페이스도 객체생성불가
		
		Swim2 s = new Penguin();
		s.swim();
		
		// 객체배열과 형태가 비슷
		Swim2[] s2 = 	new Swim2[2];
		
		s2[0] = new Penguin();
		s2[1] = new duck();
		
		s2[0].swim();
		s2[1].swim();
		 
				
		
		
		
		
		
					
		 
		
	}
}
