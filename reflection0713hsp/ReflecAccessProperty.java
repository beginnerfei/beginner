package com.hsp.reflection.reflection0713hsp;

import java.lang.reflect.Field;

/*
 *  演示反射操作属性
*/
public class ReflecAccessProperty {

	public static void main(String[] args)
			throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException {

		Class<?> stuClass = Class.forName("com.hspedu.reflection.Student");

		Object o = stuClass.newInstance();// o 的运行类型就是Student
		System.out.println(o.getClass());

		Field age = stuClass.getField("age");// 使用反射得到age 属性对象
		age.set(o, 88);// 通过反射来操作属性
		System.out.println(o);//
		System.out.println(age.get(o));// 返回age属性的值

		Field name = stuClass.getDeclaredField("name");// 使用反射操作name 属性

		name.setAccessible(true);// 对name 进行暴破, 可以操作private 属性
		name.set(null, "韩");// 因为name是static属性，因此 o 也可以写出null
		System.out.println(o);
		System.out.println(name.get(o)); // 获取属性值
		System.out.println(name.get(null));// 获取属性值 要求name是static

	}
}

class Student {
	public int age;
	private static String name;

	public Student() {
	}

	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
}
