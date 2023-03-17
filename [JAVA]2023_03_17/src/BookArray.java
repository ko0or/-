import java.util.Scanner;

class Book3 {
	
	// 맴버변수
	String title;
	String author;
	
	// 생성자
	public Book3() {
		// TODO Auto-generated constructor stub
	}
	public Book3(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
}


public class BookArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// book 참조변수가 참조변수 2개를 가리킴
		Book3 book[] = new Book3[2];
		
		// book.length : 2 개  -> 객체를 2번 생성한다. 
		for (int i = 0; i < book.length; i++) {
			System.out.print("제목>> ");
			String title = scanner.nextLine();
			
			System.out.print("저자>> ");
			String author= scanner.nextLine();
			
			book[i] = new Book3(title, author);
		}
		
		for (int i = 0; i < book.length; i++) {
			System.out.println(
					"book[" + i + "] --> 제목: " + book[i].title + ",  " + "저자: " + book[i].author 
			); 
		}
		
		
		
		
	}	
}
