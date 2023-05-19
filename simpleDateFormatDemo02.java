package com.itheima.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class simpleDateFormatDemo02 {
	public static void main(String[] args) throws ParseException {

		
		//2021年08月06日 11:11:11 往后走2天14小时49分06秒之后的时间
		String dateStr = "2021年08月06日 11:11:11";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		Date d = sdf.parse(dateStr);
		
		long time =d.getTime()+(2L*24*60*60+14*60*60+49*60+6)*1000;
		
		
		System.out.println(sdf.format(time));
	}
}
