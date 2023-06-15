package com.hsp.reflection.homework0728hsp;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Homework01 {

	public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchFieldException,
			NoSuchMethodException, InvocationTargetException {

		// 得到 PrivateTest类对应的Class对象
		Class<PrivateTest> privateTestClass = PrivateTest.class;
	
		PrivateTest privateTestObj = privateTestClass.newInstance();//  创建对象实例
	
		Field name = privateTestClass.getDeclaredField("name");// name属性是private
		
		name.setAccessible(true);// 暴破name
		name.set(privateTestObj, "天龙八部");
		
		Method getName = privateTestClass.getMethod("getName");
		
		Object invoke = getName.invoke(privateTestObj);
		System.out.println("name属性值=" + invoke);

	}
}

class PrivateTest {
	private String name = "hellokitty";

	// 默认无参构造器
	public String getName() {
		return name;
	}
}
