import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestFile {
	public static void main(String[] args) {
		
		String s = DateTimeFormatter
				.ofPattern("YYYY-MM-dd (E) HH:MM")
				.format(LocalDateTime.now());
		
		System.out.println( s );
		
		LocalDateTime date = LocalDateTime.now();		
		System.out.println( date.getHour() + "시" + date.getMinute() + "분");
		
		
		LocalDateTime myDateTime = LocalDateTime.of(2021, 1, 1, 0, 0, 0);
		
	}
}
