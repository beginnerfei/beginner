package com.itheima.arraylist;

import java.util.ArrayList;

public class ArrayListDemo5 {
	public static void main(String[] args) {
		Movie m1 = new Movie(9.7,"《肖申克的救赎》","罗宾斯");
		Movie m2 = new Movie(9.7,"《霸王别姬》","张国荣、张丰毅");
		Movie m3 = new Movie(9.5,"《阿甘正传》","汤姆。汉克斯");
		
		ArrayList<Movie> movies = new ArrayList();
		movies.add(m1);
		movies.add(m2);
		movies.add(m3);
	System.out.println(movies);
	for (int i = 0; i < movies.size(); i++) {
		Movie m = movies.get(i);
		System.out.println("电影名称"+m.getName());
		System.out.println("电影得分"+m.getScore());
		System.out.println("电影主演"+m.getActor());
	};
		
	}

}
