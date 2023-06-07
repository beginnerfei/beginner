package com.hsp.arrayshsp;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysMethod01 {
	public static void main(String[] args) {

		Integer[] integers = { 1, 20, 90 };
//        for(int i = 0; i < integers.length; i++) {
//            System.out.println(integers[i]);
//        }

//        System.out.println(Arrays.toString(integers));//

		Integer arr[] = { 1, -1, 7, 0, 89 };

		// Comparator<? super T> c)()
		// while (left < right) {
		// int mid = (left + right) >>> 1;
		// if (c.compare(pivot, a[mid]) < 0)
		// right = mid;
		// else
		// left = mid + 1;
		// }
		// (4) new Comparator() {
		// @Override
		// public int compare(Object o1, Object o2) {
		// Integer i1 = (Integer) o1;
		// Integer i2 = (Integer) o2;
		// return i2 - i1;
		// }
		// }
		// (5) public int compare(Object o1, Object o2) 返回的值>0 还是 <0
		// 会影响整个排序结果, 这就充分体现了 接口编程+动态绑定+匿名内部类的综合使用
		// 将来的底层框架和源码的使用方式，会非常常见
		// Arrays.sort(arr); // 默认排序方法
		// 定制排序
		Arrays.sort(arr, new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				Integer i1 = (Integer) o1;
				Integer i2 = (Integer) o2;
				return i2 - i1;
			}
		});
		System.out.println("======排序后======");
		System.out.println(Arrays.toString(arr));//

	}
}
