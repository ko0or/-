public class StringEx {
	public static void main(String[] args) {
		
		String a = new String("  C#");
		String b = new String(",C++  ");
		
		System.out.println(a+"의 길이는 "+a.length()); 	// 스페이스바 포함된 길이
		System.out.println(a.contains("#")); 				// true
		System.out.println(a.contains("*")); 					// false
		
		a = a.concat(b);
		System.out.println(a); // C#,C++ (새로운 문자열을 a가 가리킴)
		
		
		// 앞뒤 공백제거
		a = a.trim(); 
		System.out.println(a);
		
		// 문자열 대체
		a = a.replace("C#", "Java");
		System.out.println( a );
		
		
		// 문자열 자르기
		String s[] = a.split(",");
		for (int i = 0; i < s.length; i++) { System.out.println( "분리된 문자열 " + i + ": "  + s[i]);	}
		
		
		// 해당 인덱스부터 끝까지
		a = a.substring(5);
		System.out.println(a);
		
		// 해당 인덱스의 char 반환
		char c = a.charAt(2);
		System.out.println( c );
		
		
		
	}
}
