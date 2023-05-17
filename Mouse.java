package com.itheima.polymorphictest;

public class Mouse implements USB {

	private String name;
	

	public Mouse(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public void dbClick() {
		System.out.println("双击");
	}
	@Override
	public void connect() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unconnect() {
		// TODO Auto-generated method stub
		
	}

}
