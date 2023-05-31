package com.hsp.thiscode;

public class Homework01 {
	public static void main(String[] args) {
		A01 a01 = new A01();
		double[] arr = { 1, 1.4, -1.3, 89.8, 123.8, 66 }; // ;{};
		Double res = a01.max(arr);
		if (res != null) {
			System.out.println("arr的最大值=" + res);
		} else {
			System.out.println("arr的输入有误, 数组不能为null, 或者{}");
		}
	}
}

class A01 {
	public Double max(double[] arr) {
		if (arr != null && arr.length > 0) {// 先判断arr是否为null,然后再判断 length 是否>0
			double max = arr[0];
			for (int i = 1; i < arr.length; i++) {
				if (max < arr[i]) {
					max = arr[i];
				}
			}

			return max;// double
		} else {
			return null;
		}
	}
}
