import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MainTest2 {
	public static void main(String[] args) {
		
		List<String> sList = new ArrayList<>();
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");
		
//		어떤 요소가있나 확인
		Stream<String> stream = sList.stream();
		stream.forEach( s -> System.out.print( s + " ") );
		System.out.println( "\n" + "---------------------------------");
		
//		알파벳 순으로 정렬 (오름차순)
		sList.stream().sorted().forEach( s -> System.out.print( s + " ") );

//		데이터 변형할때 사용하는 map -> 길이로 변경
		System.out.println( "\n" + "---------------------------------");
		sList.stream().map( s -> s.length() ).forEach( n -> System.out.print( n + " " ) );
		
//		길이가 5이상인것만 출력하기
		System.out.println( "\n" + "---------------------------------");
		sList.stream().filter( s -> s.length() >= 5 ).forEach( n -> System.out.print( n + " ") );
		
		
	}
}
