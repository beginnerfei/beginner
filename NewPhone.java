package com.itheima.extendsoverride;

public class NewPhone extends Phone {
	//私有方法不能被重写
	//静态方法不能被重写
	@Override//重写注解
	public void call() {
		super.call();
		System.out.println("开视频通话");
	}
	
	@Override
	public void sendMsg() {
		super.sendMsg();
		System.out.println("发彩信");
	}
	
	

}
