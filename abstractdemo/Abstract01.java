package com.hsp.abstractdemo;

public class Abstract01 {
	public static void main(String[] args) {

	}
}

abstract class Animal {
	private String name;

	public Animal(String name) {
		this.name = name;
	}

	// 父类方法不确定性的问题 抽象方法就是没有实现的方法
	// 一般来说，抽象类会被继承，有其子类来实现抽象方法
//当一个类中存在抽象方法时，需要将该类声明为abstract类  没有实现就是指，没有方法体

//    public void eat() {
//        System.out.println("这是一个动物，但是不知道吃什么..");
//    }
	public abstract void eat();
}
