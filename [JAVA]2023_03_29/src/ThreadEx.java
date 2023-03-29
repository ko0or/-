class ThreadEx1 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println( "i : "  + i );
		}
		
	}
}

class ThreadEx2 implements Runnable {
	@Override
	public void run() {
		for (int j = 10; j < 15; j++) {
			System.out.println( "j : "  + j );
		}
		
	}
}



public class ThreadEx {
	public static void main(String[] args) {
		
		ThreadEx1 th1 = new ThreadEx1();
		
//		1번방식
//		Thread th2 = new Thread( new ThreadEx2() );
		
//		2번방식
		ThreadEx2 te = new ThreadEx2();
		Thread th2 = new Thread(te);
		
		th1.start();
		th2.start();
		
		
	}
}
