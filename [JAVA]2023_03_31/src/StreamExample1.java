import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample1 {
	public static void main(String[] args) {

		// List 는 인터페이스이고,   Arrays.asList 반환 타입도 List 이면
		// 인터페이스 참조변수 = 인터페이스 ?
		
		List<String> words = Arrays.asList( "Java" , "Stream" , "Library" );
		
		//List를 Stream 으로 생성해서, 연산한후 다시 List로 받음
 		List<Integer> result = words.stream()				// 시작 : 스트림 생성
 															.map(String::length)		// 메소드참조 (문자열 길이로 바꿈)
 															.collect( Collectors.toList() );	// 종말 : 스트림 종료
		
		System.out.println( result );
		
		
	}
}
