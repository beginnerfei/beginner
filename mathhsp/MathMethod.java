package com.hsp.mathhsp;

public class MathMethod {

	public static void main(String[] args) {

		int abs = Math.abs(-9);
		System.out.println(abs);// abs 绝对值

		double pow = Math.pow(2, 4);
		System.out.println(pow); // pow 求幂

		double ceil = Math.ceil(3.9);
		System.out.println(ceil);// ceil 向上取整 4.0

		double floor = Math.floor(4.001);
		System.out.println(floor);// floor 向下取整 4.0

		long round = Math.round(5.51);
		System.out.println(round);// round 四舍五入 Math.floor(该参数+0.5) 6

		double sqrt = Math.sqrt(9.0);
		System.out.println(sqrt);// sqrt 求开方3.0

		for (int i = 0; i < 100; i++) {
			System.out.println((int) (2 + Math.random() * (7 - 2 + 1)));
		}

		int min = Math.min(1, 9);
		int max = Math.max(45, 90);
		System.out.println("min=" + min);
		System.out.println("max=" + max);

	}
}
