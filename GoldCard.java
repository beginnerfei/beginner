package com.itheima.abstracttest;

public class GoldCard extends Card {

	@Override
	public void pay(double money2) {
		// TODO Auto-generated method stub
		
		
		System.out.println("您当前消费"+money2);
		System.out.println("您卡片当前余额"+ getMoney());
		
		double rs = money2 * 0.8;
		
		System.out.println(getUserName()+"您实际支付"+rs);
		setMoney(getMoney()-rs);
		
		
		
		
	}

}
