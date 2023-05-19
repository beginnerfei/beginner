package com.itheima.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class simpleDateFormatDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date d = new Date();

		System.out.println(d);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EEE a");
		String rs = sdf.format(d);
		System.out.println(rs);
		
		System.out.println("----------------");
		
		
		long time1 = System.currentTimeMillis()+121*1000;
		String rs2 = sdf.format(time1);
		System.out.println(rs2);
		System.out.println("----------------");
	}

}
