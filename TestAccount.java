package com.beginner.encapsulation;

public class TestAccount {
	public static void main(String[] args) {
		
		Account account = new Account();
		account.setName("jack");
		account.setBalance(60);
		account.setPwd("123456");
		account.showInfo();
		
	}

}
