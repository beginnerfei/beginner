package com.hsp.tankgame5hsp;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

import javax.swing.JPanel;

@SuppressWarnings({ "all" })
public class MyPanel extends JPanel implements KeyListener, Runnable {

	Hero hero = null; // 定义我的坦克
	Vector<EnemyTank> enemyTanks = new Vector<>(); // 定义敌人坦克放入Vector
	Vector<Node> nodes = new Vector<>();
	Vector<Bomb> bombs = new Vector<>();
	int enemyTankSize = 3;
	
	Image image1 = null;// 定义三张炸弹图片 显示爆炸效果
	Image image2 = null;
	Image image3 = null;

	public MyPanel(String key) {
		nodes = Recorder.getNodesAndEnemyTankRec();
		Recorder.setEnemyTanks(enemyTanks);

		hero = new Hero(500, 100);// 初始化

		switch (key) {
		case "1":
			for (int i = 0; i < enemyTankSize; i++) {// 初始化敌人坦克
				EnemyTank enemyTank = new EnemyTank((100 * (i + 1)), 0);// 创建一个敌人的坦克
				enemyTank.setEnemyTanks(enemyTanks);
				enemyTank.setDirect(2); // 设置方向
				new Thread(enemyTank).start();// 启动敌人坦克线程
				Shot shot = new Shot(enemyTank.getX() + 20, enemyTank.getY() + 60, enemyTank.getDirect());

				enemyTank.shots.add(shot);
				new Thread(shot).start();
				enemyTanks.add(enemyTank);
			}
			break;
		case "2": // 继续上局游戏
			for (int i = 0; i < nodes.size(); i++) {
				Node node = nodes.get(i);
				EnemyTank enemyTank = new EnemyTank(node.getX(), node.getY());
				enemyTank.setEnemyTanks(enemyTanks);
				enemyTank.setDirect(node.getDirect());
				new Thread(enemyTank).start();// 启动

				Shot shot = new Shot(enemyTank.getX() + 20, enemyTank.getY() + 60, enemyTank.getDirect());

				enemyTank.shots.add(shot);

				new Thread(shot).start();

				enemyTanks.add(enemyTank);
			}
			break;
		default:
			System.out.println("你的输入有误");
		}

		// 初始化图片对象
		image1 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_1.gif"));
		image2 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_2.gif"));
		image3 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_3.gif"));

	}

	public void showInfo(Graphics g) {// 我方击毁敌方坦克的信息

		g.setColor(Color.BLACK);// 画出玩家的总成绩
		Font font = new Font("宋体", Font.BOLD, 25);
		g.setFont(font);

		g.drawString("您累积击毁敌方坦克", 1020, 30);
		drawTank(1020, 60, g, 0, 0);// 画出一个敌方坦克
		g.setColor(Color.BLACK);// 重新设置成黑色
		g.drawString(Recorder.getAllEnemyTankNum() + "", 1080, 100);

	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.fillRect(0, 0, 1000, 750);// 填充矩形(默认黑色)
		showInfo(g);
		if (hero != null && hero.isLive) {
			drawTank(hero.getX(), hero.getY(), g, hero.getDirect(), 1);
		}

		if (hero.shot != null && hero.shot.isLive == true) {// 画出子弹
			g.draw3DRect(hero.shot.x, hero.shot.y, 1, 1, false);

		}
//       将hero的子弹集合 shots ,遍历取出绘制
//        for(int i = 0; i < hero.shots.size(); i++) {
//            Shot shot = hero.shots.get(i);
//            if (shot != null && shot.isLive) {
//                g.draw3DRect(shot.x, shot.y, 1, 1, false);
//
//            } else {//如果该shot对象已经无效 ,就从shots集合中拿掉
//                hero.shots.remove(shot);
//            }
//        }

		for (int i = 0; i < bombs.size(); i++) {
			Bomb bomb = bombs.get(i);// 取出炸弹
			if (bomb.life > 6) {
				g.drawImage(image1, bomb.x, bomb.y, 60, 60, this);
			} else if (bomb.life > 3) {
				g.drawImage(image2, bomb.x, bomb.y, 60, 60, this);
			} else {
				g.drawImage(image3, bomb.x, bomb.y, 60, 60, this);
			}
			bomb.lifeDown();// 炸弹生命值减少
			if (bomb.life == 0) {
				bombs.remove(bomb);
			}
		}

		for (int i = 0; i < enemyTanks.size(); i++) {
			EnemyTank enemyTank = enemyTanks.get(i);
			if (enemyTank.isLive) {
				drawTank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirect(), 0);
				for (int j = 0; j < enemyTank.shots.size(); j++) {
					Shot shot = enemyTank.shots.get(j);
					if (shot.isLive) {
						g.draw3DRect(shot.x, shot.y, 1, 1, false);
					} else {
						enemyTank.shots.remove(shot);
					}
				}
			}
		}

	}

	public void drawTank(int x, int y, Graphics g, int direct, int type) { // 编写方法，画出坦克

		switch (type) {
		case 0: // 敌人的坦克
			g.setColor(Color.cyan);
			break;
		case 1: // 我的坦克
			g.setColor(Color.yellow);
			break;
		}

		switch (direct) {
		case 0: // 上
			g.fill3DRect(x, y, 10, 60, false);// 画出坦克左边轮子
			g.fill3DRect(x + 30, y, 10, 60, false);// 画出坦克右边轮子
			g.fill3DRect(x + 10, y + 10, 20, 40, false);// 画出坦克盖子
			g.fillOval(x + 10, y + 20, 20, 20);// 画出圆形盖子
			g.drawLine(x + 20, y + 30, x + 20, y);// 画出炮筒
			break;
		case 1: // 右
			g.fill3DRect(x, y, 60, 10, false);
			g.fill3DRect(x, y + 30, 60, 10, false);
			g.fill3DRect(x + 10, y + 10, 40, 20, false);
			g.fillOval(x + 20, y + 10, 20, 20);
			g.drawLine(x + 30, y + 20, x + 60, y + 20);
			break;
		case 2: // 下
			g.fill3DRect(x, y, 10, 60, false);
			g.fill3DRect(x + 30, y, 10, 60, false);
			g.fill3DRect(x + 10, y + 10, 20, 40, false);
			g.fillOval(x + 10, y + 20, 20, 20);
			g.drawLine(x + 20, y + 30, x + 20, y + 60);
			break;
		case 3: // 左
			g.fill3DRect(x, y, 60, 10, false);
			g.fill3DRect(x, y + 30, 60, 10, false);
			g.fill3DRect(x + 10, y + 10, 40, 20, false);
			g.fillOval(x + 20, y + 10, 20, 20);
			g.drawLine(x + 30, y + 20, x, y + 20);
			break;
		default:
			System.out.println("暂时没有处理");
		}

	}

	public void hitEnemyTank() {

//        for(int j = 0;j < hero.shots.size();j++) {//遍历子弹
//            Shot shot = hero.shots.get(j);
//            //判断是否击中了敌人坦克
//            if (shot != null && hero.shot.isLive) {//当我的子弹还存活
//                for (int i = 0; i < enemyTanks.size(); i++) {//遍历敌人所有的坦克
//                    EnemyTank enemyTank = enemyTanks.get(i);
//                    hitTank(hero.shot, enemyTank);
//                }
//
//            }
//        }

		if (hero.shot != null && hero.shot.isLive) {// 当我的子弹还存活

			for (int i = 0; i < enemyTanks.size(); i++) {
				EnemyTank enemyTank = enemyTanks.get(i);
				hitTank(hero.shot, enemyTank);
			}

		}

	}

	public void hitHero() {
		for (int i = 0; i < enemyTanks.size(); i++) {
			EnemyTank enemyTank = enemyTanks.get(i);
			for (int j = 0; j < enemyTank.shots.size(); j++) {
				Shot shot = enemyTank.shots.get(j);
				if (hero.isLive && shot.isLive) {
					hitTank(shot, hero);
				}
			}
		}
	}

	// 后面将 enemyTank 改成 tank名称
	public void hitTank(Shot s, Tank enemyTank) {// 判断 我方子弹是否击中敌人坦克
		switch (enemyTank.getDirect()) {
		case 0: // 坦克向上
		case 2: // 坦克向下
			if (s.x > enemyTank.getX() && s.x < enemyTank.getX() + 40 && s.y > enemyTank.getY()
					&& s.y < enemyTank.getY() + 60) {
				s.isLive = false;
				enemyTank.isLive = false;
				enemyTanks.remove(enemyTank);
				if (enemyTank instanceof EnemyTank) {
					Recorder.addAllEnemyTankNum();
				}
				Bomb bomb = new Bomb(enemyTank.getX(), enemyTank.getY());
				bombs.add(bomb);
			}
			break;
		case 1: // 坦克向右
		case 3: // 坦克向左
			if (s.x > enemyTank.getX() && s.x < enemyTank.getX() + 60 && s.y > enemyTank.getY()
					&& s.y < enemyTank.getY() + 40) {
				s.isLive = false;
				enemyTank.isLive = false;
				enemyTanks.remove(enemyTank);
				if (enemyTank instanceof EnemyTank) {
					Recorder.addAllEnemyTankNum();
				}
				Bomb bomb = new Bomb(enemyTank.getX(), enemyTank.getY());
				bombs.add(bomb);
			}
			break;
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println(e.getKeyCode());
		if (e.getKeyCode() == KeyEvent.VK_W) {// 按下W改变坦克方向
			hero.setDirect(0);
			if (hero.getY() > 0) { // 修改坦克的坐标 y -= 1
				hero.moveUp();
			}
		} else if (e.getKeyCode() == KeyEvent.VK_D) {// D
			hero.setDirect(1);
			if (hero.getX() + 60 < 1000) {
				hero.moveRight();
			}

		} else if (e.getKeyCode() == KeyEvent.VK_S) {// S
			hero.setDirect(2);
			if (hero.getY() + 60 < 750) {
				hero.moveDown();
			}
		} else if (e.getKeyCode() == KeyEvent.VK_A) {// A
			hero.setDirect(3);
			if (hero.getX() > 0) {
				hero.moveLeft();
			}
		}

		if (e.getKeyCode() == KeyEvent.VK_J) {
			if (hero.shot == null || !hero.shot.isLive) {
				hero.shotEnemyTank();
			}
		}
		this.repaint();// 让面板重绘

	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

	@Override
	public void run() { // 每隔 100毫秒重绘区域, 刷新绘图区域 子弹就移动
		while (true) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			hitEnemyTank();// 判断是我们子弹否击中敌人坦克
			hitHero(); // 判断敌人坦克是否击中我们
			this.repaint();
		}

	}
}
