package com.itheima.polymorphictest;

public class KeyBoard implements USB{

	
	private String name;
	
	
	public KeyBoard(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void keyDown() {
		System.out.println("键盘敲击");//独有功能
	}
	
	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("键盘接入");
	}

	@Override
	public void unconnect() {
		// TODO Auto-generated method stub
		System.out.println("键盘拔出");
		
	}
	

}
