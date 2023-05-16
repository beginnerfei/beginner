package com.itheima.extendstest;

public class Test {

	public static void main(String[] args) {
		
		
		Student s = new Student();
		s.setName("蜘蛛");
		
		s.setAge(999);
		
		System.out.println(s.getName());
		System.out.println(s.getAge());
		
		s.queryCourse();//父类的方法
		
		s.writeInfo();//子类的方法
		
	}
}
