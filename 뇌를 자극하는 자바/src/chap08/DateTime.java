package chap08;

import java.util.*;

public class DateTime {

	public static void main(String[] args) {
		
		GregorianCalendar Calendar = new GregorianCalendar();
		
		int year = Calendar.get(Calendar.YEAR);
		int month = Calendar.get(Calendar.MONTH) + 1;
		int day = Calendar.get(Calendar.DAY_OF_MONTH);
		System.out.printf("오늘은 %d년 %d월 %d일입니다.%n", 
				            year, month, day);     
	}

}
