package com.hsp.thiscode;

public class ThisDetail {

	public static void main(String[] args) {

		// T t1 = new T();
		// t1.f2();
		T t2 = new T();
		t2.f3();

	}
}

class T {

	String name = "jack";
	int num = 100;


	
	public T() {
		
		this("jack", 100);
		System.out.println("T() 构造器");
		
	}

	public T(String name, int age) {

		System.out.println("T(String name, int age) 构造器");
	}

	
	public void f3() {
		String name = "smith";
		
		System.out.println("name=" + name + " num=" + num);//smith  100
	
		System.out.println("name=" + this.name + " num=" + this.num);//jack 100
	}

	public void f1() {

		System.out.println("f1() 方法..");
	}

	public void f2() {
		System.out.println("f2() 方法..");
		
		f1();  //di1zhong
		
		this.f1();//di2zhong
	}
}  
