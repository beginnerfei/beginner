package cpm.itheima.arrays;

import java.util.Arrays;

public class ArraysDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 10, 2, 55, 23, 24, 100 };
		System.out.println(arr);

//        String rs = Arrays.toString(arr);
//        System.out.println(rs);

		System.out.println(Arrays.toString(arr));

		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		int index = Arrays.binarySearch(arr, 55);// 二分搜索技术
		System.out.println(index);

		int index2 = Arrays.binarySearch(arr, 22);
		System.out.println(index2);

		int[] arr2 = { 12, 36, 34, 25, 13, 24, 234, 100 };
		System.out.println(Arrays.binarySearch(arr2, 36)); // 数组如果没有排好序，可能会找不到存在的元素

	}

}
