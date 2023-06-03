package com.hsp.homework0342;

public class Doctor {

	private String name;
	private int age;
	private String job;
	private char gender;
	private double sal;

	public Doctor(String name, int age, String job, char gender, double sal) {
		this.name = name;
		this.age = age;
		this.job = job;
		this.gender = gender;
		this.sal = sal;
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

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public boolean equals(Object obj) {
		// 判断两个比较对象是否相同
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Doctor)) { // 如果不是
			return false;
		}

		// 向下转型, 因为obj的运行类型是Doctor或者其子类型
		Doctor doctor = (Doctor) obj;
		return this.name.equals(doctor.name) && this.age == doctor.age && this.gender == doctor.gender
				&& this.job.equals(doctor.job) && this.sal == doctor.sal;

	}
}