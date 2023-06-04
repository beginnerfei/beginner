package com.hsp.codeblock;

public class CodeBlockDetail02 {

	public static void main(String[] args) {
		A a = new A();

		// A 静态代码块01
		// getN1被调用...
		// A 普通代码块01
		// getN2被调用...
		// A() 构造器被调用
	}
}

class A {
	{ //普通代码块
		System.out.println("A 普通代码块01");
	}
	private int n2 = getN2();

	static {
		System.out.println("A 静态代码块01");
	}

	// 静态属性的初始化
	private static int n1 = getN1();

	public static int getN1() {
		System.out.println("getN1被调用...");
		return 100;
	}

	public int getN2() {
		System.out.println("getN2被调用...");
		return 200;
	}

	// 无参构造器
	public A() {
		System.out.println("A() 构造器被调用");
	}

}
