package com.hsp.poly1;

public class PloyMethod {
	public static void main(String[] args) {

		A a = new A();

		System.out.println(a.sum(10, 20));
		System.out.println(a.sum(10, 20, 30));

		B b = new B();
		a.say();
		b.say();

	}
}

class B {
	public void say() {
		System.out.println("B say() 方法被调用...");
	}
}

class A extends B {
	public int sum(int n1, int n2) {
		return n1 + n2;
	}

	public int sum(int n1, int n2, int n3) {
		return n1 + n2 + n3;
	}

	public void say() {
		System.out.println("A say() 方法被调用...");
	}
}
