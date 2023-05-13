package com.itheima.javvabean;

public class Test {
	public static void main(String[] args) {
		User u1 = new User();//无参数构造器创建对象封装一个用户信息
		u1.setName("黑马吴彦祖");
		u1.setHeight(180.5);
		u1.setSalary(1000.2);

		System.out.println(u1.getName());
		System.out.println(u1.getHeight());
		System.out.println(u1.getSalary());
		
		User u2 = new User("黑马武大郎",156,2000);//有参数构造器创建对象封装一个用户信息
		System.out.println(u2.getName());
		System.out.println(u2.getHeight());
		System.out.println(u2.getSalary());
	}
}
