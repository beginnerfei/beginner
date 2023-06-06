package com.hsp.innerclass;

public class LocalInnerClass {

	public static void main(String[] args) {

		Outer02 outer02 = new Outer02();
		outer02.m1();
		System.out.println("outer02的hashcode=" + outer02);
	}
}

class Outer02 {// 外部类
	private int n1 = 100;

	private void m2() { // 私有方法
		System.out.println("Outer02 m2()");
	}

	public void m1() {
		// 1.局部内部类是定义在外部类的局部位置,通常在方法
		// 3.不能添加访问修饰符,但是可以使用final 修饰
		// 4.作用域 : 仅仅在定义它的方法或代码块中
		final class Inner02 {// 局部内部类 可以直接访问外部类的所有成员，包含私有的

			private int n1 = 800;

			public void f1() {
				System.out.println("n1=" + n1 + " 外部类的n1=" + Outer02.this.n1);
				System.out.println("Outer02.this hashcode=" + Outer02.this);
				m2();
			}
		}
		Inner02 inner02 = new Inner02();
		inner02.f1();
	}
}
