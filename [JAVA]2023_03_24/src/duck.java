// extends 키워드로 4개 받고 (새명1개, 날개2개, 걷다, 먹는다)
// 인터페이스 다중상속 : implements 키워드로 하나씩, 총 2개를 더 얻는다 
public class duck extends Bird implements Swim2, Fly {
	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("duck swims. ");
	}
	
	@Override
	public void fly() {
		System.out.println("duck flies. ");
	}
	
}
