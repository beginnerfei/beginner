package com.hsp.customgenerichsp;

import java.util.Arrays;

public class CustomGeneric {
	public static void main(String[] args) {

		Tiger<Double, String, Integer> g = new Tiger<>("john");
		g.setT(10.9); 
		// g.setT("yy"); //错误，类型不对
		System.out.println(g);
		Tiger g2 = new Tiger("john~~");
		g2.setT("yy"); 
		System.out.println("g2=" + g2);

	}
}
class Tiger<T, R, M> {
	String name;
	R r; // 属性使用到泛型
	M m;
	T t;

	T[] ts;

	public Tiger(String name) {
		this.name = name;
	}

	public Tiger(R r, M m, T t) {

		this.r = r;
		this.m = m;
		this.t = t;
	}

	public Tiger(String name, R r, M m, T t) {
		this.name = name;
		this.r = r;
		this.m = m;
		this.t = t;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public R getR() {
		return r;
	}

	public void setR(R r) {
		this.r = r;
	}

	public M getM() {
		return m;
	}

	public void setM(M m) {
		this.m = m;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	@Override
	public String toString() {
		return "Tiger{" + "name='" + name + '\'' + ", r=" + r + ", m=" + m + ", t=" + t + ", ts=" + Arrays.toString(ts)
				+ '}';
	}
}
