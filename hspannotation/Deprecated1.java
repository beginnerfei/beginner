package com.hsp.hspannotation;

public class Deprecated1 {

	public static void main(String[] args) {
		A a = new A();
		a.hi();
		System.out.println(a.n1);
	}
}

// @Deprecated 修饰某个元素, 表示该元素已经过时 即不在推荐使用，但是仍然可以使用 Deprecated 可以做版本升级过渡使用


@Deprecated
class A {
	@Deprecated
	public int n1 = 10;

	@Deprecated
	public void hi() {

	}
}
