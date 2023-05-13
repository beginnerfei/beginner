package com.itheima.encapsulation;

public class student {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age>=0 && age<=200) {
			this.age = age;
		}else {
			System.out.println("您的年龄数据有问题！");
		}
	}
	


}
