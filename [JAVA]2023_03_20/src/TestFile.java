public class TestFile {
	public static void main(String[] args) {
		
		// String도 참조타입이지만 Call of Reference 가 되지는 않는다.
		
		String a = "apple";
		
		changeStr(a);
		System.out.println(a);
		
		
	}
	
	static String changeStr(String getStr)  {
		getStr = "banana";
		return getStr;
	}
	
}


