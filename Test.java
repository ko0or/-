package defaultJAVA;
import java.util.ArrayList;
import java.util.Scanner;


public class Test {
	// 모든 메소드에서 사용될 객체들 ( members: 맴버목록, scanner: 입력용, choiceMenu: 입력받은 숫자 저장용 )
	private static ArrayList<HealthClubMember> members = new ArrayList<>();
	private static Scanner scanner = new Scanner(System.in);
	private static int choiceMenu = -1;

	// 모든 메소드에서 사용될 메소드 : 메뉴와 같은 숫자 입력을 받고, 받은 값을 돌려주는 역할
	public static int getChoiceNumber() {
		return choiceMenu = scanner.nextInt();		
	}
	
	// main() 메소드에서만 사용 : 줄바꿈 50번시켜서 기존내용을 삭 -제 ! 
	public static void screenClear() {
		for (int i=0; i<50; i++) { System.out.println(""); }
	}
	
	// 이름 그대로 메인화면
	public static void main(String[] args) {
		screenClear();
		System.out.println("=== 헬스클럽 회원관리 프로그램 ====");
		System.out.println("1.회원 정보관리|  2.프로그램 종료");
		System.out.println("================================");
		System.out.print("메뉴를 선택하세요 >>> " );
		
		if ( getChoiceNumber() == 2 ) { 
			System.out.println("프로그램이 종료되었습니다 :)");
			scanner.close(); 
			return; 
		
		} else { menu(); }
	}
	
	// 이름 그대로 메뉴화면
	public static void menu() {
		System.out.println("=========================== 일반회원 정보관리 =================================");
		System.out.println("11.일반회원 정보입력  |  22. 일반회원 정보삭제  |  33. 일반회원 정보확인  |  0. 이전단계");
		System.out.println("=============================================================================");
		System.out.print("메뉴를 선택하세요 >>> " );

		switch (getChoiceNumber() ) {
		case 0: main(null); break;
		case 11: insertMember(); break; 
		case 22: deleteMember(); break; 
		case 33: listMember(); break;
		default: menu(); break;			
		}
	}
	
	// 맴버추가
	public static void insertMember() {
		System.out.println("가입할 회원 수를 입력하세요>>");
		int limit = getChoiceNumber();
		
		System.out.println("회원정보를 입력하세요.");
		for (int count =0; count < limit; count++) {
			HealthClubMember newMember = new HealthClubMember();
			System.out.print("회원 아이디 ");
			newMember.setMemberId( scanner.next() ); 
			System.out.print("회원 이름 ");
			newMember.setMemberName( scanner.next() );
			System.out.print("회원 지역 ");
			newMember.setMemberAddress( scanner.next() );
			
			members.add( newMember );
		}
		
		menu();
	}
	
	// 맴버삭제
	public static void deleteMember() {
		System.out.println("삭제할 회원번호를 입력하세요>> ");
		if ( getChoiceNumber() <= members.size() == true ) {
			choiceMenu --;
			 
			System.out.println( 
					members.get( choiceMenu ).getMemberName()
					+ "님의 회원정보가 삭제되었습니다."
					);
			members.remove( choiceMenu  );
		} 
		
		menu();
	}
	
	// 맴버목록
	public static void listMember() {
		System.out.println("등록된 회원수는 " + members.size() + "명 입니다.");
		for (int index = 0; index < members.size(); index++) {
			HealthClubMember getMember = members.get( index );
			System.out.println("회원 번호 " + (index +1) );
			System.out.println("회원 이름 " + getMember.getMemberName() );
			System.out.println("회원 지역 " + getMember.getMemberAddress() );
			System.out.println("회원 아이디 " + getMember.getMemberId() );
		}
		
		menu();
	}
}
	


// 맴버가 갖는 정보들
class HealthClubMember {
	
	// 회원아이디, 이름, 주소
	private String memberId;
	private String memberName;
	private String memberAddress;
	
	// 게터
	public String getMemberId() { return memberId; }
	public String getMemberName() { return memberName; }
	public String getMemberAddress() { return memberAddress; }
	
	// 세터
	public void setMemberId(String memberId) { this.memberId = memberId; }
	public void setMemberName(String memberName) { this.memberName = memberName; }
	public void setMemberAddress(String memberAddress) { this.memberAddress = memberAddress; }
}