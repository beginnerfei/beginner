package com.hsp.innerclass;

public class AnonymousInnerClass {// 匿名内部类
	public static void main(String[] args) {
		Outer04 outer04 = new Outer04();
		outer04.method();
	}
}

class Outer04 { // 外部类
	private int n1 = 10;

	public void method() {

		// 可以使用匿名内部类来简化开发 Tiger/Dog 类只是使用一次，后面再不使用 匿名内部类使用一次，就不能再使用
		// jdk底层在创建匿名内部类 Outer04$1,立即马上就创建了 Outer04$1实例，并且把地址返回给 tiger
		IA tiger = new IA() {
			@Override
			public void cry() {
				System.out.println("老虎叫");
			}
		};
		System.out.println("tiger的运行类型=" + tiger.getClass());
		tiger.cry();
		tiger.cry();
		tiger.cry();

//        IA tiger = new Tiger();
//        tiger.cry();
		// father编译类型 Father father运行类型 Outer04$2 底层会创建匿名内部类

		Father father = new Father("jack") {

			@Override
			public void test() {
				System.out.println("匿名内部类重写了test方法");
			}
		};
		System.out.println("father对象的运行类型=" + father.getClass());// Outer04$2
		father.test();

		// 基于抽象类的匿名内部类
		Animal animal = new Animal() {
			@Override
			void eat() {
				System.out.println("小狗吃骨头");
			}
		};
		animal.eat();
	}
}

interface IA {
	public void cry();
}
//class Tiger implements IA {
//
//    @Override
//    public void cry() {
//        System.out.println("老虎叫");
//    }
//}
//class Dog implements  IA{
//    @Override
//    public void cry() {
//        System.out.println("小狗叫");
//    }
//}

class Father {
	public Father(String name) {
		System.out.println("接收到name=" + name);
	}

	public void test() {
	}
}

abstract class Animal { 
	abstract void eat();
}
