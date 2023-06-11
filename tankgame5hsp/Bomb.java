package com.hsp.tankgame5hsp;

public class Bomb {
	int x, y; // 炸弹 坐标
	int life = 9; // 炸弹 生命周期
	boolean isLive = true; // 是否还存活

	public Bomb(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void lifeDown() {// 减少生命值 配合出现图片的爆炸效果
		if (life > 0) {
			life--;
		} else {
			isLive = false;
		}
	}
}
