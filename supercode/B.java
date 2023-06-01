package com.hsp.supercode;

public class B extends A {

	public int n1 = 888;

	public void test() {

		System.out.println("super.n1=" + super.n1);
		super.cal();
	}

	public void hi() {
		System.out.println(super.n1 + " " + super.n2 + " " + super.n3);
	}

	public void cal() {
		System.out.println("B类的cal() 方法...");
	}

	public void sum() {
		System.out.println("B类的sum()");

		this.cal();

		System.out.println(n1);
		System.out.println(this.n1);

		System.out.println(super.n1);

	}

	public void ok() {
		super.test100();
		super.test200();
		super.test300();
		// super.test400();//不能访问父类private方法
	}

	// 访问父类的构造器(这点前面用过)：super(参数列表);只能放在构造器的第一句，只能出现一句！
	public B() {
		// super();
		// super("jack", 10);
		super("jack");
	}
}
