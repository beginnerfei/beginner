package com.hsp.sethsp;

import java.util.HashSet;

public class HashSetIncrement {

	public static void main(String[] args) {

		HashSet hashSet = new HashSet();
//	        for(int i = 1; i <= 100; i++) {
//	            hashSet.add(i);//1,2,3,4,5...100
//	        }

//	        for(int i = 1; i <= 12; i++) {
//	            hashSet.add(new A(i));//
//	        }


		for (int i = 1; i <= 7; i++) {
			hashSet.add(new A(i));
		}

		for (int i = 1; i <= 7; i++) {
			hashSet.add(new B(i));
		}
	}
}

class B {
	private int n;

	public B(int n) {
		this.n = n;
	}

	@Override
	public int hashCode() {
		return 200;
	}
}

class A {
	private int n;

	public A(int n) {
		this.n = n;
	}

	@Override
	public int hashCode() {
		return 100;
	}
}
