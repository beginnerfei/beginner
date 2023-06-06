package com.hsp.innerclass;

public class MemberInnerClass01 {

	public static void main(String[] args) {
		Outer08 outer08 = new Outer08();
		outer08.t1();

		Outer08.Inner08 inner08 = outer08.new Inner08();
		inner08.say();

		Outer08.Inner08 inner08Instance = outer08.getInner08Instance();
		inner08Instance.say();

	}
}

class Outer08 { // 外部类
	private int n1 = 10;
	public String name = "张三";

	private void hi() {
		System.out.println("hi()方法");
	}

	public class Inner08 {// 成员内部类
		private double sal = 99.8;
		private int n1 = 66;

		public void say() {
			// 可以直接访问外部类的所有成员，包含私有的
			// 如果成员内部类的成员和外部类的成员重名 遵守就近原则
			// 可以通过 外部类名.this.属性 来访问外部类的成员
			System.out.println("n1 = " + n1 + " name = " + name + " 外部类的n1=" + Outer08.this.n1);
			hi();
		}
	}

	public Inner08 getInner08Instance() {
		return new Inner08();
	}

	public void t1() {

		Inner08 inner08 = new Inner08();
		inner08.say();
		System.out.println(inner08.sal);
	}
}
