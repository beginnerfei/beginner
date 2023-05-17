package com.itheima.polymorphic;

public class Dog extends Animal {
	public String name = "子类狗";
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("狗跑的快");
	}
	public void lookDoor() {
		
		System.out.println("狗看门");
	}

}
