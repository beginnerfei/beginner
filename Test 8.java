package com.itheima.demoo;

import java.util.Iterator;

public class Test {
	public static void main(String[] args) {
		//
		
		
		Movie[]movies = new Movie [3]; 
		movies[0]= new Movie("《长津湖》",9.7,"吴京");
		movies[1]= new Movie("《我和我的父亲》",9.6,"吴京");
		movies[2]= new Movie("《扑水少年》",9.5,"王川");
		
		
		for (int i = 0; i < movies.length; i++) {
			Movie m = movies[i];
			System.out.println("电影名"+m.getName());
			System.out.println("得分"+m.getScore());
			System.out.println("主演"+m.getActor());
		}
	}

}
