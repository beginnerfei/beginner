package com.hsp.listhsp;

import java.util.ArrayList;
import java.util.List;

public class List1 {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		list.add("jack");
		list.add("tom");
		list.add("mary");
		list.add("hsp");
		list.add("tom");
		System.out.println("list=" + list);
		System.out.println(list.get(3));
		
	}
}
