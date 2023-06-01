package com.hsp.polyarr;

public class PloyArray {

	public static void main(String[] args) {

		Person[] persons = new Person[5];
		persons[0] = new Person("jack", 20);
		persons[1] = new Student("mary", 18, 100);
		persons[2] = new Student("smith", 19, 30.1);
		persons[3] = new Teacher("scott", 30, 20000);
		persons[4] = new Teacher("king", 50, 25000);

		// 循环遍历多态数组，调用say
		for (int i = 0; i < persons.length; i++) {
			// person[i] 编译类型是 Person ,运行类型是是根据实际情况有JVM来判断
			System.out.println(persons[i].say());// 动态绑定机制

			if (persons[i] instanceof Student) {// 判断person[i] 的运行类型是不是Student
				Student student = (Student) persons[i];// 向下转型
				student.study();

			} else if (persons[i] instanceof Teacher) {
				Teacher teacher = (Teacher) persons[i];
				teacher.teach();
			} else if (persons[i] instanceof Person) {

			} else {
				System.out.println("你的类型有误, 请自己检查...");
			}

		}

	}
}
