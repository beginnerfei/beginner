package com.hsp.interfacecode;

public class Computer {
	public void work(UsbInterface usbInterface) {
		// 通过接口，来调用方法
		usbInterface.start();
		usbInterface.stop();
	}
}
