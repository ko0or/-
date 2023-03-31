import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MainTest4 {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>(
				Arrays.asList( 1, 2, 3, 4, 5)
		);
		
		int sum2 = list.stream().mapToInt( n -> n ).sum();
		int sum3 = IntStream.of(20, 10, 30).sum();
		
		System.out.println( "sum2= " + sum2 );
		System.out.println( "sum3= " + sum3 );
		
		
	}
}
