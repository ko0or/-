package Chapter07;

public class ProductExample {
	public static void main(String[] args) {
		
		// 가변타입이 확정된다 -> T=Tv,  M=String
		Product<Tv, String> product1 = new Product<>();
		
		// setKind() 메소드의 내용 ->  T kind = new Tv() -> TV kind = new Tv();
		product1.setKind( new Tv() );
		
		// setModel() 메소드의 내용 -> M model = "스마트TV" -> String model = "스마트TV";
		product1.setModel("스마트TV");
		
		
		// 다운캐스팅 필요없음 : 제네릭에 의해 자동형변환이 되어있음
		Tv tv = product1.getKind(); // Tv tv = new Tv();
		System.out.println( tv ); 	 // 해시코드(패키지.클래스@해시코드) : Chapter07.Tv@5d5eef3d
		
		String tvModel = product1.getModel(); // String tvModel = String Model; -> String tvModel = "스마트TV";
		System.out.println( tvModel );	// 스마트TV
		
		
		// =================================================== >>>
		
		Product<Car, String> product2 = new Product<>();
		
		product2.setKind(  new Car() );
		product2.setModel( "디젤" );
		
		Car car = product2.getKind(); // Car car = new Car();
		System.out.println( car ); // Chapter07.Car@6cc4c815
		
		String carModel = product2.getModel(); // String carModel = "디젤";
		System.out.println( carModel ); // 디젤
		
		
		
		
		
		
		
		
	}
}
