package Chapter09;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample11 {
	public static void main(String[] args) throws Exception {

		// Writer : 문자 단위 출력을 위한 최상위 스트림 클래스
		// FileWriter : 문자 단위 출력을 위한 하위 스트림 클래스
		Writer writer = new FileWriter("D://output.txt");
		
		// 변경 : 문자열 -> 문자
		char[] data = "홍길동".toCharArray();
		
		// 문자 하나씩 넣기
		for (int i = 0; i < data.length; i++) {
			writer.write(data[i]);
		}
		
		writer.close();	
		
		
	}
}
