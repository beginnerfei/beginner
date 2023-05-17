package com.itheima.polymorphictest;

public class Computer {

	private String name;
	
	

	public Computer(String name) {
		super();
		this.name = name;
	}
	public void  Start() {
		System.out.println(name+"电脑开机了");
	}
	public void installUSB(USB usb) {
		
		usb.connect();
		usb.unconnect();
		
		if(usb instanceof KeyBoard) {
			KeyBoard k = (KeyBoard) usb;
			k.keyDown();
		}else if(usb instanceof Mouse) {
			Mouse m = (Mouse) usb;
			m.dbClick();
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
