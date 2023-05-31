package com.hsp.encap;

public class Account {

	private String name;
	private double balance;
	private String pwd;

	public Account() {
		super();
	}

	public Account(String name, double balance, String pwd) {
		super();
		this.name = name;
		this.balance = balance;
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.length() >= 2 && name.length() <= 4) {
			this.name = name;
		} else {
			System.out.println("姓名要求长度为2位3位或4位，默认值 无名");
			this.name = "无名";
		}
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) { // 余额 必须>20
		if (balance > 20) {
			this.balance = balance;
		} else {
			System.out.println("余额(必须>20) 默认为0");
		}
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {   //密码 必须是六位
		if (pwd.length() == 6) {
            this.pwd = pwd;
        } else {
            System.out.println("密码必须是六位,默认密码为 000000");
            this.pwd = "000000";
        }
	}

    public void showInfo() {   	//显示账号信息    可以增加权限的校验
   
        System.out.println("账号信息 name=" + name + " 余额=" + balance + " 密码" + pwd);
//        if() {
//            System.out.println("账号信息 name=" + name + " 余额=" + balance + " 密码");
//        }else{
//            System.out.println("你无权查看...");
//        }
    }

}
