package com.itheima.innerclass;

public class Outer {
	public static int num =111;
	private String hobby;
	
	public Outer() {
		super();
	}

	public Outer(String hobby) {
		super();
		this.hobby = hobby;
	}

	/**
	 * 成员内部类
	 */
	public class Inner{
		private String name;
		private int age;
		public static int a;
		
		
		public static void test() {
			
		}
		
		public void show() {
			System.out.println("名字"+name);
			System.out.println("数量"+num);
			System.out.println("爱好"+hobby);
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

}
