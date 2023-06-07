package com.hsp.stringbufferhsp;

public class StringBufferMethod {

	public static void main(String[] args) {

		StringBuffer s = new StringBuffer("hello");
		
		s.append(',');
		s.append("张三丰");
		s.append("赵敏").append(100).append(true).append(10.5);
		System.out.println(s);

		s.delete(11, 14);
		System.out.println(s);
		
		s.replace(9, 11, "周芷若");
		System.out.println(s);
		
		int indexOf = s.indexOf("张三丰");
		System.out.println(indexOf);
	
		s.insert(9, "赵敏");
		System.out.println(s);

		System.out.println(s.length());// 22
		System.out.println(s);

	}
}
