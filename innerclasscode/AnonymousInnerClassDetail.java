package com.hsp.innerclass;

public class AnonymousInnerClassDetail {
	public static void main(String[] args) {

		Outer05 outer05 = new Outer05();
		outer05.f1();
		// 外部其他类不能访问 匿名内部类
		System.out.println("main outer05 hashcode=" + outer05);
	}
}

class Outer05 {
	private int n1 = 99;

	public void f1() {

		Person p = new Person() {
			private int n1 = 88;

			@Override
			public void hi() {

				System.out.println("匿名内部类重写了 hi方法 n1=" + n1 + " 外部内的n1=" + Outer05.this.n1);
				// Outer05.this 就是调用 f1的 对象
				System.out.println("Outer05.this hashcode=" + Outer05.this);
			}
		};
		p.hi();

		// 可以直接调用 匿名内部类本身也是返回对象
		// class 匿名内部类 extends Person {}
//        new Person(){
//            @Override
//            public void hi() {
//                System.out.println("匿名内部类重写了 hi方法,哈哈...");
//            }
//            @Override
//            public void ok(String str) {
//                super.ok(str);
//            }
//        }.ok("jack");

	}
}

class Person {
	public void hi() {
		System.out.println("Person hi()");
	}

	public void ok(String str) {
		System.out.println("Person ok() " + str);
	}
}
