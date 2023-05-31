package com.hsp.encap;

public class TestAccount {

	public static void main(String[] args) {

		Account account = new Account(); // 创建Account
		account.setName("jack");
		account.setBalance(60);
		account.setPwd("123456");

		account.showInfo();
	}
}
