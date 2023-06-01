package com.hsp.objectpoly;

public class PolyObject {
	public static void main(String[] args) { // 对象多态

		// animal 编译类型是 Animal , 运行类型是 Dog
		Animal animal = new Dog();

		// animal运行类型是Dog,所以cry是Dog的cry
		animal.cry(); // 小狗汪汪叫

		// animal 编译类型是 Animal,运行类型是 Cat
		animal = new Cat();
		animal.cry(); // 小猫 喵喵叫
	}
}
