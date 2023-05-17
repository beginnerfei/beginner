package com.itheima.polymorphictest;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Computer c = new Computer("外星人");
		c.Start();
		
		
		USB u = new KeyBoard("双飞燕");
		c.installUSB(u);

		USB u1 = new Mouse("罗技");
		c.installUSB(u1);
		
		
	}

}
