package com.hsp.homework547hsp;

import java.util.ArrayList;
import java.util.Iterator;

public class Homework02 {

	public static void main(String[] args) {

		ArrayList arrayList = new ArrayList();
		Car car = new Car("宝马", 400000);
		Car car2 = new Car("宾利", 5000000);

		arrayList.add(car);
		arrayList.add(car2);
		System.out.println(arrayList);

		arrayList.remove(car); // remove:删除指定元素
		System.out.println(arrayList);
		System.out.println(arrayList.contains(car)); // contains:查找元素是否存在
		System.out.println(arrayList.size());// size:获取元素个数
		System.out.println(arrayList.isEmpty());// isEmpty:判断是否为空

		// System.out.println(arrayList.clear(););clear:清空

		System.out.println(arrayList);
		arrayList.addAll(arrayList);// addAll:添加多个元素
		System.out.println(arrayList);
		arrayList.containsAll(arrayList);// containsAll:查找多个元素是否都存在
		// removeAll：删除多个元素
		// arrayList.removeAll(arrayList); //相当于清空

		for (Object o : arrayList) {
			System.out.println(o);
		}
		System.out.println("=====迭代器=====");
		Iterator iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			Object next = iterator.next();
			System.out.println(next);

		}
	}
}

class Car {
	private String name;
	private double price;

	public Car(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car{" + "name='" + name + '\'' + ", price=" + price + '}';
	}
}
