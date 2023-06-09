package com.hsp.tankgamehsp;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

	Hero hero = null; 	// 定义我的坦克

	public MyPanel() {
		hero = new Hero(100, 100);// 初始化自己坦克
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.fillRect(0, 0, 1000, 750);// 填充矩形，默认黑色
		drawTank(hero.getX(), hero.getY(), g, 0, 0);		// 画出坦克-封装方法

	}

	public void drawTank(int x, int y, Graphics g, int direct, int type) {	// 编写方法，画出坦克

		switch (type) {		// 根据不同类型坦克，设置不同颜色
		case 0: // 我们的坦克
			g.setColor(Color.cyan);
			break;
		case 1: // 敌人的坦克
			g.setColor(Color.yellow);
			break;
		}
		
		switch (direct) {// 根据坦克方向，来绘制坦克
		case 0: // 表示向上
			g.fill3DRect(x, y, 10, 60, false);// 画出坦克左边轮子
			g.fill3DRect(x + 30, y, 10, 60, false);// 画出坦克右边轮子
			g.fill3DRect(x + 10, y + 10, 20, 40, false);// 画出坦克盖子
			g.fillOval(x + 10, y + 20, 20, 20);// 画出圆形盖子
			g.drawLine(x + 20, y + 30, x + 20, y);// 画出炮筒
			break;
		default:
			System.out.println("暂时没有处理");
		}

	}
}
