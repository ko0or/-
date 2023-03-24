class Point3 {
	private int x,y;
	
	// a-> (2, 3)     b-> (2, 3),    c->(3, 4)
	public Point3(int x, int y) { this.x = x; this.y = y; }
	@Override
	public boolean equals(Object obj) {
		Point3 p = (Point3)obj;
		
		if (x == p.x && y == p.y) {
			return true; 
		} else { return false; }
		
	}	
}


public class EqualsEx {
	public static void main(String[] args) {
		
		Point3 a = new Point3(2, 3);
		Point3 b = new Point3(2, 3);
		Point3 c = new Point3(3, 4);
		
		if (a == b) {
			System.out.println("a == b");
		} else { System.out.println(" a != b "); }
		
		
		if (a.equals(b)) { System.out.println("a is equal to b ");
		} else { System.out.println("a is equal not to b "); }
		
		if (a.equals(c)) { System.out.println("a is equal to c ");
		} else { System.out.println("a is equal not to c "); }
		
		System.out.println( a.equals(b) );
		
		String f = "apple";
		System.out.println( f.charAt(0) == 'a' );
		
		
		
		
		 
		
	}
}
