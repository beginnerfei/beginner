package com.hsp.migong;

public class VarParameter01 {

	public static void main(String[] args) {

		HspMethod m = new HspMethod();
		System.out.println(m.sum(1, 5, 100));
		System.out.println(m.sum(1, 19));
	}
}

class HspMethod {

	public int sum(int... nums) {

		int res = 0;
		for (int i = 0; i < nums.length; i++) {
			res += nums[i];
		}
		return res;
	}
}
