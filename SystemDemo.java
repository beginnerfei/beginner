package com.itheima.system;

import java.util.Iterator;

public class SystemDemo {

	
	public static void main(String[] args) {
		
		System.out.println("程序开始。。");
		
		long time = System.currentTimeMillis();
		System.out.println(time);
		long startTime = System.currentTimeMillis();
	  for (int i = 0; i < 10000; i++) {
		  System.out.println("输出"+i);
		
	}
		long endTime = System.currentTimeMillis();
		System.out.println((endTime-startTime)/1000.0+"s");
		
		
		System.out.println("程序结束。。");
	}
}
