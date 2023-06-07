package com.hsp.stringhsp;

public class StringExercise08 {

	public static void main(String[] args) {
		String a = "hello"; 
		String b = "abc";
		
		String c = a + b;
		String d = "helloabc";
		System.out.println(c == d);
		String e = "hello" + "abc";
		System.out.println(d == e);
	}
}
