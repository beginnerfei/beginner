package com.hsp.tankgame5hsp;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;

import javax.swing.JFrame;

public class HspTankGame05 extends JFrame {

	MyPanel mp = null;// 定义MyPanel
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		HspTankGame05 hspTankGame01 = new HspTankGame05();
	}

	public HspTankGame05() {
		System.out.println("请输入选择 1: 新游戏 2: 继续上局");
		String key = scanner.next();
		mp = new MyPanel(key);

		Thread thread = new Thread(mp);
		thread.start();// 将mp 放入到Thread 启动
		this.add(mp);// 把面板(就是游戏的绘图区域)

		this.setSize(1300, 950);
		this.addKeyListener(mp);// JFrame 监听mp的键盘事件
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

		this.addWindowListener(new WindowAdapter() {// 增加相应关闭窗口的处理
			@Override
			public void windowClosing(WindowEvent e) {
				Recorder.keepRecord();
				System.exit(0);
			}
		});
	}
}
