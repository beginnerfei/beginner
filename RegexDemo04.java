package com.itheima.regex;

public class RegexDemo04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String names = "小路3453453蓉儿fdgsdfg过儿";
		String[] arrs = names.split("\\w+");
		
		for (int i = 0; i < arrs.length; i++) {
			System.out.println(arrs[i]);
		}
		
		String names2 = names.replaceAll("\\w+", " ");
		System.out.println(names2);
	}

}
