/**
 * 2018. 5. 15. Dev by KIM.M.J
   chap09
   After100Days.java
 */
package chap09;

import java.util.Calendar;
import java.util.Date;
import java.text.*;

public class After100Days {

	//오늘부터 100일 후의 날짜
	/*Calendar calendar = Calendar.getInstance();
	cal.setTime(new Date());  // 현재 시간 설정
	cal.add(Calendar.DATE, 2);
	cal.add(Calendar.MONTH, 2);*/
	
	
	
	public static void main(String[] args) {

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date()); // 현재 시간 설정
		calendar.add(Calendar.DATE, 100);
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일");
		String date = dateFormat.format(calendar.getTime());
		
		System.out.println(date);
		
		//System.out.println(dateFormat.format(calendar.getTime()));
		
/*      Calendar calendar = new GregorianCalendar();
		
		int date = calendar.get(Calendar.DATE);
		
		calendar.add(date, 5);
		
		//System.out.println(date);
*/		
	
		

	}

}
