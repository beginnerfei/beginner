package com.itheima.date;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo01 {

	
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		
		int year = cal.get(Calendar.YEAR);
		System.out.println(year);
		
		int mm = cal.get(Calendar.MONTH)+1;
		System.out.println(mm);
		
		int days = cal.get(Calendar.DAY_OF_YEAR);
		System.out.println(days);
		
		
		//  修改日历 cal.set(Calender.HOUR, 12);
		
		
		cal.add(Calendar.DAY_OF_YEAR,64 );
		cal.add(Calendar.MINUTE , 59);
		
		
		Date d = cal.getTime();
		System.out.println(d);
		
		long time = cal.getTimeInMillis();
		System.out.println(time);
	}
}
