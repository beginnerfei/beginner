package com.hsp.datehsp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date01 {

	public static void main(String[] args) throws ParseException {

		// Date 类是在java.util包  默认输出的日期格式是国外的方式, 因此通常需要对格式进行转换
		Date d1 = new Date(); // 获取当前系统时间
		System.out.println("当前日期=" + d1);
		Date d2 = new Date(9234567); // 通过指定毫秒数得到时间
		System.out.println("d2=" + d2); // 获取某个时间对应的毫秒数

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss E");
		String format = sdf.format(d1); 
		System.out.println("当前日期=" + format);

		String s = "1996年01月01日 10:20:30 星期一";
		Date parse = sdf.parse(s);
		System.out.println("parse=" + sdf.format(parse));

	}
}
