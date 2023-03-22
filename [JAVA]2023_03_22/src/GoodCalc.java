abstract class Calculator { //추상 메소드가 선언되면, 클래스 이름에도 abstract를 명시해야한다 
//	public int add(int a, int b) { return 1; }
//	public abstract int add(int a, int b) { return 1; } // 추상 메소드는 기능 구현시 오류;
	
	public abstract int add(int a, int b); 			// 추상 메소드 선언
	public abstract int subtract(int a, int b);  // 추상 메소드 선언
	public abstract double average(int[] a);  // 추상 메소드 선언
}

// public abstract class GoodCalc extends Calculator { //추상클래스는 구현 불필요 
public class GoodCalc extends Calculator { // 일반클래스는 오버라이딩 안하면 오류
	public static void main(String[] args) {
		
		// new Calculator(); // 추상 클래스는 객체생성 불가
		
		GoodCalc c = new GoodCalc();
		System.out.println(c.add(2, 3));
		System.out.println(c.subtract(2, 3));
		System.out.println(c.average( new int[] {2,3,4} ));
		
		
	}

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int subtract(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double average(int[] a) {
		// TODO Auto-generated method stub
		double sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i]; 
		}
		return sum/a.length;
	}


}
