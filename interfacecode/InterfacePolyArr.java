package com.hsp.interfacecode;

public class InterfacePolyArr {
	public static void main(String[] args) {

		Usb[] usbs = new Usb[2];
		usbs[0] = new PhoneP();
		usbs[1] = new CameraC();
		
		for (int i = 0; i < usbs.length; i++) {
			usbs[i].work();// 动态绑定
			// 向下转型
			if (usbs[i] instanceof PhoneP) {
				((PhoneP) usbs[i]).call();
			}
		}
	}
}

interface Usb {
	void work();
}

class PhoneP implements Usb {
	public void call() {
		System.out.println("手机可以打电话");
	}

	@Override
	public void work() {
		System.out.println("手机工作中");
	}
}

class CameraC implements Usb {

	@Override
	public void work() {
		System.out.println("相机工作中");
	}
}
