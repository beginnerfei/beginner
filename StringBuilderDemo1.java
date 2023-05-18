package com.itheima.apiStringbuilder;

public class StringBuilderDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder();//创建可变字符串 空白内容
		
		sb.append("a");   //append 拼接 链接
		sb.append("a"); 
		sb.append("c"); 
		sb.append("1"); 
		sb.append("v"); 
		sb.append("vdfgdfg3234"); 
		System.out.println(sb);
		
		
		StringBuilder sb1 = new StringBuilder();
		
		//支持链式编程
		sb1.append("a").append("b").append("c").append("我爱你");
		System.out.println(sb1);

		
		//反转
		sb1.reverse().append("112");
		System.out.println(sb1);
		System.out.println(sb1.length());
		
		StringBuilder sb2 = new StringBuilder();
		sb2.append("11").append("22");
		String rs = sb2.toString();
		check(rs);
		
		
	}
	public static void check(String data) {
		
		System.out.println(data);
		
	}

}
