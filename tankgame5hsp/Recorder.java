package com.hsp.tankgame5hsp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;
@SuppressWarnings({"all"})
public class Recorder {

	private static int allEnemyTankNum = 0;// 定义变量 记录我方击毁敌人坦克数
	private static BufferedWriter bw = null;
	private static BufferedReader br = null;// 定义IO对象, 准备写数据到文件中
	private static String recordFile = "\\myRecord.txt";
	private static Vector<EnemyTank> enemyTanks = null;//指向 MyPanel的敌人坦克Vector
	private static Vector<Node> nodes = new Vector<>();// 定义一个Node的Vector保存敌人的信息node

	public static void setEnemyTanks(Vector<EnemyTank> enemyTanks) {
		Recorder.enemyTanks = enemyTanks;
	}

	public static String getRecordFile() {
		return recordFile;
	}

	public static Vector<Node> getNodesAndEnemyTankRec() {

		try {

			br = new BufferedReader(new FileReader(recordFile));
			allEnemyTankNum = Integer.parseInt(br.readLine());
			String line = "";// 255 40 0
			while ((line = br.readLine()) != null) {
				String[] xyd = line.split(" ");
				Node node = new Node(Integer.parseInt(xyd[0]), Integer.parseInt(xyd[1]), Integer.parseInt(xyd[2]));
				nodes.add(node);// 放入nodes Vector
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return nodes;
	}

	public static void keepRecord() {
		try {
			bw = new BufferedWriter(new FileWriter(recordFile));
			bw.write(allEnemyTankNum + "\r\n");

			for (int i = 0; i < enemyTanks.size(); i++) {
				EnemyTank enemyTank = enemyTanks.get(i);
				if (enemyTank.isLive) { // 建议判断 保存该enemyTank信息
					String record = enemyTank.getX() + " " + enemyTank.getY() + " " + enemyTank.getDirect();	
					bw.write(record + "\r\n");// 写入到文件
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bw != null) {
					bw.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static int getAllEnemyTankNum() {
		return allEnemyTankNum;
	}

	public static void setAllEnemyTankNum(int allEnemyTankNum) {
		Recorder.allEnemyTankNum = allEnemyTankNum;
	}

	public static void addAllEnemyTankNum() {
		Recorder.allEnemyTankNum++;// 当我方击毁一个敌人坦克，就应当 allEnemyTankNum++
	}
}
