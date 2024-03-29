package com.hsp.hourse0905hsp;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Comparator;

public class HorseChessBoard {

	// 定义属性
	private static int X = 6; // 表示col  列
	private static int Y = 6; // 表示row  行
	private static int[][] chessBoard = new int[Y][X]; // 棋盘
	private static boolean[] visited = new boolean[X * Y];// 记录该点是否访问过 记录某个位置是否走过 
	private static boolean finished = false; // 标识是否遍历结束 记录马儿是否遍历完棋盘

	public static void main(String[] args) {

		int row = 2;
		int col = 2;

		long start = System.currentTimeMillis();
		traversalChessBoard(chessBoard, row - 1, col - 1, 1);
		long end = System.currentTimeMillis();

		System.out.println("遍历耗时=" + (end - start));
		// 输出当前这个棋盘的情况
		for (int[] rows : chessBoard) {
			for (int step : rows) {// step 表示 该位置是马儿应该走的第几步
				System.out.print(step + "\t");
			}
			System.out.println();
		}
	}

	// 写一个方法，对ps的各个位置，可以走的下一个位置的次数进行排序, 把可能走的下一个位置从小到大排序
	public static void sort(ArrayList<Point> ps) {
		ps.sort(new Comparator<Point>() {
			@Override
			public int compare(Point o1, Point o2) {
				return next(o1).size() - next(o2).size();
			}
		});
	}

	// 编写最核心的算法，遍历棋盘，如果遍历成功，就把 finished 设置为true ，并且将马儿走的每一步step，记录到 chessBoard
	public static void traversalChessBoard(int[][] chessBoard, int row, int col, int step) {

		chessBoard[row][col] = step;  // 把step 记录到 chessBoard
		
		visited[row * X + col] = true;  // 把这个位置，设置为已经访问
		
		ArrayList<Point> ps = next(new Point(col, row)); // col - X , row - Y//获取当前这个位置可以走的下一个位置有哪些
		sort(ps);// 排序
		
		// 遍历
		while (!ps.isEmpty()) {
			// 取出当前这个ps 第一个位置(点)
			Point p = ps.remove(0);
			// 判断该位置是否走过，如果没有走过，我们就递归遍历
			if (!visited[p.y * X + p.x]) {
			
				traversalChessBoard(chessBoard, p.y, p.x, step + 1);	// 递归遍历
			}
		}

		// 当退出while，看看是否遍历成功, 如果没有成功，就重置相应的值，然后进行回溯
		if (step < X * Y && !finished) {
			chessBoard[row][col] = 0;// 重置
			visited[row * X + col] = false;
		} else {
			finished = true;
		}
	}

	// 编写方法，可以获取当前位置，可以走的下一步的所有位置(Point表示 x,y)
	public static ArrayList<Point> next(Point curPoint) {

		ArrayList<Point> ps = new ArrayList<>();	// 创建一个ArrayList

		Point p1 = new Point();	// 创建一个Point对象(点/位置), 准备放入到 ps

		// 判断在 curPoint 是否可以走如下位置，如果可以走，就将该点(Point) 放入到ps

		// 判断是否可以走5位置
		if ((p1.x = curPoint.x - 2) >= 0 && (p1.y = curPoint.y - 1) >= 0) {
			ps.add(new Point(p1)); // 这里一定要new Point
		}
		// 判断是否可以走6位置
		if ((p1.x = curPoint.x - 1) >= 0 && (p1.y = curPoint.y - 2) >= 0) {
			ps.add(new Point(p1)); // 这里一定要new Point
		}
		// 判断是否可以走7位置
		if ((p1.x = curPoint.x + 1) < X && (p1.y = curPoint.y - 2) >= 0) {
			ps.add(new Point(p1)); // 这里一定要new Point
		}
		// 判断是否可以走0位置
		if ((p1.x = curPoint.x + 2) < X && (p1.y = curPoint.y - 1) >= 0) {
			ps.add(new Point(p1)); // 这里一定要new Point
		}
		// 判断是否可以走1位置
		if ((p1.x = curPoint.x + 2) < X && (p1.y = curPoint.y + 1) < Y) {
			ps.add(new Point(p1)); // 这里一定要new Point
		}
		// 判断是否可以走2位置
		if ((p1.x = curPoint.x + 1) < X && (p1.y = curPoint.y + 2) < Y) {
			ps.add(new Point(p1)); // 这里一定要new Point
		}
		// 判断是否可以走3位置
		if ((p1.x = curPoint.x - 1) >= 0 && (p1.y = curPoint.y + 2) < Y) {
			ps.add(new Point(p1)); // 这里一定要new Point
		}
		// 判断是否可以走4位置
		if ((p1.x = curPoint.x - 2) >= 0 && (p1.y = curPoint.y + 1) < Y) {
			ps.add(new Point(p1)); // 这里一定要new Point
		}

		return ps;

	}
}
