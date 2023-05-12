package com.beginner.encapsulation;

public class encapsulation01 {
	public static void main(String[] args) {
		Person person = new Person();
		
		person.setName("jacklove");
		person.setAge(300);
		person.setSalary(30000);
		System.out.println(person.info());
		System.out.println(person.getSalary());
	}
	

}
class Person{
	public String name;
	private int age;
	private double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.length()>=2 && name.length()<=6) {
		this.name = name;	
		}else {
			System.out.println("输入的名字有误，默认名字");
			this.name="无名人";
		}
	
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>=1 && age<=123) {
			this.age = age;
		}else {
			System.out.println("年龄需要在1-120之间，给默认年龄18");
			this.age=18;
		}
		
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String info() {
		return name + age + salary;
	}
	
//自己写太慢set get 可以使用快捷键 alt+command+s
	
}