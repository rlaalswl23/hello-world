package chap09;

import java.util.Random;
import java.util.Date;
import java.util.GregorianCalendar;

public class RandomExample2 {

	public static void main(String[] args) {

		Date date = new Date();
		System.out.println(date.getTime());
		
		GregorianCalendar gcalendar = new GregorianCalendar();
		System.out.println(gcalendar.getTimeInMillis());
		
		Random random = new Random(gcalendar.getTimeInMillis());
		System.out.println(random.nextInt(100) + 1);
		System.out.println(random.nextInt(100) + 1);
		System.out.println(random.nextInt(100) + 1);
		
	}

}
