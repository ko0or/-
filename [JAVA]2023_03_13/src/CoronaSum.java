public class CoronaSum {
	
/*
		2차원 배열을 사용하여 각 월별로 3개의 도시에 발생된 코로나 환자수를 저장하고
		저장된 합을 출력하라 ( 12개월, 3개의 도시   배열[12][3] )
		
		
		1월은 11, 12, 13명이 발생
		2월은 21, 22, 23명이 발생
		..
		12월은 121, 122, 123명이 발생한다
		
 */
 
	
	
	public static void main(String[] args) {
		int sum = 0;
		

		/*

		// 내가 작성한 코드

		int Corona[][] = new int[12][3];
		for (int i = 0; i < Corona.length; i++) {
			for (int j = 0; j < Corona[i].length; j++) {
				Corona[i][j] = (i+1)*10 + j+1;
				sum += Corona[i][j]; 
			}
		}
		
		System.out.println( "1년간 전체 코로나 환자 수는 " + sum );
		*/
		
		
		// 강사님 ver
		
		int corona[][] = {
				{11, 12, 13},
				{21, 22, 23},
				{31, 32, 33},
				{41, 42, 43},
				{51, 52, 53},
				{61, 62, 63},
				{71, 72, 73},
				{81, 82, 83},
				{91, 92, 93},
				{101, 102, 103},
				{111, 112, 113},
				{121, 122, 123}
		};
		
		for (int month = 0; month < corona.length; month++) {
			for (int city = 0; city < corona[month].length; city++) {
				System.out.print(corona[month][city] + " ");
				corona[month][city] = (month+1)*10 + month + 1;
				sum += corona[month][city];
			}
			System.out.println();
		}
		System.out.println( "1년 전체 코로나 환자수는 " + sum );
		
		
	}
}
