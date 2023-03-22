class Shape {
	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape {
	@Override // @ 는 어노테이션 (시스템 주석)
	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends Shape {
	@Override
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle extends Shape {	
	@Override
	public void draw() {
		System.out.println("Circle");
	}
	

}


public class MethodOverridingEx {
	// Shape p = new Line();   -> 업 캐스팅
	// Shape p = new Shape();  
	// Shape p = new Line();    ->  업 캐스팅
	// Shape p = new Rect();   ->  업 캐스팅
	// Shape p = new Circle();  -> 업 캐스팅
	
	static void paint(Shape p) { 
		p.draw(); // 업캐스팅에 의해서 슈퍼클래스의 draw() 메소드로 갔다가, 오버라이딩 되어서 Line 으로 간다.
	}
	
	
	public static void main(String[] args) {
		
		Line line = new Line();
		paint( line );
		
		paint(new Shape());
		paint(new Line());
		paint(new Rect());
		paint(new Circle());
		
		
	}
}
