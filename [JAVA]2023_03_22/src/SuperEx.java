/* this()의 친구인,  super()를 사용해보자 ! */
class Point2 {
	
	// 맴버변수 2개
	private int x,y;
	
	// 생성자 2개
	public Point2(int x, int y) {  // [B] 자식 클래스에서 super() 메소드로인해 호출되었다
		this.x = x; 	this.y = y; // [5] 맴버변수가 x= 0,  y= 0 이 된다.
	}
	public Point2() {   // [3] 자식클래스에 의해 기본 생성자가 호출된다
		this.x = this.y = 0; // [4] 맴버변수(x, y)를 0 으로 저장
	}
	
	// 게터, 세터
	public int getX() { return x; }
	public int getY() { return y; }
	public void setX(int x) { 	this.x = x; }
	public void setY(int y) { this.y = y;  }
	
	// 맴버함수
	public void showPoint() {
		System.out.printf("(%d, %d)\n", x, y);
	}
}

// ColorPonit2 : 자식,   		   Point2 : 부모
class ColorPoint2 extends Point2 {  // [2] 상속된 부모가 있네? 부모 생성자부터 찾는다
	private String color; // [8] 맴버변수에 매개변수 값이 저장된다 

	public ColorPoint2(int x, int y, String color) { // [6] 맴버저장 
		super(x, y);  /* [A] 2번대신 실행,  this와 다르게 본인이 아닌 부모의 생성자를 호출한다 */
		this.color = color; // [7] String 타입 변수값을 맴버변수 color 에 저장
	}
	
	// 필드출력
	public void showColorPoint() {
		System.out.print(color);
		showPoint();
	}

	
	
}

public class SuperEx {
	public static void main(String[] args) {
		
		// [1] 객체생성시,  생성자를 호출한다
		ColorPoint2 cp = new ColorPoint2(5, 6, "blue"); //객체생성 + x,y 값을 둘다 0 으로 , 색깔은 blue로 세팅
		cp.showColorPoint();
		
		
	}
}
