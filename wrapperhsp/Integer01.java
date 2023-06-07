package com.hsp.wrapperhsp;

public class Integer01 {

	public static void main(String[] args) {

		int n1 = 100;
		Integer integer = new Integer(n1);
		Integer integer1 = Integer.valueOf(n1);

		int i = integer.intValue();

		int n2 = 200;
		// 自动装箱 int->Integer
		Integer integer2 = n2; // 底层使用的是 Integer.valueOf(n2)
		// 自动拆箱 Integer->int
		int n3 = integer2; // 底层仍然使用的是 intValue()方法
	}
}
