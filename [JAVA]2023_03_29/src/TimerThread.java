public class TimerThread extends Thread {
	
	int n = 0;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
	
		while (true) {
			System.out.println(n);
			n++;
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// 예외발생할때 e 로 catch해서,  printStackTrace 메소드로 오류내용 출력
				e.printStackTrace();
			}
		}
		
	}
}
