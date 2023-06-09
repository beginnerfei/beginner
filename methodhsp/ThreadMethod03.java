package com.hsp.methodhsp;

public class ThreadMethod03 {

	public static void main(String[] args) throws InterruptedException {
		MyDaemonThread myDaemonThread = new MyDaemonThread();
		myDaemonThread.setDaemon(true);
		myDaemonThread.start();

		for (int i = 1; i <= 10; i++) {
			System.out.println("w宝强在辛苦的工作");
			Thread.sleep(1000);
		}
	}
}

class MyDaemonThread extends Thread {
	public void run() {
		for (;;) {// 无限循环
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("马蓉和宋喆聊天，哈哈哈");
		}
	}
}
