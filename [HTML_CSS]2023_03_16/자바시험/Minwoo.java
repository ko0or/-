public class Minwoo {
    public static void main(String[] args) {
        
    	// 1부터 99까지 반복
    	for (int i = 1; i <= 99; i++) {
    		
    		// 초기값 세팅 ( 카운트, 십의 자리,  일의 자리 )
    		int count = 0;
    		int ten = i / 10; 
			int one = i % 10;
			
			// 십의 자리, 일의 자리에 해당할때마다 카운트 증가
    		if (ten%3 == 0 && ten!= 0) { count ++; }
    		if (one%3 == 0 && one%10 !=0) { count ++; }
    		
    		// 증가된 카운트가 1개라면 박수한번,  2개라면 박수 두번을 출력
    		if (count == 1) {
    			System.out.println( i + "\t" + "박수한번");
    		} else if (count == 2) {
    			System.out.println( i + "\t" + "박수두번");
    		}
    		
     	
    	} // for 종료
    	
    	
    }
}
