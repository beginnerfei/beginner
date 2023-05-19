package com.itheima.date;

import java.util.Date;

public class DateDemo1 {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		
		
		
		
		long time = d.getTime();
		System.out.println(time);
		
		
		System.out.println("-----------");
		
		Date d1 = new Date();
		System.out.println(d1); //当前时间
		
		
		long time2 = System.currentTimeMillis();
		time2+=(60*60+121)*1000;
		
		Date d2 = new Date();
		System.out.println(d2); //时间走后121小时  的时间
	}
}
