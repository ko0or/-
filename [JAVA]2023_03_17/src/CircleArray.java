class Circle3 {
	
	// 맴버변수
	int radius;
	
	// 생성자
	public Circle3() {
		// TODO Auto-generated constructor stub
	}	
	public Circle3(int radius) {
		this.radius = radius;
	}
	
	// 맴버함수
	public double getArea() {
		return 3.14*radius*radius;
	}
}


public class CircleArray {
	public static void main(String[] args) {
		
		Circle3[] c;										// Circle3 에 대한 참조변수 c 선언
		c= new Circle3[5]; 							// 참조변수를 여러개만듬 ( 배열 )
		
		for (int i = 0; i < c.length; i++) { 	// c.length : 5번 반복
			
			/* 반복하면서 생성자를 호출해주기 ! */
			c[i] = new Circle3(i);
			
			/* 생성된 객체의 맴버함수를 통해서 결과확인해보기 */
			System.out.printf(	"c[%d].getArea() \t->\t %.1f \n", i , c[i].getArea() );
			
		}
		
		
		
		
		
	}
}
