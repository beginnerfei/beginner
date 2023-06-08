package com.hsp.maphsp;

import java.util.HashMap;
import java.util.Map;

public class MapMethod {

	public static void main(String[] args) {	// 演示map接口常用方法

		Map map = new HashMap();
		map.put("邓超", new Book("", 100));
		map.put("邓超", "孙俪");
		map.put("王宝强", "马蓉");
		map.put("宋喆", "马蓉");
		map.put("刘令博", null);
		map.put(null, "刘亦菲");
		map.put("鹿晗", "关晓彤");
		map.put("hsp", "hsp的老婆");

		System.out.println("map=" + map);

		map.remove(null);
		System.out.println("map=" + map);

		Object val = map.get("鹿晗");
		
		System.out.println("val=" + val);
		System.out.println("k-v=" + map.size());//个数
		System.out.println(map.isEmpty());// 判断个数是否为0
		System.out.println("map=" + map);
		System.out.println("结果=" + map.containsKey("hsp"));//查找键是否存在

	}
}

class Book {
	private String name;
	private int num;

	public Book(String name, int num) {
		this.name = name;
		this.num = num;
	}
}
