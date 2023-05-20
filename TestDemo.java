package com.itheima.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Collection<Movie> movies = new ArrayList<>();
		movies.add(new Movie("《你好，李焕英》", 9.5, "张小斐,贾玲,沈腾,陈赫"));
		movies.add(new Movie("《唐人街探案》", 8.5, "王宝强,刘昊然,美女"));
		movies.add(new Movie("《刺杀小说家》", 8.6, "雷佳音,杨幂"));

		System.out.println(movies);
		for (Movie movie : movies) {  //遍历集合中的每一个对象
			System.out.println("片名：" + movie.getName());
			System.out.println("得分：" + movie.getScore());
			System.out.println("主演：" + movie.getActor());
		}

	}

}
