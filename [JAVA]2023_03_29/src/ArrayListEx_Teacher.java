import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListEx_Teacher {
	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
				
		for (int i=0; i < 4; i++) {
			System.out.print("이름을 입력하세요>> ");
			String s =  scanner.next();
			a.add( s );
		}

		for (int i = 0; i < a.size(); i++) {
			String name = a.get(i);
			System.out.println( name + " ");			
		}
		
		// 핵심★ ; a.get(가장컸던 인덱스번호).length()
		int longestIndex = 0;
		for (int i = 0; i < a.size(); i++) {
			if ( a.get(longestIndex).length() < a.get(i).length() ) {
				longestIndex = i;
			}
		}
		
		System.out.println("\n 가장 긴 이름은 : " + a.get(longestIndex));
		
		scanner.close();
	}
}
