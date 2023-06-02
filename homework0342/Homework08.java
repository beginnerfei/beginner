package com.hsp.homework0342;

public class Homework08 {

	public static void main(String[] args) {
//      CheckingAccount checkingAccount = new CheckingAccount(1000);
//      checkingAccount.deposit(10);// 1010 - 1 = 1009
//      checkingAccount.withdraw(9);//1009 - 9 = 1000 -1= 999
//      System.out.println(checkingAccount.getBalance());

		// 测试SavingsAccount
		SavingsAccount savingsAccount = new SavingsAccount(1000);
		savingsAccount.deposit(100);
		savingsAccount.deposit(100);
		savingsAccount.deposit(100);
		System.out.println(savingsAccount.getBalance());// 1300
		savingsAccount.deposit(100);
		System.out.println(savingsAccount.getBalance());// 1400-1=1399

		// 月初，定时器自动调用一下 earnMonthlyInterest
		savingsAccount.earnMonthlyInterest();// 统计利息
		System.out.println(savingsAccount.getBalance());
		savingsAccount.withdraw(100);// 免手续
		System.out.println(savingsAccount.getBalance());
		savingsAccount.withdraw(100);// 免手续
		savingsAccount.withdraw(100);// 免手续
		System.out.println(savingsAccount.getBalance());
		savingsAccount.deposit(100);// 扣手续费 超过三次扣手续费
		System.out.println(savingsAccount.getBalance());

	}
}
