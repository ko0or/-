public class NumberFormatException {
/// 문자열을 정수로 변환하기 ( 변환불가시 에러발생 )
	public static void main(String[] args) {
		
		String[] stringNumber = { "23", "12", "3.141592", "998" };
		int i;
		
		for (i = 0; i < stringNumber.length; i++) {
			try {
					int j = Integer.parseInt( stringNumber[i] );
					System.out.println( "index[" + i + "] > " + j );
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println( stringNumber[i] + "는 정수로 변환할 수 없습니다.");
				 
			}
		}
		
		
	}
}
