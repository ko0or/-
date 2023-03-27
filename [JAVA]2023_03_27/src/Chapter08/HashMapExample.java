package Chapter08;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		
		// 업캐스팅
		Map<String, Integer> map = new HashMap<String, Integer>();
		 
		// 키 : 값 으로 구성
		map.put("임영웅", 31);
		map.put("영탁", 38);
		map.put("이찬원", 25);
		map.put("임영웅", 30); // 덮어쓰기
		map.put("김호중", 30);
		
		// map 크기
		System.out.println("총Entry 수 : " + map.size() );
				
		// key값에 대응하는 value 값 부르기
		System.out.println("임영웅: " + map.get("임영웅"));
		System.out.println();
		
		System.out.println(  );
		
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		
		while (keyIterator.hasNext()) {
			String key= keyIterator.next();
			Integer value = map.get(key);	 // get() 메소드로 Map컬렉션의 키를 가지고 값을 갖고옴		
			System.out.println("\t"+key+": "+value);
		}
		
		map.remove("임영웅");
		System.out.println("총Entry 수 : " + map.size() );
		
		
		// Map.Entry 구조로 키/값 객체를 받음
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		// Set 컬렉션 방식으로 객체 처리
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while (entryIterator.hasNext()) { // 객체가 있으면 참
			Map.Entry<String, Integer>entry  = entryIterator.next();
			String key = entry.getKey(); // 키를 가져옴
			Integer value = entry.getValue(); // 값을 가져옴
			System.out.println("\t"+key+": "+value);
		}

		
		map.clear();
		System.out.println("총 Entry 수: " + map.size());
		
		
		
	}
}
