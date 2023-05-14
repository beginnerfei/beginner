package com.itheima.arraylist;

import java.util.ArrayList;

public class ArrayListDemo1 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add("java");
		list.add("java");
		list.add("MySQL");
		list.add("黑马");
		list.add("23");
		list.add(false);
		list.add('中');
		
		System.out.println(list);
		
		list.add(1, "赵敏");
		System.out.println(list);
	}

}
