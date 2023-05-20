package com.itheima.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<String> lists = new ArrayList<>();
		lists.add("赵敏");
		lists.add("小昭");
		lists.add("殷素素");
		lists.add("周芷若");
		System.out.println(lists);

		for (String string : lists) {   //增强for循环
			System.out.println(string);
		}

		System.out.println("------------------");

		double[] scores = { 100, 99.5, 59.5 };
		for (double score : scores) {
			System.out.println(score);

		}
		System.out.println(Arrays.toString(scores));
	}

}
