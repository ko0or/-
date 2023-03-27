package Chapter09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class ReadExample2 {
	public static void main(String[] args) throws Exception {
		
		// InputStream : 바이트 단위 입력을 위한 최상위 스트림 클래스
		// FileInputStream : 바이트 단위 입력을 위한 하위 스트림 클래스 (상위는 InputStream)
		InputStream is = new FileInputStream("D:\\test.txt"); // Up-Casting
		
		byte[] readBytes = new byte[3];
		String data = "";
		int readByte;		
		
		
		while (true) {
//			readByte = is.read(); // 1byte 단위로 읽는다 (정수로 받음) 	
			readByte = is.read(readBytes); // 3byte 단위로 읽는다 (정수로 받음) 	
			if (readByte == -1) { break; } // 파일의 끝에는 탈출
			
			// readBytes 를 0 인덱스에서 readByte 길이만큼 읽는다
			data += new String(readBytes, 0, readByte);
			
//			System.out.print( readByte );
		}
		
		System.out.println( data );

		is.close();
		
		
		
	}
}
