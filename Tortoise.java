package com.itheima.polymorphic;

public class Tortoise extends Animal {
public String name = "子类乌龟";
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("乌龟跑的慢");
		
	}
	public void layEggs() {
		System.out.println("乌龟下蛋");
	}

}
