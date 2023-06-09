package com.hsp.synhsp;

public class SellTicket {

	public static void main(String[] args) {

		// 测试
//	        SellTicket01 sellTicket01 = new SellTicket01();
//	        SellTicket01 sellTicket02 = new SellTicket01();
//	        SellTicket01 sellTicket03 = new SellTicket01();
//	        //这里我们会出现超卖
//	        sellTicket01.start();//启动售票线程
//	        sellTicket02.start();//启动售票线程
//	        sellTicket03.start();//启动售票线程
//	        System.out.println("======使用实现接口方式来售票=======");
//	        SellTicket02 sellTicket02 = new SellTicket02();
//	        new Thread(sellTicket02).start();//第1个线程-窗口
//	        new Thread(sellTicket02).start();//第2个线程-窗口
//	        new Thread(sellTicket02).start();//第3个线程-窗口

		SellTicket03 sellTicket03 = new SellTicket03();
		new Thread(sellTicket03).start();// 第1个线程-窗口
		new Thread(sellTicket03).start();// 第2个线程-窗口
		new Thread(sellTicket03).start();// 第3个线程-窗口

	}
}

class SellTicket03 implements Runnable {
	private int ticketNum = 100;
	private boolean loop = true;
	Object object = new Object();

	public synchronized static void m1() {

	}

	public static void m2() {
		synchronized (SellTicket03.class) {
			System.out.println("m2");
		}
	}

	public /* synchronized */ void sell() {

		synchronized (/* this */ object) {
			if (ticketNum <= 0) {
				System.out.println("售票结束...");
				loop = false;
				return;
			}

			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("窗口 " + Thread.currentThread().getName() + " 售出一张票" + " 剩余票数=" + (--ticketNum));

		}
	}

	@Override
	public void run() {
		while (loop) {

			sell();
		}
	}
}

// 使用Thread方式
// new SellTicket01().start()
// new SellTicket01().start();
class SellTicket01 extends Thread {

	private static int ticketNum = 100;// 让多个线程共享 ticketNum

//	    public void m1() {
//	        synchronized (this) {
//	            System.out.println("hello");
//	        }
//	    }

	@Override
	public void run() {

		while (true) {

			if (ticketNum <= 0) {
				System.out.println("售票结束...");
				break;
			}

			// 休眠50毫秒, 模拟
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("窗口 " + Thread.currentThread().getName() + " 售出一张票" + " 剩余票数=" + (--ticketNum));

		}
	}
}

// 实现接口方式
class SellTicket02 implements Runnable {
	private int ticketNum = 100;// 让多个线程共享 ticketNum

	@Override
	public void run() {
		while (true) {

			if (ticketNum <= 0) {
				System.out.println("售票结束...");
				break;
			}

			// 休眠50毫秒, 模拟
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("窗口 " + Thread.currentThread().getName() + " 售出一张票" + " 剩余票数=" + (--ticketNum));// 1 - 0
																												// - -1
																												// - -2

		}
	}
}
