package com.hsp.stringhsp;

public class StringExercise03 {

	public static void main(String[] args) {
		String a = "hsp"; //指向 常量池的 “hsp”
		String b = new String("hsp");// b 指向堆中对象
		System.out.println(a.equals(b)); 
		System.out.println(a == b); 
	
		System.out.println(a == b.intern()); 
		System.out.println(b == b.intern()); 

	}
}
