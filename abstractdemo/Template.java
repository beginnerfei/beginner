package com.hsp.abstractdemo;

public abstract class Template {

	public abstract void job();

	public void calculateTime() {
		// 得到开始的时间
		long start = System.currentTimeMillis();
		job(); // 动态绑定机制
		// 得的结束的时间
		long end = System.currentTimeMillis();
		System.out.println("任务执行时间 " + (end - start));
	}
}
