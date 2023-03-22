import java.util.Scanner;

public class Trapezoid {
	
	int down, up, height;
	
	public Trapezoid(int down, int up, int height) {
		super();
		this.down = down;
		this.up = up;
		this.height = height;
	}

	double getArea(int down, int up, int height) {
		return (down+up)*height / 2;
	}
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Trapezoid t;
		
		int down, up, height;
		System.out.print(">> ");
		down = scanner.nextInt();
		up= scanner.nextInt();
		height = scanner.nextInt();
		
		t = new Trapezoid(down, up, height);
		System.out.println("사다리 꼴의 면적은 " + t.getArea(down, up, height) );
		
		scanner.close();
		
	}	
}
