package com.itheima.arraylist;

import java.util.ArrayList;

public class ArrayListDemo3 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList();
		list.add("java");
		list.add("java");
		list.add("MySQL");
		list.add("MyBatis");
		list.add("HTML");
		
		String e = list.get(3);
		System.out.println(e);
		
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));//遍历 经常用
		}
		System.out.println(list);
		list.remove(2);
		String e2 = list.remove(2);
		System.out.println(e2);
		System.out.println(list);
		
	}

}
