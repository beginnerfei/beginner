package com.beginner.encapsulation;

public class encapsulation01 {
	public static void main(String[] args) {
		Person person = new Person("lpf",31,30000);
		
		person.setName("jacklove");
		person.setAge(300);
		person.setSalary(30000);
		System.out.println(person.info());
		System.out.println(person.getSalary());
		
		Person smith = new Person("smith",20,3000);
		System.out.println("=====smith====");
		System.out.println(smith.info());
		
	}
}
class Person{
	public String name;
	private int age;
	private double salary;
	
	
	
	public Person(String name, int age, double salary) {
		super();
		//this.name = name;
		//this.age = age;
		//this.salary = salary;
		setName(name);
		setAge(age);
		setSalary(salary);
		
	}
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