package com.hsp.stringhsp;

public class String01 {

	public static void main(String[] args) {

		// 字符串的字符使用Unicode字符编码，一个字符(不区分字母还是汉字)占两个字节
		// String s2 = new String(String original);
		// String s3 = new String(char[] a);
		// String s4 = new String(char[] a,int startIndex,int count)
		// String s5 = new String(byte[] b)
		// 接口 Comparable [String 对象可以比较大小]
		// value 是一个final类型， 不可以修改(需要功力)：即value不能指向
		// 新的地址，但是单个字符内容是可以变化

		String name = "jack";
		name = "tom";
		final char[] value = { 'a', 'b', 'c' };
		char[] v2 = { 't', 'o', 'm' };
		value[0] = 'H';

	}
}
