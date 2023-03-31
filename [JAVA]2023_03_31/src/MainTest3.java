import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MainTest3 {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i < 8; i++) { 
			list.add( i ); 
		}
		
		Stream<Integer> myStream = list.stream();
		
//		람다식 표현
//		myStream.filter( s -> (s>=5) ).forEach( n -> System.out.println( n ) );
		
//		메소드 참조 방법
		myStream.filter( s -> (s>=5) ).forEach( System.out::println );

		
	}
}
