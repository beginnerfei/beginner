package com.hsp.extend;

public class Sub extends Base {
	public Sub(String name, int age) {

		super("king", 20);

		// 细节： super在使用时，必须放在构造器第一行
		// 细节:  super() 和 this() 都只能放在构造器第一行，因此这两个方法不能共存在一个构造器
		// this() 不能再使用了
		System.out.println("子类Sub(String name, int age)构造器被调用....");

	}

	public Sub() {
		super("smith", 10); // super(); 默认调用父类的无参构造器
		System.out.println("子类Sub()构造器被调用....");
	}

	public Sub(String name) {
		super("tom", 30);

		System.out.println("子类Sub(String name)构造器被调用....");
	}

	public void sayOk() {

		System.out.println(n1 + " " + n2 + " " + n3);

		test100();
		test200();
		test300();

		System.out.println("n4=" + getN4());
		callTest400();//
	}
}
