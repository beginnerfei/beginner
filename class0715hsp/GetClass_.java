package com.hsp.reflection.class0715hsp;

import com.hsp.hspedu0710hsp.Car;

public class GetClass_ {

	public static void main(String[] args) throws ClassNotFoundException {

		String classAllPath = "com.hspedu.Car"; // 通过读取配置文件获取
		Class<?> cls1 = Class.forName(classAllPath);
		System.out.println(cls1);

		Class cls2 = Car.class; // 类名.class , 应用场景: 用于参数传递
		System.out.println(cls2);

		Car car = new Car();
		Class cls3 = car.getClass();// 对象.getClass(), 应用场景，有对象实例
		System.out.println(cls3);

	
		ClassLoader classLoader = car.getClass().getClassLoader();// 通过类加载器【4种】来获取到类的Class对象
		Class cls4 = classLoader.loadClass(classAllPath);// 先得到类加载器 car   通过类加载器得到Class对象
		System.out.println(cls4);

		System.out.println(cls1.hashCode());
		System.out.println(cls2.hashCode());
		System.out.println(cls3.hashCode());
		System.out.println(cls4.hashCode());

		Class<Integer> integerClass = int.class;
		Class<Character> characterClass = char.class;
		Class<Boolean> booleanClass = boolean.class;
		System.out.println(integerClass);

		Class<Integer> type1 = Integer.TYPE;	// 基本数据类型对应的包装类，可以通过 .TYPE 得到Class类对象
		Class<Character> type2 = Character.TYPE; // 其它包装类BOOLEAN, DOUBLE, LONG,BYTE等待
		System.out.println(type1);

		System.out.println(integerClass.hashCode());
		System.out.println(type1.hashCode());

	}
}
