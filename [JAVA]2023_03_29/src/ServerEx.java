import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerEx {
	public static void main(String[] args) {
		
		// 스캐너 객체생성 (입력용)
		Scanner scanner = new Scanner(System.in);
		
		/* 참조변수에 초기값 null 넣기 ===============>>>  */
		
		// 소켓들 ..
		ServerSocket listener = null; 		// 서버 소켓 선언
		Socket socket = null; 						// 클라이언트 소켓 선언 
		
		// 버퍼 ..
		BufferedReader in = null;				// 입력 : 클라이언트에서 들어오는 데이터
		BufferedWriter out = null;			// 출력 : 서버로 전송되는 데이터
		
		
		/* ====================================== >>> */
		
		try {

			// [준비] 객체생성 : 서버소켓 (포트는 0 ~ 65535 까지 가능)
			listener = new ServerSocket(1588);
			
			// [준비] 클라이언트의 연결을 기다리기 .. (연결되면, 소켓객체로 정보를 주고 받음)
			System.out.println( " 연결을 기다리고 있습니다 ... " );
			socket = listener.accept();
			
			
			// [동작] 입력 : 클라이언트에서 들어오는 데이터
			in = new BufferedReader( 
						new InputStreamReader( socket.getInputStream() ) 
						);
			
			// [동작] 출력 : 서버에서 보내는 데이터
			out = new BufferedWriter(
						new OutputStreamWriter( socket.getOutputStream() )
						);
			
			
			
			/* ★ 무한반복 ( bye 입력시 종료 )      */ 
			while ( true ) {
				
				// [반복문] 한 행의 문자열을 읽는다.
				String inputMessage = in.readLine();
				
				// [반복문] 읽은 문자열이 bye 라면, 반복문 종료
				if ( inputMessage.equals("bye") ) { 
					System.out.println( "클라이언트에서 bye 입력으로 연결종료" );
					break; 
				}
				
				// [반복문] bye 가 아닐경우, 받은 메시지를 출력
				System.out.println( "클라이언트: " + inputMessage );
				
				// [반복문] 서버에서 보내는 메시지
				System.out.print("보내기>> ");
				String outputMessage = scanner.nextLine();
				
				// ★ 메시지 전송할때, 메시지 마지막에  \n 를 붙여줘야한다 + .flush() 메소드 함께 사용한다 
				out.write(outputMessage + "\n");
				out.flush(); // -> 
				
				
			}			
			
		// 예외처리시 시스템에서 자동 출력되는 메시지
		} catch (Exception e) { 	e.printStackTrace(); }		
		
		// 마지막으로 자원반납하기 + 자원반납할때 이중 tryCatch문  한번 더 사용 (안정성)
		finally {
			
			// [이중 try-catch] 자원반납시, 오류발생까지 고려한 이중 tryCatch문 사용
			try {
				scanner.close();
				socket.close();
				listener.close();
				in.close();
				out.close();
				
			// [이중 try-catch] 자원반납할때 오류발생할경우,  오류내용을 출력
			} catch (Exception e2) { 
				System.out.println( "클라이언트와 채팅 중 오류가 발생했습니다. " );
			}
			
		}
		
		
	}
}
