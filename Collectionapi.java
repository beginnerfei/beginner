package com.itheima.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Collectionapi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<String> c = new ArrayList<>();

		c.add("Java"); // 添加元素
		c.add("HTML");
		System.out.println(c.add("HTML"));
		c.add("MySQL");
		c.add("Java");
		System.out.println(c.add("黑马"));
		System.out.println(c);

		// 清空集合的元素 c.clear();
		// System.out.println(c.isEmpty()); 判断集合是否为空 是空返回true

		System.out.println(c.size()); // 获取集合的大小。

		// 判断集合中是否包含某个元素
		System.out.println(c.contains("Java"));
		System.out.println(c.contains("java"));
		System.out.println(c.contains("黑马"));

		// 删除某个元素:如果有多个重复元素默认删除前面的第一个
		System.out.println(c.remove("java"));
		System.out.println(c);
		System.out.println(c.remove("Java"));
		System.out.println(c);

		Object[] arrs = c.toArray(); // 把集合转换成数组 
		System.out.println("数组：" + Arrays.toString(arrs));

		System.out.println("-------------拓展------------");
		Collection<String> c1 = new ArrayList<>();
		c1.add("java1");
		c1.add("java2");
		Collection<String> c2 = new ArrayList<>();
		c2.add("赵敏");
		c2.add("殷素素");

		c1.addAll(c2); // addAll把c2集合的元素倒入到c1
		System.out.println(c1);
		System.out.println(c2);

	}

}
