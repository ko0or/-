package Chapter09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class ReadExample1 {
	public static void main(String[] args) throws Exception {
		
		// InputStream : 바이트 단위 입력을 위한 최상위 스트림 클래스
		// FileInputStream : 바이트 단위 입력을 위한 하위 스트림 클래스 (상위는 InputStream)
		InputStream is = new FileInputStream("D:\\test.txt"); // Up-Casting
		
		
		int readByte;
		
		/*
		while (true) {
			readByte = is.read(); // byte 단위로 읽는다. (정수로 받음)
			char c = (char) readByte;
			System.out.print(c);
			
			
			
			if (readByte == -1) { break; } // 파일의 끝에는 탈출
		}
		*/
		
		while ( (readByte = is.read()) != -1 ) { System.out.print( (char)readByte); }
		is.close();
		
		
		
	}
}
