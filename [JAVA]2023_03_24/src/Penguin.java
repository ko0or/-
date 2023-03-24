// 생명1개, 날개2개, 걷다, 먹는다.
// 위 4개
// +
// 인터페이스 수영한다 까지
// =
// 총 5개

public class Penguin extends Bird implements Swim2 {

	@Override
	public void swim() {
		System.out.println("penguin swims");
	}
	
	
	
}
