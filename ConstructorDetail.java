package com.hsp.constructor2;

public class ConstructorDetail {
	public static void main(String[] args) {
		Person p1 = new Person("king", 40); // 第1个构造器
		Person p2 = new Person("tom"); // 第2个构造器

		Dog dog1 = new Dog(); // 默认的无参构造器

	}
}

class Dog {
	// 如果程序员没有定义构造器，系统会自动给类生成一个默认无参构造器(也叫默认构造器)
	public Dog(String dName) {
		// ...
	}

	Dog() { // 无参构造器

	}
}

class Person {
	String name;
	int age;

	public Person(String pName, int pAge) {
		name = pName;
		age = pAge;
	}

	public Person(String pName) {
		name = pName;
	}
}
