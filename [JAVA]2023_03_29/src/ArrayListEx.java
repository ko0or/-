import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
	public static void main(String[] args) {
		
		// 객체생성
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> names = new ArrayList<>();
		
		// 길이비교용 int,  그리고 길었던 인덱스가 몇번이었는지 기록할 int
		int maxLength = 0;
		int index = 0;
		
		// 4번반복해서 입력받기 + 입력받은후 비교하면서 더 긴 값을 기록하기
		for (int i=0; i<4; i++) {
			System.out.print("이름을 입력하세요>> ");
			names.add( scanner.nextLine() );
			
			if ( maxLength < names.get(i).length() ) {
				index = i;
				maxLength = names.get(i).length();
			}
		}
		
		// 출력
		names.forEach( name -> System.out.print( name + " ") );
		System.out.println( "\n" +"가장 긴 이름은 : " + names.get(index) );
		
		// 종료
		scanner.close();
	}
}
