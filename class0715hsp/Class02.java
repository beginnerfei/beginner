package com.hsp.reflection.class0715hsp;

import java.lang.reflect.Field;

import com.hsp.hspedu0710hsp.Car;

public class Class02 {

	public static void main(String[] args)
			throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException {

		String classAllPath = "com.hspedu.Car";

		Class<?> cls = Class.forName(classAllPath); // <?> 表示不确定的Java类型 获取Car类 对应的Class对象

		System.out.println(cls); // 显示cls对象, 是哪个类的Class对象 com.hspedu.Car
		System.out.println(cls.getClass());// 输出cls运行类型 java.lang.Class
		
		System.out.println(cls.getPackage().getName());// 得到包名
	
		System.out.println(cls.getName());//  得到全类名
	
		Car car = (Car) cls.newInstance();
		System.out.println(car);// car.toString()
		
		Field brand = cls.getField("brand");// 通过反射获取属性 brand
		System.out.println(brand.get(car));// 宝马
	
		brand.set(car, "奔驰");	// 通过反射给属性赋值
		System.out.println(brand.get(car));// 奔驰
		
		System.out.println("=========所有的字段属性========");
		Field[] fields = cls.getFields();
		for (Field f : fields) { //得到所有的属性(字段)
			System.out.println(f.getName());// 名称
		}

	}
}
