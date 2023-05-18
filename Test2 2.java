package com.itheima.apiobject;

public class Test2 {
	public static void main(String[] args) {
		Student s1 = new Student("周雄",'男',19);
		Student s2 = new Student("周雄",'男',19);
		
		
		System.out.println(s1.equals(s2));//比较两个对象的地址
		System.out.println(s1 ==s2);
	}

}
