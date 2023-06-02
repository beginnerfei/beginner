package com.hsp.homework0342;

public class SavingsAccount extends BankAccount {

	private int count = 3;
	private double rate = 0.01;// 利率

	public void earnMonthlyInterest() {// 每个月初，统计上个月的利息，同时将count=3
		count = 3;
		super.deposit(getBalance() * rate);
	}

	@Override
	public void deposit(double amount) {

		if (count > 0) { // 判断是否还可以免手续费
			super.deposit(amount);
		} else {
			super.deposit(amount - 1);// 1块转入银行
		}
		count--;// 减去一次
	}

	@Override
	public void withdraw(double amount) {// 取款

		if (count > 0) { // 判断是否还可以免手续费
			super.withdraw(amount);
		} else {
			super.withdraw(amount + 1);// 1块转入银行
		}
		count--;
	}

	public SavingsAccount(double initialBalance) {
		super(initialBalance);
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}
}
