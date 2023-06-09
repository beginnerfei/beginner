package com.hsp.tankgamehsp;

import javax.swing.*;

public class HspTankGame01 extends JFrame {

	MyPanel mp = null;	// 定义MyPanel

	public static void main(String[] args) {

		HspTankGame01 hspTankGame01 = new HspTankGame01();
	}

	public HspTankGame01() {
		mp = new MyPanel();
		this.add(mp);// 把面板(就是游戏的绘图区域)
		this.setSize(1000, 750);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
