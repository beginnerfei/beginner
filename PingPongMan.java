package com.itheima.interfaceimplements;

public class PingPongMan implements SportMan,Law{
	
	private String name;
	



	public PingPongMan(String name) {
		
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(name+"必须跑步训练");
		
	}

	@Override
	public void competition() {
		// TODO Auto-generated method stub
		System.out.println(name+"要参加比赛");
		
	}

	@Override
	public void rule() {
		// TODO Auto-generated method stub
		System.out.println("必须守法");
		
	}

}
