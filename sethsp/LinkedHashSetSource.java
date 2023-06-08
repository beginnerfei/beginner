package com.hsp.sethsp;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetSource {

	public static void main(String[] args) {

		Set set = new LinkedHashSet();
		set.add(new String("AA"));
		set.add(456);
		set.add(456);
		set.add(new Customer("刘", 1001));
		set.add(123);
		set.add("HSP");

		System.out.println("set=" + set);

	}
}

class Customer {
	private String name;
	private int no;

	public Customer(String name, int no) {
		this.name = name;
		this.no = no;
	}
}
