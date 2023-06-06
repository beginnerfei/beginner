package com.hsp.innerclass;

public class StaticInnerClass01 {

	public static void main(String[] args) {
		Outer10 outer10 = new Outer10();
		outer10.m1();

		Outer10.Inner10 inner10 = new Outer10.Inner10();
		inner10.say();
	
		Outer10.Inner10 inner101 = outer10.getInner10();
		System.out.println("==================");
		inner101.say();

		Outer10.Inner10 inner10_ = Outer10.getInner10_();
		System.out.println("******************");
		inner10_.say();
	}
}

class Outer10 { // 外部类
	private int n1 = 10;
	private static String name = "张三";

	private static void cry() {
	}

	// 放在外部类的成员位置	 使用static 修饰
	// 可以直接访问外部类的所有静态成员 包含私有的 但不能直接访问非静态成员
	static class Inner10 {
		private static String name = "韩顺平";

		public void say() {
			
			System.out.println(name + " 外部类name= " + Outer10.name);
			cry();
		}
	}

	public void m1() { 
		Inner10 inner10 = new Inner10();
		inner10.say();
	}

	public Inner10 getInner10() {
		return new Inner10();
	}

	public static Inner10 getInner10_() {
		return new Inner10();
	}
}
