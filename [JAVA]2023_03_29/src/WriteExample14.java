import java.io.FileWriter;
import java.io.Writer;

public class WriteExample14 {
	public static void main(String[] args) throws Exception {

		Writer writer = new FileWriter("D:/output.txt");
		String data = "안녕 자바 프로그램";
//		char[] data = "홍길동2".toCharArray();
		
		// 인덱스 3번째 위치에서 시작,  2개까지
		writer.write(data, 3, 2);   
		writer.close();	
			
			
	}
}


