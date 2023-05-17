package com.itheima.abstracttest;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		GoldCard c = new GoldCard();
		c.setMoney(10000);
		c.setUserName("dlei");
		
		c.pay(300);
		System.out.println("剩余"+c.getMoney());
		
	}

}
