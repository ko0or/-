public class StringBufferEx {
	public static void main(String[] args) {
		
		StringBuffer sb = new  StringBuffer("This");
		System.out.println( sb );
		
		sb.append(" is pencil");			// append(): 기존 문자열 끝에 추가(추가되면서 수정됨)
		System.out.println( sb );		// This is pencil
		
		sb.insert(7, " my"); 					// insert(): n번째 인덱스에 문자열을 추가
		System.out.println( sb );		// This is my pencil
		
		sb.replace(8, 10, "your");		// 8~ 10번째 위치의 char을 지우고,  ` your ` 을 삽입
		System.out.println( sb );
		
		sb.delete(8, 13);						// 8 ~ 13번째 위치의 char을 삭제
		System.out.println( sb );
		
		sb.setLength(4);					 	// 4개 (0 ~ 3까지) 만 남기고 모두 삭제
		System.out.println( sb );
		
		sb.reverse();							// 문자열 뒤집기
		System.out.println( sb );
		
	}	
}
