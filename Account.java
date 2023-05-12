package com.beginner.encapsulation;

public class Account {
	//为了封装 将3个属性设置为private
	private String name;
	private double balance;
	private String pwd;
	
	//提供两个构造方法
	
	
	
	//姓名长度234
	public String getName() {
		return name;
	}
	
	public Account(String name, double balance, String pwd) {
		super();
		this.name = name;
		this.balance = balance;
		this.pwd = pwd;
	}

	public Account() {
		super();
	}

	public void setName(String name) {
		if(name.length()>=2 && name.length() <=4){
			this.name = name;
		}else {
			System.out.println("姓名要求长度2-4，默认值 无名");
			this.name = "无名";
		}
		
	}
	public double getBalance() {
		return balance;
	}
	//余额大于20
	public void setBalance(double balance) {
		if(balance>20) {
			this.balance = balance;
		}else {
			System.out.println("余额必须大于20");
		}
		
	}
	public String getPwd() {
		return pwd;
	}
	//密码必须是六位
	public void setPwd(String pwd) {
		if(pwd.length()==6) {
			this.pwd = pwd;
		}else {
			System.out.println("密码必须是六位");
		}
		
	}
	
	public void showInfo() {
		//if() {
			//System.out.println("显示信息name= "+name +"余额= "+balance +"密码= " +pwd);
		//}else { “你无权查看”
		System.out.println("显示信息name= "+name +"余额= "+balance +"密码= " +pwd);
	}

}
