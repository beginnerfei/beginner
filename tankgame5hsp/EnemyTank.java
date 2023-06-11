package com.hsp.tankgame5hsp;

import java.util.Vector;

@SuppressWarnings({ "all" })
public class EnemyTank extends Tank implements Runnable {

	Vector<Shot> shots = new Vector<>();
	Vector<EnemyTank> enemyTanks = new Vector<>();
	boolean isLive = true;

	public EnemyTank(int x, int y) {
		super(x, y);
	}

	public void setEnemyTanks(Vector<EnemyTank> enemyTanks) {
		this.enemyTanks = enemyTanks;
	}

	public boolean isTouchEnemyTank() {

		switch (this.getDirect()) {
		case 0: // 上
			for (int i = 0; i < enemyTanks.size(); i++) {
				EnemyTank enemyTank = enemyTanks.get(i);
				// 不和自己比较
				if (enemyTank != this) {

					if (enemyTank.getDirect() == 0 || enemyTank.getDirect() == 2) {
						if (this.getX() >= enemyTank.getX() && this.getX() <= enemyTank.getX() + 40
								&& this.getY() >= enemyTank.getY() && this.getY() <= enemyTank.getY() + 60) {
							return true;
						}
						if (this.getX() + 40 >= enemyTank.getX() && this.getX() + 40 <= enemyTank.getX() + 40
								&& this.getY() >= enemyTank.getY() && this.getY() <= enemyTank.getY() + 60) {
							return true;
						}
					}

					if (enemyTank.getDirect() == 1 || enemyTank.getDirect() == 3) {

						if (this.getX() >= enemyTank.getX() && this.getX() <= enemyTank.getX() + 60
								&& this.getY() >= enemyTank.getY() && this.getY() <= enemyTank.getY() + 40) {
							return true;
						}
						if (this.getX() + 40 >= enemyTank.getX() && this.getX() + 40 <= enemyTank.getX() + 60
								&& this.getY() >= enemyTank.getY() && this.getY() <= enemyTank.getY() + 40) {
							return true;
						}
					}
				}

			}
			break;
		case 1: // 右
			// 让当前敌人坦克和其它所有的敌人坦克比较
			for (int i = 0; i < enemyTanks.size(); i++) {
				EnemyTank enemyTank = enemyTanks.get(i);

				if (enemyTank != this) {
					if (enemyTank.getDirect() == 0 || enemyTank.getDirect() == 2) {
						if (this.getX() + 60 >= enemyTank.getX() && this.getX() + 60 <= enemyTank.getX() + 40
								&& this.getY() >= enemyTank.getY() && this.getY() <= enemyTank.getY() + 60) {
							return true;
						}
						if (this.getX() + 60 >= enemyTank.getX() && this.getX() + 60 <= enemyTank.getX() + 40
								&& this.getY() + 40 >= enemyTank.getY() && this.getY() + 40 <= enemyTank.getY() + 60) {
							return true;
						}
					}
					if (enemyTank.getDirect() == 1 || enemyTank.getDirect() == 3) {
						if (this.getX() + 60 >= enemyTank.getX() && this.getX() + 60 <= enemyTank.getX() + 60
								&& this.getY() >= enemyTank.getY() && this.getY() <= enemyTank.getY() + 40) {
							return true;
						}
						if (this.getX() + 60 >= enemyTank.getX() && this.getX() + 60 <= enemyTank.getX() + 60
								&& this.getY() + 40 >= enemyTank.getY() && this.getY() + 40 <= enemyTank.getY() + 40) {
							return true;
						}
					}
				}
			}
			break;
		case 2: // 下

			for (int i = 0; i < enemyTanks.size(); i++) {
				EnemyTank enemyTank = enemyTanks.get(i);
				if (enemyTank != this) {
					if (enemyTank.getDirect() == 0 || enemyTank.getDirect() == 2) {
						if (this.getX() >= enemyTank.getX() && this.getX() <= enemyTank.getX() + 40
								&& this.getY() + 60 >= enemyTank.getY() && this.getY() + 60 <= enemyTank.getY() + 60) {
							return true;
						}
						if (this.getX() + 40 >= enemyTank.getX() && this.getX() + 40 <= enemyTank.getX() + 40
								&& this.getY() + 60 >= enemyTank.getY() && this.getY() + 60 <= enemyTank.getY() + 60) {
							return true;
						}
					}

					if (enemyTank.getDirect() == 1 || enemyTank.getDirect() == 3) {
						if (this.getX() >= enemyTank.getX() && this.getX() <= enemyTank.getX() + 60
								&& this.getY() + 60 >= enemyTank.getY() && this.getY() + 60 <= enemyTank.getY() + 40) {
							return true;
						}
						if (this.getX() + 40 >= enemyTank.getX() && this.getX() + 40 <= enemyTank.getX() + 60
								&& this.getY() + 60 >= enemyTank.getY() && this.getY() + 60 <= enemyTank.getY() + 40) {
							return true;
						}
					}
				}
			}
			break;
		case 3: // 左
			for (int i = 0; i < enemyTanks.size(); i++) {
				EnemyTank enemyTank = enemyTanks.get(i);
				if (enemyTank != this) {
					if (enemyTank.getDirect() == 0 || enemyTank.getDirect() == 2) {
						if (this.getX() >= enemyTank.getX() && this.getX() <= enemyTank.getX() + 40
								&& this.getY() >= enemyTank.getY() && this.getY() <= enemyTank.getY() + 60) {
							return true;
						}
						if (this.getX() >= enemyTank.getX() && this.getX() <= enemyTank.getX() + 40
								&& this.getY() + 40 >= enemyTank.getY() && this.getY() + 40 <= enemyTank.getY() + 60) {
							return true;
						}
					}
					if (enemyTank.getDirect() == 1 || enemyTank.getDirect() == 3) {
						if (this.getX() >= enemyTank.getX() && this.getX() <= enemyTank.getX() + 60
								&& this.getY() >= enemyTank.getY() && this.getY() <= enemyTank.getY() + 40) {
							return true;
						}
						if (this.getX() >= enemyTank.getX() && this.getX() <= enemyTank.getX() + 60
								&& this.getY() + 40 >= enemyTank.getY() && this.getY() + 40 <= enemyTank.getY() + 40) {
							return true;
						}
					}
				}
			}
			break;
		}
		return false;
	}

	@Override
	public void run() {
		while (true) {

			if (isLive && shots.size() < 1) {
				Shot s = null;

				switch (getDirect()) {
				case 0:
					s = new Shot(getX() + 20, getY(), 0);
					break;
				case 1:
					s = new Shot(getX() + 60, getY() + 20, 1);
					break;
				case 2: // 向下
					s = new Shot(getX() + 20, getY() + 60, 2);
					break;
				case 3:// 向左
					s = new Shot(getX(), getY() + 20, 3);
					break;
				}
				shots.add(s);
				// 启动
				new Thread(s).start();

			}

			switch (getDirect()) {
			case 0: // 向上

				for (int i = 0; i < 30; i++) {
					if (getY() > 0 && !isTouchEnemyTank()) {
						moveUp();
					}

					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				break;
			case 1: // 向右
				for (int i = 0; i < 30; i++) {
					if (getX() + 60 < 1000 && !isTouchEnemyTank()) {
						moveRight();
					}
					// 休眠50毫秒
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				break;
			case 2: // 向下
				for (int i = 0; i < 30; i++) {
					if (getY() + 60 < 750 && !isTouchEnemyTank()) {
						moveDown();
					}
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				break;
			case 3: // 向左
				for (int i = 0; i < 30; i++) {
					if (getX() > 0 && !isTouchEnemyTank()) {
						moveLeft();
					}
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				break;
			}

			setDirect((int) (Math.random() * 4));
			if (!isLive) {
				break; // 退出
			}

		}
	}
}
