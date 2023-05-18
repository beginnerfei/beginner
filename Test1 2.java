package com.itheima.apiobject;


/**
 * object 类中toString方法的使用
 * @author mac
 *
 */
public class Test1 {

	
	public static void main(String[] args) {
		Student s = new Student("周熊",'男',19);
		String rs = s.toString();
		System.out.println(rs);
		System.out.println(s.toString());
		System.out.println(s);
	}
}
