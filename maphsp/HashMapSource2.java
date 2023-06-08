package com.hsp.maphsp;

import java.util.HashMap;

public class HashMapSource2 {

	public static void main(String[] args) {

		HashMap hashMap = new HashMap();
		
		for (int i = 1; i <= 12; i++) {
			hashMap.put(i, "hello");
		}

		hashMap.put("aaa", "bbb");

		System.out.println("hashMap=" + hashMap);

	}
}
