package com.hsp.reflection.homework0728hsp;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Homework02 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException,
			InvocationTargetException, InstantiationException {

		//  Class类的forName方法得到File类的class 对象
		Class<?> fileCls = Class.forName("java.io.File");
		// 2. 得到所有的构造器
		Constructor<?>[] declaredConstructors = fileCls.getDeclaredConstructors();
	
		for (Constructor<?> declaredConstructor : declaredConstructors) {	// 遍历输出
			System.out.println("File构造器=" + declaredConstructor);
		}
		// 指定的得到 public java.io.File(java.lang.String)
		Constructor<?> declaredConstructor = fileCls.getDeclaredConstructor(String.class);
		String fileAllPath = "\\mynew.txt";
		Object file = declaredConstructor.newInstance(fileAllPath);// 创建File对象

	
		Method createNewFile = fileCls.getMethod("createNewFile");
		createNewFile.invoke(file);// 创建文件，调用的是 createNewFile
		
		System.out.println(file.getClass());// file的运行类型就是File
		System.out.println("创建文件成功" + fileAllPath);

	}
}
