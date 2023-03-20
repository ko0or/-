// 슈퍼클래스 (부모)
class Point {
	// Point 클래스 : (x, y) 한점을 표현
	// Point 클래스를 상속받는 ColorPoint 클래스 ( 색을 가진 점 )
	
	 private int x,y; // [3] set 메소드에 의해 값이 저장된다
	 
	 // [2] 매개변수롤 맴버변수로 세팅 
	 public void set(int x, int y) {
		 this.x = x;
		 this.y = y;
	 }
	 
	 // 맴버변수를 출력한다
	 public void showPoint() {
		 System.out.println(  "(" + x + ", "+ y + ")"  );
	 }
}


// 서브클래스 (자식) , 부모의 생성자까지 갖고오는건 아니다.
class ColorPoint extends Point {
	
	private String color;
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void showColorPoint() {
		System.out.print(color);
		 showPoint(); // 상속받은 Point 클래스의 맴버함수 호출
		
	}
}


public class ColorPointEx {
	public static void main(String[] args) {
		
		Point p = new Point(); // 객체를 생성, 맴버는 4개, 컴파일러가 기본 생성자 호출한다.
		
		// [1] 메소드 호출 
		p.set(1, 2);
		p.showPoint();
		
		
		ColorPoint cp = new ColorPoint(); // 맴버갯수 7 ( 부모꺼 4개 + 본인거 3개 = 총 7개 ), 기본 생성자 호출
		cp.set(3, 4); // 상속받은 Point 클래스의 set 이라는 맴버함수를 사용
		cp.setColor("빨간색"); // ColorPoint 클래스의 setColor 맴버함수에다가 빨간색이라는 인수(arg)를 던져줌
		cp.showColorPoint();
		cp.showPoint();
		
		
		
	}
}
