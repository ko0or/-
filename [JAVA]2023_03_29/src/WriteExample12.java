import java.io.FileWriter;
import java.io.Writer;

public class WriteExample12 {
	public static void main(String[] args) throws Exception {

//		Writer writer = new FileWriter("D:\\output.txt");
//		 운영체제따라서 경로설정을 다르게해야 작동됨(ex > unix, linux, mac 등)
		Writer writer = new FileWriter("D:/output.txt");
		char[] data = "홍길동2".toCharArray();
		
		writer.write(data);
		
//		for (int i = 0; i < data.length; i++) {
//			writer.write(data[i]);
//		}
			
		writer.close();	
			
			
	}
}


