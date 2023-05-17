package com.itheima.innerclassstatic;

public class Outer {

	
	public static int a = 100;
	
	public static class Inner{
		private String name;
		private int age;
		
		
		
		
		public Inner() {
			super();
		}

		public Inner(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}
		public void show() {
			
			System.out.println(a);
			
		}

		public static String schoolName;

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
