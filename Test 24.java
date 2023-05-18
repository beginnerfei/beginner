package com.itheima.apiobjects;

import java.util.Objects;

/**
 * objects 类的常用方法：equals
 * @author mac
 *
 */
public class Test {

	
	public static void main(String[] args) {
		String s1 = null;
		String s2 = new String("itheima");
		System.out.println(Objects.equals(s1, s2));
		
	}
}
