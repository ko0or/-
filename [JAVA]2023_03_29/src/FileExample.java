import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class FileExample {
	public static void main(String[] args) throws IOException {
		
		File dir= new File("D:/test/dir"); // 경로설정 (다중폴더)
		File file1 = new File("D:/test/file1.txt"); // 경로설정 (파일)
		File file2 = new File("D:/test/file2.txt"); // 경로설정 (파일)
		File file3 = new File("D:/test/file3.txt"); // 경로설정 (파일)

		dir.mkdirs(); // 디렉토리 여러개 만들기 (s가 붙음)
		file1.createNewFile(); //  파일 만들기
		file2.createNewFile(); //  파일 만들기
		file3.createNewFile(); //  파일 만들기
		
		// 파일및 폴더정보 조회해보기
		
		// 디렉토리 정보를 가지고 test 객체 생성
		File test = new File("D:/test");
		
		System.out.println("날짜          시간          형태          크기          이름");
		System.out.println("--------------------------------------------");
		File[] contents = test.listFiles(); // 디렉토리 하위정보를 배열로 리턴 (File 타입)
		for (int i = 0; i < contents.length; i++) {
			
			// 년-월-일 오전/오후 시간:분
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
			System.out.print(  sdf.format(contents[i].lastModified()) );
			
			if ( contents[i].isDirectory() ) {
				System.out.print( "\t<DIR>\t\t"+ contents[i].getName() );				
			} else {
				System.out.print( "\t\t"+ contents[i].getName() + "\t" + contents[i].length() );
			}
			System.out.println();
		}
		
		
	}
}
