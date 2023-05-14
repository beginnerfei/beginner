package com.itheima.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo6 {
	public static void main(String[] args) {

		ArrayList<Student> students = new ArrayList();

		students.add(new Student("20180302", 23, "叶孤城", "护理一班"));
		students.add(new Student("20180303", 23, "东方不败", "推拿二班"));
		students.add(new Student("20180304", 26, "西门吹雪", "中药学四班"));
		students.add(new Student("20180305", 27, "梅超风", "神经科2班"));

		System.out.println("学号\t姓名\t年龄\t班级");
		for (int i = 0; i < students.size(); i++) {
			Student s = students.get(i);
			System.out.println(s.getStudyNumber() + "\t" + s.getName() + "\t" + s.getAge() + "\t" + s.getClassNumber());
		}
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("请输入学生学号查询学生对象");
			String studyNumber = sc.next();
			Student s = getStudentById(students, studyNumber);
			if (s == null) {
				System.out.println("查无此人");
			} else {
				System.out.println("您查询的学生信息如下");
				System.out.println(
						s.getStudyNumber() + "\t" + s.getName() + "\t" + s.getAge() + "\t" + s.getClassNumber());
			}
		}
	}

	/**
	 * 根据学生学号查询学生对象返回
	 * 
	 * @param students    存储全部学生对象的集合
	 * @param studyNumber 搜素的学生的学号
	 * @return 学生对象
	 */
	public static Student getStudentById(ArrayList<Student> students, String studyNumber) {
		for (int i = 0; i < students.size(); i++) {
			Student s = students.get(i);
			if (s.getStudyNumber().equals(studyNumber)) {
				return s;
			}

		}
		return null;
	}

}
