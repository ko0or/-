import java.util.Scanner;

public class Trapezoid_Teacher {
	
	int down;
	int up;
	int height;
		
	// 계산 메소드
	public double getArea() {
		return (down+up)*height / 2;
	}

	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Trapezoid_Teacher tra = new Trapezoid_Teacher();
		
		System.out.print(">> ");
		tra.down= scanner.nextInt();
		tra.up= scanner.nextInt();
		tra.height= scanner.nextInt();
				
		System.out.println("사다리 꼴의 면적은 " + tra.getArea() );
		
		scanner.close();
		
	}	
}
