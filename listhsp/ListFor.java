package com.hsp.listhsp;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListFor {

	public static void main(String[] args) {

		List list = new LinkedList();

		list.add("jack");
		list.add("tom");
		list.add("鱼香肉丝");
		list.add("北京烤鸭子");
		
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			Object obj = iterator.next();
			System.out.println(obj);
		}

		System.out.println("=======增强for=======");

		for (Object o : list) {
			System.out.println("o=" + o);
		}

		System.out.println("=======普通for======");

		for (int i = 0; i < list.size(); i++) {
			System.out.println("对象=" + list.get(i));
		}

	}
}
