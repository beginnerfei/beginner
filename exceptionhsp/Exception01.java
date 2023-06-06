package com.hsp.exceptionhsp;

public class Exception01 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 0;

		// java 设计者，提供了一个叫 异常处理机制来解决该问题
		// 如果程序员 认为一段代码可能出现异常 问题 可以使用try-catch异常处理机制来解决 从而保证程序的健壮性
		// 如果进行异常处理，那么即使出现了异常，程序可以继续执行
		try {
			int res = num1 / num2;
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("出现异常的原因=" + e.getMessage());// 输出异常信息
		}

		System.out.println("程序继续运行");

	}
}
