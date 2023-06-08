package com.hsp.sethsp;

import java.util.TreeSet;

public class TreeSet01 {

	public static void main(String[] args) {

		TreeSet treeSet = new TreeSet();
//		TreeSet treeSet = new TreeSet(new Comparator() {
//			@Override
//			public int compare(Object o1, Object o2) {
//				// 下面 调用String的 compareTo方法进行字符串大小比较
//				// 如果老韩要求加入的元素，按照长度大小排序
//				// return ((String) o2).compareTo((String) o1);
//				return ((String) o1).length() - ((String) o2).length();
//			}
//		});
		treeSet.add("jack");
		treeSet.add("tom");
		treeSet.add("sp");
		treeSet.add("a");
		treeSet.add("abc");

		System.out.println("treeSet=" + treeSet);

	}
}