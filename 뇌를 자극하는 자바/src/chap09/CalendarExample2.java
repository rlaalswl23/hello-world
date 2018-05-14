/**
 * 2018. 5. 14. Dev by KIM.M.J
   chap09
   CalendarExample2.java
 */
package chap09;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class CalendarExample2 {

	public static void main(String[] args) {
	
		Calendar calendar = new GregorianCalendar();
		TimeZone timezone = TimeZone.getTimeZone("Europe/Madrid");
		calendar.setTimeZone(timezone);
		
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1; // 월은 1을 더해준다.
		int date = calendar.get(Calendar.DATE);
		int amPm = calendar.get(Calendar.AM_PM);
		int hour = calendar.get(Calendar.HOUR);
		int min = calendar.get(Calendar.MINUTE);
		int sec = calendar.get(Calendar.SECOND);

		String sAmPm = (amPm == Calendar.AM) ? "오전" : "오후";
		
		System.out.printf("%d년 %d월 %d일 %s %d시 %d분 %d초", year, month, date, sAmPm, hour, min, sec );
		

	}

}
