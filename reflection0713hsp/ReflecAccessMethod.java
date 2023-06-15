package com.hsp.reflection.reflection0713hsp;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
 * 演示通过反射调用方法
 */
public class ReflecAccessMethod {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException,
			InstantiationException, InvocationTargetException {

		Class<?> bossCls = Class.forName("com.hspedu.reflection.Boss");

		Object o = bossCls.newInstance();

		// Method hi = bossCls.getMethod("hi", String.class);// 调用public的hi方法

		Method hi = bossCls.getDeclaredMethod("hi", String.class);

		hi.invoke(o, "韩顺平");

		Method say = bossCls.getDeclaredMethod("say", int.class, String.class, char.class);
		// 调用private static 方法 因为say方法是private, 所以需要暴破
		say.setAccessible(true);
		System.out.println(say.invoke(o, 100, "张三", '男'));
		// 因为say方法是static的，可以传入null
		System.out.println(say.invoke(null, 200, "李四", '女'));
		// 5. 在反射中，如果方法有返回值，统一返回Object , 运行类型和方法定义的返回类型一致
		Object reVal = say.invoke(null, 300, "王五", '男');
		System.out.println("reVal 的运行类型=" + reVal.getClass());// String

		Method m1 = bossCls.getDeclaredMethod("m1"); // 演示一个返回的案例
		Object reVal2 = m1.invoke(o);
		System.out.println("reVal2的运行类型=" + reVal2.getClass());// Monster

	}
}

class Monster {
}

class Boss {
	public int age;
	private static String name;

	public Boss() {
	}

	public Monster m1() {
		return new Monster();
	}

	private static String say(int n, String s, char c) {
		return n + " " + s + " " + c;
	}

	public void hi(String s) {
		System.out.println("hi " + s);
	}
}
