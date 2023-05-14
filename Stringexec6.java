package com.itheima.string;

import java.util.Iterator;
import java.util.Random;

public class Stringexec6 {
	public static void main(String[] args) {
		String datas = "abcdegfhijklmnopqrstyvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		
		String code = "";
		Random r = new Random();
		for (int i = 0; i < 5; i++) {
			int index =r.nextInt(datas.length());
			char c = datas.charAt(index);
			code += c;
		}
		System.out.println(code);
	}

}
