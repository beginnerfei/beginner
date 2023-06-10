package com.hsp.junithsp;

import org.junit.jupiter.api.Test;

public class JUnit1 {

	public static void main(String[] args) {
		// 传统方式
		// new JUnit1().m1();
		// new JUnit1().m2();

	}

	@Test
	public void m1() {
		System.out.println("m1方法被调用");
	}

	@Test
	public void m2() {
		System.out.println("m2方法被调用");
	}

	@Test
	public void m3() {
		System.out.println("m3方法被调用");
	}
}
