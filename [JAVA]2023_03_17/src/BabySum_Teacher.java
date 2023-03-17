public class BabySum_Teacher {
	public static void main(String[] args) {
		
		int baby[][] = new int[120][5];
		int sum = 0;
		
		for (int month = 0; month < baby.length; month++) {						// baby.length: 				120 번 반복
			for (int contury = 0; contury < baby[0].length; contury++) { 	// baby[month].length: 5번 반복
				baby[month][contury] = (month+1)*100 + contury+1;
				sum += baby[month][contury];
			}
		}
		
		System.out.println( " 10년간 5개 나라의 총 신생아 수는 " + sum);
		
		
	}
}
