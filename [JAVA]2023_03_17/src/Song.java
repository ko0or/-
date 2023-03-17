public class Song {

	// 맴버변수
	int year;
	String country;
	String artist;
	String title;
	
	// 맴버함수
	void show() {
		System.out.println(
				this.year + "년 " + this.country + "국적의 " + this.artist + "가 부른 " + this.artist
		);
	}	
	
	// 생성자
	public Song() {
		// TODO Auto-generated constructor stub
	}
	
	public Song(int year, String country, String artist, String title) {
		super();
		this.year = year;
		this.country = country;
		this.artist = artist;
		this.title = title;
	}

	

	// MAIN ★ 	======================================================>>> 
	
	public static void main(String[] args) {
		Song dancingQueen = new Song(1978, "스웨덴", "ABBA", "Dancing Queen");
		//dancingQueen.show();
		System.out.println( dancingQueen.toString() );
		
		
	}
}
