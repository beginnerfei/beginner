package com.hsp.stringbufferhsp;

public class StringBufferExercise02 {

	public static void main(String[] args) {

		// new Scanner(System.in)
		String price = "8123564.59";
		StringBuffer sb = new StringBuffer(price);
		// 找到小数点的索引 然后在该位置的前3位，插入,即可
//	        int i = sb.lastIndexOf(".");
//	        sb = sb.insert(i - 3, ",");

		for (int i = sb.lastIndexOf(".") - 3; i > 0; i -= 3) {
			sb = sb.insert(i, ",");
		}
		System.out.println(sb);

	}
}
