package com.hsp.homework0354;

public class Person {

	private String name;
	private char gender;
	private int age;

	public Person(String name, char gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// 编写一个play方法, 把共有的输出内容写到父类
	public String play() {
		return name + "爱玩";
	}

	public String basicInfo() {
		return "姓名: " + name + "\n年龄: " + age + "\n性别: " + gender;
	}

	@Override
	public String toString() {
		return "Person{" + "name='" + name + '\'' + ", gender=" + gender + ", age=" + age + '}';
	}
}
