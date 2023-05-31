package com.hsp.varscope;

public class VarScopeDetail {
	public static void main(String[] args) {
		Person p1 = new Person();

		T t1 = new T();
		t1.test();

		t1.test2(p1);

	}
}

class T {

	public void test() {
		Person p1 = new Person();
		System.out.println(p1.name);
	}

	public void test2(Person p) {
		System.out.println(p.name);
	}
}

class Person {

	public int age = 20;

	String name = "jack";

	public void say() {

		String name = "king";
		System.out.println("say() name=" + name);
	}

	public void hi() {
		String address = "北京";
		// String address = "上海"; 错误,重复定义变量
		String name = "hsp";
	}
}
