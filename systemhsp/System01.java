package com.hsp.systemhsp;

import java.util.Arrays;

public class System01 {

	public static void main(String[] args) {

//	        System.out.println("ok1");
//	        exit(0) 表示程序退出   0 表示一个状态 , 正常的状态
//	        System.exit(0);
//	        System.out.println("ok2");
		// arraycopy ：复制数组元素，适合底层调用
		// Arrays.copyOf完成复制数组

		int[] src = { 1, 2, 3 };
		int[] dest = new int[3];

		System.arraycopy(src, 0, dest, 0, src.length);
		// int[] src={1,2,3};
		System.out.println("dest=" + Arrays.toString(dest));// [1, 2, 3]

		System.out.println(System.currentTimeMillis());

	}
}
