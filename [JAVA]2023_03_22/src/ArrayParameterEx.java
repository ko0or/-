public class ArrayParameterEx {
	public static void main(String[] args) {
		
		String[] strArray = { "to", "be", "or", "not", "to", "be" };
		printStringArray(strArray);
		
		replaceBe(strArray);
		printStringArray(strArray);		
		
	}
	// 메소드 : 배열의 모~~든 요소들을 출력
	static void printStringArray(String[] args) {
		for (String s : args) { 	System.out.print(s + " "); }
		System.out.println();
	}
	// 메소드 : 배열요소의 특정 값을 바꿔준다
	static void replaceBe(String[] args) {
		for (int i = 0; i < args.length; i++) {
			if ("be".equals(args[i])) { args[i] = "eat"; };		
		}
	}	
	
}
