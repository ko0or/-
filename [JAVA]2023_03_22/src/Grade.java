import java.util.Scanner;
public class Grade {
	
	// 맴버변수 3개
	int math;
	int science;
	int english;
	
	// 생성자  (매개변수 3개)
	Grade(int math, int science, int english) {
		super();
		this.math = math;
		this.science = science;
		this.english = english;
	}

	// 맴버함수 1개
	public int average() {
		return (math+science+english)/3;
	}

	public static void main(String[] args) {
		
		// 입력받기
		Scanner scanner = new Scanner(System.in);
		System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>> ");
		int math = scanner.nextInt();
		int science= scanner.nextInt();
		int english = scanner.nextInt();
		
		// new 연산자로 맴버변수, 맴버함수 세팅후 결과값 출력  
		Grade me = new Grade(math, science, english);
		System.out.println("평균은 " + me.average());
		
		// 끝
		scanner.close();
		
	}
}
