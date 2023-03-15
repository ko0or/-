package Chapter04;
public class Book2 {
	
	String title;
	String author;
	
	public Book2(String title) {
		this(title, "작자미상"); // new Book2(title, "작자미상"); 이랑 같은 뜻임
	}
	
	public Book2() {
		this("", ""); 					// new Book2("",  ""); 이랑 같은 뜻 !
		System.out.println("생성자 호출됨");
		// this("", "");					// 첫번째 줄에 없을경우 오류가 난다
	}
	
	public Book2(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	void show() {
		System.out.println(title + " " + author);
	}
	
	public static void main(String[] args) {
		
		Book2 littlePrince = new Book2("어린왕자", "생텍쥐베리");
		Book2 loveStory = new Book2("춘향전");
		Book2 emptyBook = new Book2();
		
		/*
		System.out.println( littlePrince.title + " " + littlePrince.author );
		System.out.println( loveStory.title + " " + loveStory.author );
		System.out.println( emptyBook.title + " " + emptyBook.author );
		
		▼ 아래 내용으로 사용함 		*/
		
		littlePrince.show();
		loveStory.show();
		emptyBook.show();
		
	}
}
