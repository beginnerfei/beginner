package com.hsp.migong;

public class VarParameterDetail {

	
	int[] arr = {1, 2, 3};
	TT t1 = new TT();
	//t1.f1(arr);
}


class TT {

	public void f1(int... nums) {
		System.out.println("长度=" + nums.length);
	}

//细节: 可变参数可以和普通类型的参数一起放在形参列表，但必须保证可变参数在最后
	public void f2(String str, double... nums) {

	}
//细节: 一个形参列表中只能出现一个可变参数
//下面的写法是错的.
// public void f3(int... nums1, double... nums2) {

// }
}
