package Chapter04;
public class Circle2 {
	
	// 3. 맴버변수 radius 가 1,  name은 공백
	// c. 맴버변수 radius 가 10, name은 자바피자
	int radius;
	String name;
	
	public double getArea() { return 3.14*radius*radius; }
	
	// 2. 생성자가 호출되면서, 맴버변수에 값이 할당된다.
	Circle2() { 
		radius = 1;
		name = "";
	}
	
	
	// b. 생성자에 매개변수 2개 넣었을경우 호출되는 생성자
	Circle2(int r, String n) { 
		radius = r; // 10
		name = n; // 자바피자
	}
	
	



	public static void main(String[] args) {
			
//		// 1. 객체 생성하면서, 생성자 호출 ( 반지름이 1이고, 이름이없는 pizza 객체 생성 )
//		Circle2 pizza = new Circle2();
		
		// a . 매개변수가 2개인 생성자를 호출
		Circle2 pizza = new Circle2(10, "허리 좀 피자");	
		
		double area = pizza.getArea();
		System.out.println( pizza.name + "의 면적은 " + area );
		
		
		// ==================================================== >>>
		
		Circle2 donut = new Circle2(); // 반지름이 1, 이름이 없는 객체 ` donut ` 생성
		donut.name = "자바도넛";
		area = donut.getArea();
		System.out.println( donut.name + "의 면적은 " + area );	
		
		
		
	}
}
