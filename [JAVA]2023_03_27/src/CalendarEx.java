import java.util.Calendar;

public class CalendarEx {
	public static void printCalendar(String msg, Calendar cal) {
		int year = cal.get(Calendar.YEAR);
		int month = 1 + cal.get(Calendar.MONTH); // 컴퓨터는 0 ~ 11월로 인식 -> +1 증가 필요
		int day = 1 + cal.get(Calendar.DAY_OF_MONTH); // 컴퓨터는 0 ~ 30일로 인식 -> +1 증가 필요
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); // (일요일: 1, 월요일:2, 화요일:3, 수요일:4 ~) 
		int hourOfDay = cal.get(Calendar.HOUR_OF_DAY); // 24시 기준
		int amPm= cal.get(Calendar.AM_PM); // 오전인지 오후인지 (오전=0,  오후=1)
		
		int hour = cal.get(Calendar.HOUR); // 시간
		int minute = cal.get(Calendar.MINUTE); // 분
		int second= cal.get(Calendar.SECOND); // 초
		int millsecond = cal.get(Calendar.MILLISECOND); // 1000분의 1초
		
	
		
//		System.out.println(dayOfWeek); 
		
		// 연도, 월, 일 표시
		System.out.print(msg+":"+year+"-"+month+"-"+day);
		
		// 날짜표시
		switch (dayOfWeek) {
			case Calendar.MONDAY:  			System.out.println(" 월요일"); break;
			case Calendar.TUESDAY:  		System.out.println(" 화요일"); break;
			case Calendar.WEDNESDAY:  	System.out.println(" 수요일"); break;
			case Calendar.THURSDAY:  	System.out.println(" 목요일"); break;
			case Calendar.FRIDAY:  			System.out.println(" 금요일"); break;
			case Calendar.SATURDAY:  	System.out.println(" 토요일"); break;
			case Calendar.SUNDAY:  			System.out.println(" 일요일"); break;
		}
		
		// 24시간 기준 시간을 표시
		System.out.print("("+hourOfDay+"시)");
		
		// 오전오후 표시
		if (amPm == Calendar.AM) { System.out.print("오전 "); }
		else { System.out.print("오후 "); }
		
		// 시간표시 
		System.out.println(hour+"시 "+minute+"분"+second+"초"+millsecond+"밀리초");
		
	}
	
	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		printCalendar("현재", now);
		
		Calendar firstDate = Calendar.getInstance();
		firstDate.clear(); // 날짜, 시간정보를 삭제
		firstDate.set(2016, 11, 25);
		firstDate.set(Calendar.HOUR_OF_DAY, 20);
		firstDate.set(Calendar.MINUTE, 30);
		
		
		printCalendar("처음 데이트한 날은", firstDate);
		
		
	}
}
