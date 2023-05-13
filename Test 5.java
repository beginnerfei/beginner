package com.itheima.thisdemo;

public class Test {
 public static void main(String[] args) {
	Car c = new Car();
	c.run();
	
	System.out.println(c);
	
	Car c2 = new Car("奔驰",39.9);
	System.out.println(c2.name);
	System.out.println(c2.price);
	
	c2.goWith("宝马");
}
}
