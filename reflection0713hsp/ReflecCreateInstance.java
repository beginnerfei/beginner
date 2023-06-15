package com.hsp.reflection.reflection0713hsp;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
 *  演示通过反射机制创建实例
 */
public class ReflecCreateInstance {

	public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException,
			InstantiationException, NoSuchMethodException, InvocationTargetException {


		Class<?> userClass = Class.forName("com.hspedu.reflection.User");
	
		Object o = userClass.newInstance();
		System.out.println(o);

		// constructor 对象就是 public User(String name) {//public的有参构造器 this.name = name; }
		Constructor<?> constructor = userClass.getConstructor(String.class);

		Object hsp = constructor.newInstance("hsp");// 创建实例，并传入实参
		System.out.println("hsp=" + hsp);
		// 通过非public的有参构造器创建实例 得到private的构造器对象
		Constructor<?> constructor1 = userClass.getDeclaredConstructor(int.class, String.class);

		constructor1.setAccessible(true);// 暴力破解 使用反射可以访问private构造器/方法/属性

		Object user2 = constructor1.newInstance(100, "张三丰");
		System.out.println("user2=" + user2);
	}
}

class User {
	private int age = 10;
	private String name = "韩顺平教育";

	public User() {
	}

	public User(String name) {
		this.name = name;
	}

	private User(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public String toString() {
		return "User [age=" + age + ", name=" + name + "]";
	}
}
