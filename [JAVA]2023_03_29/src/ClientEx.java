import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientEx {
	public static void main(String[] args) {
		
		// 스캐너 객체생성
		Scanner scanner = new Scanner(System.in);
		
		/* ServerEx 파일에서,  ServerSocket 빼고 다 가져왔음 */
		
		// 소켓 ..
		Socket socket = null; 						// 클라이언트 소켓 선언 
		
		// 버퍼 ..
		BufferedReader in = null;				// 입력 : 클라이언트에서 들어오는 데이터
		BufferedWriter out = null;			// 출력 : 서버로 전송되는 데이터
		
		
		/* ================================================= */
		
		try {
			
			// 객체생성 ( 서버의 IP , PORT ), 생성된 객체로 데이터를 주고받을 수 있다
			socket = new Socket("localhost", 1588); 
			
			// [동작] 입력 : 서버에서 들어오는 데이터
			in = new BufferedReader( 
						new InputStreamReader( socket.getInputStream() ) 
						);
			
			// [동작] 출력 : 클라이언트에서 보내는 데이터
			out = new BufferedWriter(
						new OutputStreamWriter( socket.getOutputStream() )
						);
			
			
			
			/* ★ 무한반복 ( bye 입력시 종료 )      */ 
			while ( true ) {
				System.out.println( "보내기>> " );
				String outputMessage = scanner.nextLine();
				
				// [반복문] bye를 보냈을경우, 반복문 찰출 (종료)
				if ( outputMessage.equals("bye") ) {
					out.write( outputMessage + "\n" );
					out.flush();
					break;
				}
				
				// [반복문] bye를 보내지않을경우, 일반적으로 메시지 보내기
				out.write(outputMessage + "\n" );
				out.flush();
				
				// [반복문] 그리고, 내용을 읽어온다
				String inputMessage = in.readLine();
				System.out.println( "서버: " + inputMessage );
			}
			
		// 오류발생시 내용출력
		} catch (Exception e) { 	e.printStackTrace(); }
		

		finally {
			
			// [이중 try-catch] 자원반납시, 오류발생까지 고려한 이중 tryCatch문 사용
			try {
				scanner.close();
				socket.close();
				in.close();
				out.close();
				
			// [이중 try-catch] 자원반납할때 오류발생할경우,  오류내용을 출력
			} catch (Exception e2) { 
				System.out.println( "클라이언트와 채팅 중 오류가 발생했습니다. " );
			}			

		}
		
	}
}
