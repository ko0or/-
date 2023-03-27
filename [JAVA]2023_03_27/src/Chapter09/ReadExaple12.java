package Chapter09;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class ReadExaple12 {
	public static void main(String[] args) throws Exception {
		
		Reader reader = new FileReader("D:\\test.txt");
		int readData;
		
		while ( true ) {
			readData = reader.read();
			if (readData == -1) { break; }
			System.out.print( (char) readData );
		}
		
		reader.close();
		
	}
}
