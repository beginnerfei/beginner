package com.hsp.codeblock;

public class CodeBlockDetail03 {

	public static void main(String[] args) {
		new BBB();
		// AAA的普通代码块
		// AAA() 构造器被调用
		// BBB的普通代码块
		// BBB() 构造器被调用
	}
}

class AAA { // 父类是Object
	{
		System.out.println("AAA的普通代码块");
	}

	public AAA() {

		System.out.println("AAA() 构造器被调用....");
	}
}

class BBB extends AAA {
	{
		System.out.println("BBB的普通代码块...");
	}

	public BBB() {

		System.out.println("BBB() 构造器被调用....");
	}
}
