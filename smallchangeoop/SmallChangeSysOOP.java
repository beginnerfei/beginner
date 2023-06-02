package com.hsp.smallchangeoop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSysOOP {

	boolean loop = true;
	Scanner scanner = new Scanner(System.in);
	String key = "";

	String details = "--------------零钱通明细--------------";

	double money = 0;
	double balance = 0;
	Date date = null;
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

	String note = "";

	public void mainMenu() {
		do {
			System.out.println("\n=============零钱通菜单(OOP)============");
			System.out.println("\t\t\t1 零钱通明细");
			System.out.println("\t\t\t2 收益入账");
			System.out.println("\t\t\t3 消费");
			System.out.println("\t\t\t4 退出");

			System.out.print("请选择(1-4): ");
			key = scanner.next();

			switch (key) {
			case "1":
				this.detail();
				break;
			case "2":
				this.income();
				break;
			case "3":
				this.pay();
				break;
			case "4":
				this.exit();
				break;
			default:
				System.out.println("选择有误，请重新选择");
			}

		} while (loop);
	}

	public void detail() {
		System.out.println(details);
	}

	public void income() {
		System.out.print("收益入账金额:");
		money = scanner.nextDouble();

		if (money <= 0) {
			System.out.println("收益入账金额 需要 大于 0");
			return;
		}

		balance += money;

		date = new Date();
		details += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t" + balance;

	}

	public void pay() {
		System.out.print("消费金额:");
		money = scanner.nextDouble();

		if (money <= 0 || money > balance) {
			System.out.println("你的消费金额 应该在 0-" + balance);
			return;
		}
		System.out.print("消费说明:");
		note = scanner.next();
		balance -= money;

		date = new Date();
		details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
	}

	public void exit() {

		String choice = "";
		while (true) { // 要求用户必须输入y/n ,否则就一直循环
			System.out.println("你确定要退出吗? y/n");
			choice = scanner.next();
			if ("y".equals(choice) || "n".equals(choice)) {
				break;
			}
			// 第二个方案
//                        if("y".equals(choice)) {
//                            loop = false;
//                            break;
//                        } else if ("n".equals(choice)) {
//                            break;
//                        }
		}

		// 当用户退出while ,进行判断
		if (choice.equals("y")) {
			loop = false;
		}
	}
}
