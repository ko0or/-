package Chapter09;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class ReadExaple11 {
	public static void main(String[] args) throws Exception {
		
		Reader reader = new FileReader("D:\\test.txt");
		int readData;
		char[] cbuf = new char[2];
		String data = "";
		
		
		while ( true ) {
//			readData = reader.read();
			readData = reader.read(cbuf);
			if (readData == -1) { break; }
//			System.out.print( (char) readData );
			
			data += new String(cbuf, 0, readData);
			
		}
		System.out.println(data);
		reader.close();
		
	}
}
