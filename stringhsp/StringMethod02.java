package com.hsp.stringhsp;

public class StringMethod02 {

	public static void main(String[] args) {
		// toUpperCase转换成大写
		String s = "heLLo";
		System.out.println(s.toUpperCase());// HELLO
		// toLowerCase
		System.out.println(s.toLowerCase());// hello
		// concat拼接字符串
		String s1 = "宝玉";
		s1 = s1.concat("林黛玉").concat("薛宝钗").concat("together");
		System.out.println(s1);

		s1 = "宝玉 and 林黛玉 林黛玉 林黛玉";
	
		String s11 = s1.replace("宝玉", "jack");
		System.out.println(s1);
		System.out.println(s11);
	
		String poem = "锄禾日当午,汗滴禾下土,谁知盘中餐,粒粒皆辛苦";

		String[] split = poem.split(",");
		poem = "E:\\aaa\\bbb";
		split = poem.split("\\\\");
		System.out.println("=======分割后内容=======");
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}
	
		s = "happy";
		char[] chs = s.toCharArray();
		for (int i = 0; i < chs.length; i++) {
			System.out.println(chs[i]);
		}
	
		String a = "jcck";
		String b = "jack";
		System.out.println(a.compareTo(b)); 
	
		String name = "john";
		int age = 10;
		double score = 56.857;
		char gender = '男';
	
		String info = "我的姓名是" + name + "年龄是" + age + ",成绩是" + score + "性别是" + gender + "。希望大家喜欢我！";

		System.out.println(info);

		String formatStr = "我的姓名是%s 年龄是%d，成绩是%.2f 性别是%c.希望大家喜欢我！";

		String info2 = String.format(formatStr, name, age, score, gender);

		System.out.println("info2=" + info2);
	}
}
