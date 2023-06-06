package com.hsp.homework0436hsp;

public class Homework06 {

	public static void main(String[] args) {
		Person tang = new Person("唐僧", new Horse());
		tang.common();// 一般情况下
		tang.passRiver();// 过河
		tang.common();
		tang.passRiver();
		tang.passRiver();
		tang.passRiver();
		tang.passFireHill();		// 过火焰山

	}
}
