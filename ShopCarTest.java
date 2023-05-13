package com.itheima.demo;

import java.util.Iterator;
import java.util.Scanner;

public class ShopCarTest {
	public static void main(String[] args) {
		// 定义商品类，用于创建商品对象
		// 定义购物车对象，使用一个数组对象表示
		Goods[] shopCar = new Goods[100];// null
		while (true) {
			// 搭建操作架构
			System.out.println("请您选择如下命令进行操作");
			System.out.println("添加商品到购物车：add");
			System.out.println("添加商品到购物车：query");
			System.out.println("添加商品到购物车：update");
			System.out.println("结算购买商品的金额：pay");
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入命令：");
			String command = sc.next();
			switch (command) {
			case "add":
				addGoods(shopCar, sc);
				break;
			case "query":
				queryGoods(shopCar);
				break;
			case "update":
				updateGoods(shopCar,sc);
				break;
			case "pay":
				payGoods(shopCar);
				break;
			default:
				System.out.println("没有该功能！");
			}
		}

	}

	public static void payGoods(Goods[] shopCar) {
		// TODO Auto-generated method stub
		double money = 0;
		for (int i = 0; i < shopCar.length; i++) {
			Goods g = shopCar[i];
			if(g!=null) {
				money +=(g.price * g.buyNumber);
			}else {
				break;
			}
		}
System.out.println("订单金额"+money);
	}

	public static void updateGoods(Goods[] shopCar, Scanner sc) {
		while (true) {
			// TODO Auto-generated method stub
			System.out.println("请输入也要修改的商品id");
			int id = sc.nextInt();
			Goods g = getGoodsById(shopCar, id);
			if (g == null) {
				System.out.println("对不起，没有购买商品");
			} else {
				System.out.println("请您输入" + g.name + "购买数量");
				int buyNumber = sc.nextInt();
				g.buyNumber = buyNumber;
				System.out.println("修改完成");
				queryGoods(shopCar);
				break;
			} 
		}
	}

	public static Goods getGoodsById(Goods[] shopCar, int id) {
		for (int i = 0; i < shopCar.length; i++) {
			Goods g = shopCar[i];
			if (g != null) {
				if (g.id == id) {
					return g;
				}
			} else {
				return null;
			}
		}

		return null;
	}

	public static void queryGoods(Goods[] shopCar) {
		// TODO Auto-generated method stub
		System.out.println("====查询购物车信息如下=====");
		System.out.println("编号--名称--价格--数量");
		for (int i = 0; i < shopCar.length; i++) {
			Goods g = shopCar[i];
			if (g != null) {
				System.out.println(g.id + g.name + g.price + g.buyNumber);
			} else {
				break;
			}
		}

	}

	public static void addGoods(Goods[] shopCar, Scanner sc) {
		System.out.println("请输入购买商品的编号（不重复）：");
		int id = sc.nextInt();
		System.out.println("请输入商品的名称");
		String name = sc.next();
		System.out.println("请输入商品的数量");
		int buyNumber = sc.nextInt();
		System.out.println("请输入商品的价格");
		double price = sc.nextDouble();

		Goods g = new Goods();
		g.id = id;
		g.name = name;
		g.buyNumber = buyNumber;
		g.price = price;

		for (int i = 0; i < shopCar.length; i++) {
			if (shopCar[i] == null) {
				shopCar[i] = g;
				break;

			}

		}
		System.out.println("您的商品添加完成");

	}

}
