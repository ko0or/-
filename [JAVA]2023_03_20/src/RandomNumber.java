import java.util.Random;

public class RandomNumber {
	
	public static void main(String[] args) {
		
		int rNumber;
		Random generator = new Random();
		
/* 난수발생
		// 난수발생(범위: int타입 범위->  -2의 31승  ~ 2의 31승 -1 )
		// rNumber = generator.nextInt();
		
		// 난수발생 : 0~9 까지의 정수;
		// rNumber = generator.nextInt(10);
		
		// 난수발생 : 1~10 까지의 정수;
		// rNumber = generator.nextInt(10)+1;
		
		// 난수발생 :  -9 ~ 0의 정수
		// rNumber = generator.nextInt(10)*(-1);
		
		
		
		// 그외에도 타입별 다양한 메소드가 있다
		// generator. nextDouble() nextFloat() nextLong() nextBoolean()
 */
		
		
		while(true) {
			rNumber = generator.nextInt(10)+1;
			System.out.println("rNumber : " + rNumber);
			if (rNumber == 7) {
				System.out.println("게임종료 !");
				break;
			}
			
		}
		
	}
}
