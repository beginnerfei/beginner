package com.itheima.arraylist;

public class Student {
	private String StudyNumber;
	private int age;
	private String name;
	private String classNumber;

	public Student() {

	}

	public Student(String studyNumber, int age, String name, String classNumber) {

		StudyNumber = studyNumber;
		this.age = age;
		this.name = name;
		this.classNumber = classNumber;
	}

	public String getStudyNumber() {
		return StudyNumber;
	}

	public void setStudyNumber(String studyNumber) {
		StudyNumber = studyNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClassNumber() {
		return classNumber;
	}

	public void setClassNumber(String classNumber) {
		this.classNumber = classNumber;
	}

}
