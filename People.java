package com.itheima.extendstest;


/**
 * 父类
 * @author mac
 *
 */
public class People {
	
	private String name;
	private int age;
	
	
	
	/**
	 * 查看课表
	 */
	
	public void queryCourse() {
		System.out.println("查看课表");
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
