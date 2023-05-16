package com.itheima.extendsfieldmethod;

public class Dog extends Animal {
	public String name = "狗名";

	public void lookDoor() {
		System.out.println("狗看门");
	}

	
	public void showName() {
		System.out.println(name);
		System.out.println(this.name);
		System.out.println(super.name);
		run();
		super.run();
		
		
	}
	public void run() {
		System.out.println("狗跑的很快");
	}

}