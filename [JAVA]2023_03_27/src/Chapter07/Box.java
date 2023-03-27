package Chapter07;

public class Box {
	
	// 필드(맴버변수)
	private Object object;
	
	// 게터
	public Object get() {
		return this.object; // (3)
	}
	
	// 세터 (1)
	public void set(Object object) { 
		this.object = object; // (2)
	}
	
	
			
}
