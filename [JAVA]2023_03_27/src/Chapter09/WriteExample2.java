package Chapter09;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class WriteExample2 {
	public static void main(String[] args) throws Exception {
		
		// OutputStream : 바이트 단위 출력을 위한 최상위 클래스
		// FileOutputStream : 바이트 단위 출력을 위한 하위 스트림 클래스
		OutputStream os = new FileOutputStream("D:\\output.txt"); // up-casting
		
		byte[] data = "DEF영어".getBytes();
		os.write(data);
		
//		 혹은 아래와 같이 반복문으로 하나씩 넣는것도 가능
//		for (int i = 0; i < data.length; i++) {
//			os.write( data[i] );
//		}
		
		os.close();
		
		
	}
}
