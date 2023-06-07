package com.hsp.trycatchhsp;

public class TryCatchDetail03 {

	public static void main(String[] args) {

		// try-finally 配合使用 相当于没有捕获异常 程序会直接崩掉/退出
		// 应用场景：执行一段代码 不管是否发生异常 都必须执行某个业务逻辑

		try {
			int n1 = 10;
			int n2 = 0;
			System.out.println(n1 / n2);
		} finally {
			System.out.println("执行了finally");
		}
		System.out.println("程序继续执行");

	}

}
