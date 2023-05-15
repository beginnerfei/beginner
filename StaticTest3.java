package com.itheima.staticcodekuai;

import java.util.ArrayList;
import java.util.Iterator;

public class StaticTest3 {
	
	public static ArrayList<String> cards= new ArrayList<>();
	
	
	static {
		String[] sizes= {"3","4","5","6","7","8","9","10","J","Q","K","A"};
		
		String[] colors= {"♠️","♥️","♦️","♣️"};
		
		for (int i = 0; i < sizes.length; i++) {
			for (int j = 0; j < colors.length; j++) {
				String card = sizes[i]+colors[j];
				cards.add(card);
			}
		}
		//单独加入大小王
		cards.add("🃏");
		cards.add("大王");
	}
	public static void main(String[] args) {
		System.out.println(cards);
	
		
		
	}

}
