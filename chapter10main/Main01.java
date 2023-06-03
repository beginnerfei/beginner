package com.hsp.chapter10main;

public class Main01 {

	private static String name = "韩顺平教育";

	private int n1 = 10000;

	public static void hi() {
		System.out.println("Main01的 hi方法");
	}

	public void cry() {
		System.out.println("Main01的 cry方法");
	}

	public static void main(String[] args) {

		//静态方法main 可以访问本类的静态成员 不可以访问本类的非静态成员
		//静态方法main 访问本类的非静态成员，需要先创建对象 , 再调用即可
		System.out.println("name=" + name);
		hi();
		Main01 main01 = new Main01();
		System.out.println(main01.n1);
		main01.cry();
	}
}
