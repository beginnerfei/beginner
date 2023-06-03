package com.hsp.homework0354;

public class Student extends Person {

	private String stu_id;

	public Student(String name, char gender, int age, String stu_id) {
		super(name, gender, age);
		this.stu_id = stu_id;
	}

	public String getStu_id() {
		return stu_id;
	}

	public void setStu_id(String stu_id) {
		this.stu_id = stu_id;
	}

	public void study() {
		System.out.println(getName() + "承诺，我会好好学习 韩顺平讲java");
	}

	@Override
	public String play() {
		return super.play() + "足球";
	}

	public void printInfo() {
		System.out.println("学生的信息:");
		System.out.println(super.basicInfo());
		System.out.println("学号: " + stu_id);
		study();
		System.out.println(play());
	}

	@Override
	public String toString() {
		return "Student{" + "stu_id='" + stu_id + '\'' + '}' + super.toString();
	}
}
