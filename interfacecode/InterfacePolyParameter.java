package com.hsp.interfacecode;

public class InterfacePolyParameter {

	public static void main(String[] args) {

		// 接口的多态体现
		IF if01 = new Monster();
		if01 = new Car();

		// 继承体现的多态
		AAA a = new BBB();
		a = new CCC();
	}
}

interface IF {
}

class Monster implements IF {
}

class Car implements IF {
}

class AAA {

}

class BBB extends AAA {
}

class CCC extends AAA {
}
