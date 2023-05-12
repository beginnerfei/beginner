package com.itheima.createobject;

public class Test1 {
	public static void main(String[] args) {
		
		Car c = new Car();
		c.name="宝马";
		c.price=38.9;
		System.out.println(c.name);
		System.out.println(c.price);
		c.start();
		c.run();
		
	}

}
