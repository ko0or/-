class Point {
	private int x,y;
	public Point(int x, int y) { this.x = x; this.y = y; }
}

public class ObjectPropertyEx {
	public static void print(Object obj) { // Object obj = new Point(2, 3);
		System.out.println( obj.getClass().getName() );
		System.out.println( obj.hashCode() ); // 366712642 (객체의 서명(10진수 해시코드)
		System.out.println( obj.toString() );  // Point@15db9742 (16진수 해시코드)
		System.out.println( obj );  // toString을 생략해도 실행된다 
	}
	
	public static void main(String[] args) {
		
		Point p = new Point(2, 3);
		print(p);
		
		
	}
}
