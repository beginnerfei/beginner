package com.hsp.throwshsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws01 {

	public static void main(String[] args) {

	}

	public void f2() throws FileNotFoundException, NullPointerException, ArithmeticException {
		
		// 创建了一个文件流对象 FileNotFoundException 编译异常
		// throws 关键字后也可以是 异常列表 可以抛出多个异常
		FileInputStream fis = new FileInputStream("d://aa.txt");

	}
}
