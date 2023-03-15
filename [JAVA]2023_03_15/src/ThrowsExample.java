public class ThrowsExample {
	public static void main(String[] args) {
		
		try {
			findClass();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}
	
	
	public static void findClass() throws ClassNotFoundException { 
//		 forName() : 클래스명을 찾는다.	
//		Class.forName("java.lang.String"); // 찾을 수 있음
		Class.forName("java.lang.String2"); // 못찾음
		
		
	}
}
