package com.hsp.reflection.question0710hsp;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/*
 * 反射的引入
 */
@SuppressWarnings({ "all" })
public class ReflectionQuestion {
	public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException,
			InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {

		// 传统方式 new 对象 -》 调用方法
//        Cat cat = new Cat();
//        cat.hi(); ===> cat.cry() 修改源码.

		// 反射 使用Properties 类, 可以读写配置文件
		Properties properties = new Properties();
		properties.load(new FileInputStream("src\\re.properties"));
		String classfullpath = properties.get("classfullpath").toString();// "com.hspedu.Cat"
		String methodName = properties.get("method").toString();
		System.out.println("classfullpath=" + classfullpath);
		System.out.println("method=" + methodName);

		// new classfullpath();

		// 加载类, 返回Class类型的对象cls
		Class cls = Class.forName(classfullpath);
		// 通过 cls 得到你加载的类 com.hspedu.Cat 的对象实例
		Object o = cls.newInstance();
		System.out.println("o的运行类型=" + o.getClass()); // 运行类型
		// 通过 cls 得到你加载的类 com.hspedu.Cat 的 methodName"hi" 的方法对象
		// 在反射中，可以把方法视为对象（万物皆对象）
		Method method1 = cls.getMethod(methodName);
		//  通过method1 调用方法: 即通过方法对象来实现调用方法
		System.out.println("==========================================");
		method1.invoke(o); // 传统方法 对象.方法() , 反射机制 方法.invoke(对象)

	}
}
