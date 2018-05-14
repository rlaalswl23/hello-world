/**
 * 2018. 5. 14. Dev by KIM.M.J
   chap09
   DateFormatExample1.java
 */
package chap09;

import java.util.*;
import java.text.*;

public class DateFormatExample1 {

	public static void main(String[] args) {
		
		GregorianCalendar calendar = new GregorianCalendar();
		//SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 EEEE aa hh시 mm분 ss초");
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MMM-dd a hh:mm:ss");
		
		String date = dateFormat.format(calendar.getTime());
		
		System.out.println(date);

	}

}
