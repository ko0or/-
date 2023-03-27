package Chapter08;

import java.util.Iterator;
import java.util.Set;

class AA {
	
}

public class HashSetExample {
	public static void main(String[] args) {
		
		// Set 인터페이스 컬렉션 타입으로 HashSet 클래스 객체생성
		Set<String> set = new java.util.HashSet<>();
		set.add("java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		// set.add("java"); // set 컬렉션 중복 객체 추가불가
//		AA a = new AA();
//		set.add(a);
		set.add("iBatis");
		
		
		int size = set.size();
		System.out.println("총 객체수 : " + size);
		
		// set 컬렉션은 iterator 메소드 호출해서 Iterator 인터페이스 타입으로 값을 받음
		Iterator<String> iterator = set.iterator();
		while ( iterator.hasNext()  ) {
			String element = (String) iterator.next();
//			String element = iterator.next().toString();
			System.out.println( "\t" + element );
		}
		
		
		set.remove("JDBC");
		size = set.size();
		
		System.out.println("총 객체수 : " + size);
		for (String string : set) { System.out.println("\t" + string); }
		
		if (set.isEmpty()) {
			System.out.println("비어있음");
		} else {
			System.out.println("객체 있음");
		}
		
		set.clear();
		
		if (set.isEmpty()) {
			System.out.println("비어있음");
		} else {
			System.out.println("객체 있음");
		}
		
		
	}
}
