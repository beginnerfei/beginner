package com.hsp.homework0456hsp;

public class Homework02 {

	public static void main(String[] args) {
		// args.length = 0
		// ArrayIndexOutOfBoundsException
		if (args[4].equals("john")) { // NullPointerException
			System.out.println("AA");
		} else {
			System.out.println("BB");
		}
		Object o = args[2]; // String->Object 向上转型
		Integer i = (Integer) o; // ClassCastException

	}
}
