package com.hsp.encap;

public class Encapsulation01 {
	public static void main(String[] args) {

		Person person = new Person();
		person.setName("韩顺平");
		person.setAge(30);
		person.setSalary(30000);
		System.out.println(person.info());
		System.out.println(person.getSalary());

		Person smith = new Person("smith", 80, 50000); // 自己使用构造器指定属性
		System.out.println("=========smith的信息==========");
		System.out.println(smith.info());

	}
}

class Person {
	public String name; // 名字公开
	private int age; // age私有化
	private double salary;

	public void say(int n, String name) {

	}

	public Person() {
	}

	public Person(String name, int age, double salary) { // 有三个属性的构造器
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
		// 我们可以将set方法写在构造器中，这样仍然可以验证
		setName(name);
		setAge(age);
		setSalary(salary);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.length() >= 2 && name.length() <= 6) { // 加入对数据的校验,相当于增加了业务逻辑
			this.name = name;
		} else {
			System.out.println("名字的长度不对，需要2-6个字符，默认名字");
			this.name = "无名";
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age >= 1 && age <= 120) {
			this.age = age;
		} else {
			System.out.println("你设置年龄不对，需要在 (1-120), 给默认年龄18 ");
			this.age = 18;// 给一个默认年龄
		}
	}

	public double getSalary() {
		// 可以这里增加对当前对象的权限判断
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	// 写一个方法，返回属性信息
	public String info() {
		return "信息为 name=" + name + " age=" + age + " 薪水=" + salary;
	}
}