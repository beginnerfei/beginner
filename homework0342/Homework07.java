package com.hsp.homework0342;

public class Homework07 {

	public static void main(String[] args) {

	}
}

class Test {
	String name = "Rose";

	Test() {
		System.out.println("Test");
	}

	Test(String name) {
		this.name = name;
	}
}

class Demo extends Test {
	String name = "Jack";

	Demo() {
		super();
		System.out.println("Demo");
	}

	Demo(String s) {
		super(s);
	}

	public void test() {
		System.out.println(super.name);
		System.out.println(this.name);
	}

	public static void main(String[] args) {

		new Demo().test();
		new Demo("john").test();
	}
}
