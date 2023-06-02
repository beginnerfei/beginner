package com.hsp.debug;

public class Debug01 {

	public static void main(String[] args) {
		
		int sum = 0;     // 演示逐行执行代码
		for (int i = 0; i < 5; i++) {
			sum += i;
			System.out.println("i=" + i);
			System.out.println("sum=" + i);
		}
		System.out.println("退出for....");
	}
}
