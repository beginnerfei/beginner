package com.itheima.thissuper;

public class Student {
	private String name;
	private String schoolName;
	
	
	
	
	public Student() {
		super();
	}
	
	public Student(String name) {
		this(name,"黑马程序员");
	}
	
	public Student(String name, String schoolName) {
		super();
		this.name = name;
		this.schoolName = schoolName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	
}
	
