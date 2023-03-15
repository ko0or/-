package Chapter04;
public class Book {
	
	String title;
	String author;
	
	public Book() {	} 
	
	// B. 생성자 매개변수가 1개일때 실행될 내용
	public Book(String t) {
		// C. 입력받은 매개변수를 맴버변수 title 에 할당하고,  author에는 작자미상을 할당.
		title = t; // 춘향전
		author = "작자미상";
	} 
	
	// 2. "어린 왕자",  "생텍쥐베리" 2개를 매개변수로 받는다.
	public Book(String t, String a) {
		
		// 3. 매개변수를 맴버변수에 할당한다
		
		title = t;			// 어린왕자
		author = a;		// 생텍쥐베리
	}
	
	
	public static void main(String[] args) {
	
		// 생성자가 하나라도 존재하면 (컴파일러가) 기본생성자를 만들어주지않는다.
		// new Book();
		 
		// 1. 매개변수 2개를 갖고있는 생성자를 호출한다
		Book littelPrince = new Book("어린왕자", "생텍쥐베리");
		System.out.println( littelPrince.title + " " + littelPrince.author );
		
		
		
		// A. 매개변수 1개를 갖고있는 생성자를 호출한다. 
		Book loveStory = new Book("춘향전");
		System.out.println( loveStory.title + " " + loveStory.author );
		
		
	}
}
