package com.itheima.string;

import java.util.Iterator;
import java.util.Scanner;

public class Stringexec7 {
	public static void main(String[] args) {
		String okLoginName = "admin";
		String okPassword = "itheima";

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("请输入登陆名称");
			String loginName = sc.next();
			System.out.println("请输入登陆密码");
			String password = sc.next();

			if (okLoginName.equals(loginName)) {
				if (okPassword.endsWith(password)) {
					System.out.println("登陆成功！欢迎进入系统");
					break;
				} else {
					System.out.println("您的秘密不正确！还剩" + (3 - i) + "次机会");
				}
			} else {
				System.out.println("您的秘密不正确！还剩" + (3 - i) + "次机会");

			}

		}
	}

}
