package com.itheima.polymorphic;

public class Test {
	public static void main(String[] args) {
		
		Animal a = new Dog();
		a.run();
		
		System.out.println(a.name);
		
		Animal a2 = new Tortoise();
		a2.run();
		System.out.println(a2.name);
		
		
		Animal a3 =new Tortoise();
		a3.run();
		
		
		if(a3 instanceof Tortoise) {
			Tortoise t =(Tortoise) a3;
			t.layEggs();
		}else if(a2 instanceof Dog) {
			Dog d = new Dog();
			d.lookDoor();
		}
		
	}

}
