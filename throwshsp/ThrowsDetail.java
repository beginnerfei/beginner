package com.hsp.throwshsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsDetail {

	public static void main(String[] args) {
		f2();
	}

	public static void f2() {
		// 编译异常，程序中必须处理，比如 try-catch 或者 throws
		// 运行时异常，程序中如果没有处理，默认就是throws的方式处理

		int n1 = 10;
		int n2 = 0;
		double res = n1 / n2;
	}

	public static void f1() throws FileNotFoundException {

		f3();
	}

	public static void f3() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("d://aa.txt");
	}

	public static void f4() {

		f5();
	}

	public static void f5() throws ArithmeticException {

	}
}

class Father {
	public void method() throws RuntimeException {
	}
}

class Son extends Father {

	// 在throws 过程中，如果有方法 try-catch , 就相当于处理异常，就不必throws
	@Override
	public void method() throws ArithmeticException {
	}
}
