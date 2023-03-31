import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample2 {
	public static void main(String[] args) {
		
		// Arrays.asList() 는 리턴타입이 List 이다.
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		System.out.println( "입력 데이터= " + numbers );
		
//		리스트를 또 다시 리스트로 만든다 (의문점 : /그냥 result = numbers 하면 안될까 .. ? )
//		List<Integer> result = numbers.stream().collect( Collectors.toList() );

		List<Integer> result = numbers.stream()
				.filter( n -> n%2 == 0 ) // 짝수만 필터하고
				.map( n -> n*n  )			// 필터된 값을 제곱한다
				.collect( Collectors.toList() );		// 결과를 result로 저장 (stream 끝까지)
		
		
		System.out.println( "실행결과=" + result );
		
		
	}
}
