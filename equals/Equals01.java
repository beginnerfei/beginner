package com.hsp.equals;

public class Equals01 {

	public static void main(String[] args) {
		A a = new A();
		A b = a;
		A c = b;
		System.out.println(a == c);// true
		System.out.println(b == c);// true
		B bObj = a;
		System.out.println(bObj == c);// true
		int num1 = 10;
		double num2 = 10.0;
		System.out.println(num1 == num2);// 基本数据类型，判断值是否相等

		"hello".equals("abc");

		// 即Object 的equals 方法默认就是比较对象地址是否相同 //也就是判断两个对象是不是同一个对象. public boolean

		// 重写Object的equals方法, 变成了判断两个值是否相同 public boolean

		Integer integer1 = new Integer(1000);
		Integer integer2 = new Integer(1000);
		System.out.println(integer1 == integer2);// false
		System.out.println(integer1.equals(integer2));// true

		String str1 = new String("hspedu");
		String str2 = new String("hspedu");
		System.out.println(str1 == str2);// false
		System.out.println(str1.equals(str2));// true

	}
}

class B {
}

class A extends B {
}
