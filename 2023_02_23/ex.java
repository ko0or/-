import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ex {
	public static void main(String[] args) {

		// new Lotto();
		// new gugudan();
		new ExHashMap().TestTwo();
		
	}	
}


/*			 
	랜덤함수를 이용한 로또 만들기 !
	---------------------------->
 */

class Lotto {
	Lotto() {
		// List 생성
		List<Integer> arrays = new ArrayList<>();
		
		// 로또번호 만들기 ( 세로 6 x 가로 5 )
		for (int i=0; i<30; i++) {
			// 난수 만들기
			int randInt = (int)(Math.random()*45)+1; 
			
			// 만들어진 난수가 arrays에 존재하지않다면
			if (!arrays.contains(randInt)) { 
				arrays.add(randInt);									 // 중복되지않은 난수를 추가해줌
				System.out.print(arrays.get(i) + " "); 	 // 추가된 내용 줄바꿈 없이 출력
				if ( (i+1) %5 == 0 ) System.out.println(); // 가로 5개 단위로 줄바꿈 처리
			
			// 만들어진 난수가 arrays에 존재한다면, 실행을 되돌려서 재실행
			// 언제까지? --> 만들어진 난수가 arrays에 존재하지않는게 나올때까지
			} else { 	i--;	}
		}
	}
}



/*			 
	구구단 출력 , 2단 - 9단까지 !
	---------------------------->
 */

class gugudan {

	gugudan() {
		for (int y=2; y<=9; y++) {
			System.out.println(y + "단 -------------------------> ");
			for (int x=1; x<=9; x++) {
				System.out.println(y + " * " + x + " = " + x*y);
				
			}
		} // 이중 for문 종료 
		
		// 생성자및 클래스 종료
	} 	
}



class ExHashMap {
	
	public ExHashMap() {
		// TODO 파이썬의 딕셔너리 .. ?

		
	}
	
	public void Original() {
		// TODO 기본 사용방법 , 선언 + 할당
		Map<String,Integer> map=new HashMap();	//<키 자료형, 값 자료형>
		map.put("A", 100);
		map.put("B", 101);
		map.put("C", 102);
		map.put("C", 103); //중복된 key가 들어갈때는 이전 키,값을 지금의 것으로 업데이트
		System.out.println("Key list " + map);
		System.out.println("[Key= A,  Value= " + map.get("A") + "]");
		System.out.println("[Key= B,  Value= " + map.get("B") + "]");
		System.out.println("[Key= C,  Value= " + map.get("C") + "]");
	}
	
	public void TestOne() {
		// TODO 직접 사용해보기
		Map<String, Integer> map = new HashMap<>();
		
		// 추가
		map.put("사과",   	 3000);
		map.put("바나나",   2500);
		map.put("토마토",   4700);
		
		// 관련 메소드 size(), keySet(), get()
		System.out.println( "map.size() -> " + map.size() ); // 키값의 총 갯수를 반환 
		System.out.println( "map.keySet() -> " + map.keySet() ); // 모든 키값을 반환
		System.out.println("Key=Value List -> " + map); // 키값과 벨류들의 쌍을 모두 반환
		System.out.println(  "map.get(\"사과\") -> " + map.get("사과")  );
		
		// 삭제
		map.remove("사과");
		System.out.println( "map.remove(\"사과\")" );
		System.out.println(  "map.get(\"사과\") -> " + map.get("사과")  );
		
		// 조회
		System.out.println("map.containsKey(\"사과\") -> " + map.containsKey("사과") );
		System.out.println("map.containsKey(\"바나나\") -> " + map.containsKey("바나나") );
				
		
	}
	
	
	public void TestTwo() {
		// HushMap에 배열을 사용해보기 !
		String arr[][] = {
				{"철수", "Id", "Password"},
				{"영희", "Id", "Password"},
				{"민수", "Id", "Password"}
		};

		
		// 선언
		Map<Integer, String[]> account = new HashMap<>();
		
		// 할당
		account.put(0, arr[0]);
		account.put(1, arr[1]);
		account.put(2, arr[2]);
		
		// 출력
		System.out.println( "메뉴판" );
		for (int i=0; i<account.size(); i++) {
			System.out.println( 
					account.get(i)[0] + ", " +
					account.get(i)[1] + ", " + 
					account.get(i)[2] 			);
		}
	
	}

	
	
	
}


