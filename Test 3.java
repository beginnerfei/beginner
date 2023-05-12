package com.beginner.pkg;

import com.beginner.modifier.A;

public class Test {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.n1 );//不同包下可以访问public修饰的方法 不能访问其他修饰的方法
		a.m1();
		//a.m2(); 不能访问
	}

}
