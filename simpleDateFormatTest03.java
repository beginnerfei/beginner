package com.itheima.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class simpleDateFormatTest03 {

	public static void main(String[] args) throws ParseException {
		String startTime = "2021-11-11 00:00:00";
		String endTime = "2021-11-11 00:10:00";
		
		String XiaoJia = "2021-11-11 00:03:47";
		String XiaoPi = "2021-11-11 00:10:11";
		
		
		//解析时间
		SimpleDateFormat sdf  = new SimpleDateFormat("yyyy-MM-dd HH:mm;ss");
		
	   Date d1 = sdf.parse(startTime);
	   Date d2 = sdf.parse(endTime);
	   Date d3 = sdf.parse(XiaoJia);
	   Date d4 = sdf.parse(XiaoPi);
	   
	   if(d3.after(d1)&&d3.before(d2)) {
		   System.out.println("xiaojia 秒杀成功，可以发货");
	   }else {
		   System.out.println("xiaojia秒杀失败");
	   }
	   if(d4.after(d1)&&d4.before(d2)) {
		   System.out.println("xiaopi 秒杀成功，可以发货");
	   }else {
		   System.out.println("xiaopi秒杀失败");
	   }
	}
}
