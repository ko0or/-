// 생명1개(객체 생성시 맴버 4개)
// 조류를 상속받는 펭귄, 오리를 만든다.
abstract class Bird extends Animal {
	
	public int wing = 2;
	
	public void walk() {
		System.out.println("walk");
	}
	
	public void eat() {
		System.out.println("eat");
	}
		
		
	
}
