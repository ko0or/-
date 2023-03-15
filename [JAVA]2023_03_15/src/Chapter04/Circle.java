package Chapter04;
public class Circle {
	
	/* 클래스 필드 */
	int radius; 		// 필드에있는 ` 맴버변수 `  
	String name; 	// 필드에있는 ` 맴버변수 `
	
	
	/* 클래스 생성자 */
	// 오버로딩
	public Circle() { } 							// 기본 생성자 ( 매개변수가 없다 )
	public Circle(int a) { } 					// 생성자 ( 매개변수가 존재한다 : 1개  )
	public Circle(int a, int c) { } 		// 생성자 ( 매개변수가 존재한다 : 2개  )
	
	
	/* 메소드 (맴버함수) */
	public double getArea() { return 3.14*radius*radius; }
	
	
	public static void main(String[] args) {
		
		// 참조변수 ( 태명과 비슷 ) 선언,  Circle 클래스를 가리키는 변수가 pizza 다.
		Circle pizza;
		
		
		// 객체생성 ( 세상에 태어남 )
		pizza = new Circle();
		
		
		// 맴버변수 값 셋팅
		pizza.name = "허리 좀 피자";
		pizza.radius = 10;
		
		
		// 맴버함수(메소드) 접근
		double area = pizza.getArea();
		
		
		// 출력,  맴버변수 값 사용
		System.out.println( pizza.name + "의 면적은 "  + area );
		
		
		
		
		// ============================>>> 객체 하나 더 만들기
		
		Circle donut =  new Circle(); // 객체 선언 + 생성, 도넛이 세상애 태어났다 !
		donut.radius = 2;
		donut.name = "도넛";
		area = donut.getArea();
		System.out.println( donut.name + "의 면적은 "  + area );
		
		
		
	}
}
