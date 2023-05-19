package com.itheima.regex;

import java.util.Scanner;

public class RegexTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		checkPhone();
	}

	public static void checkPhone() {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("请输入您注册的手机号");
			String phone = sc.next();
			if (phone.matches("1[3-9]\\d{9}")) {
				System.out.println("手机号格式正确，注册 完成");
				break;
			} else {
				System.out.println("格式有误");
			} 
		}

	}
}
