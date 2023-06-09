package com.hsp.methodhsp;

public class ThreadMethod01 {
	public static void main(String[] args) throws InterruptedException {
		T t = new T();
		t.setName("韩");
		t.setPriority(Thread.MIN_PRIORITY);
		t.start();

		for (int i = 0; i < 5; i++) {
			Thread.sleep(1000);
			System.out.println("hi " + i);
		}

		System.out.println(t.getName() + " 线程的优先级 =" + t.getPriority());// 1

		t.interrupt();// 执行到这 会中断 t线程的休眠

	}
}

class T extends Thread { 
	@Override
	public void run() {
		while (true) {
			for (int i = 0; i < 100; i++) {
				// Thread.currentThread().getName()
				System.out.println(Thread.currentThread().getName() + "  吃包子" + i);
			}
			try {
				System.out.println(Thread.currentThread().getName() + " 休眠中");
				Thread.sleep(20000);
			} catch (InterruptedException e) {
				System.out.println(Thread.currentThread().getName() + "被 interrupt了");
			}
		}
	}
}
