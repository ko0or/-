public class Song_Teacher {

	private String title;
	private String artist;
	private int year;
	private String country;
	
	public Song_Teacher() {
		// TODO Auto-generated constructor stub
	}
	
	public Song_Teacher(String title, String artist, int year, String country) {
		super();
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}



	void show() {
		System.out.print(year + "년 ");
		System.out.print(country + "국적의 ");
		System.out.print(artist + "가 부른 ");
		System.out.print(title);
	}	
	

 
	public static void main(String[] args) {
	
		Song_Teacher myFavorite = new Song_Teacher("Dancing Queen", "ABBA", 1978, "스웨덴");
		myFavorite.show();
				
		
		
	}
}
