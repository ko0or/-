package Chapter08;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		
		// 객체생성, 업캐스팅, 제네릭타입 String
		List<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP"); 
		list.add(2, "Database"); // 끼워넣기 : 2번 인덱스에 삽입되어서 2번이 밀려남
		list.add("Spring");
		
		int size = list.size();
		System.out.println( "총 list 갯수 : " + size );	// 총 list 갯수 : 5
		
		String skill = list.get(2);
		System.out.println( "2번째 인덱스 : " + skill ); // 2번째 인덱스 : Servlet/JSP

		
		for (int i = 0; i < list.size(); i++) {
			 String s = list.get(i);
			 System.out.println( i + ": " + s );
		}
		
		
		list.remove( 2 );
		for (int i = 0; i < list.size(); i++) {
			 String s = list.get(i);
			 System.out.println( i + ": " + s );
		}
		
		list.remove("Spring");
		for (int i = 0; i < list.size(); i++) {
			 String s = list.get(i);
			 System.out.println( i + ": " + s );
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
