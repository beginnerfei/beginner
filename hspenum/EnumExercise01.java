package com.hsp.hspenum;

public class EnumExercise01 {
	public static void main(String[] args) {
		Gender2 boy = Gender2.BOY;  
		Gender2 boy2 = Gender2.BOY; 
		System.out.println(boy);// BOY 本质就是调用 Gender2 的父类Enum的 toString()
//	        public String toString() {
//	            return name;
//	        }
		System.out.println(boy2 == boy); // true
	}
}

enum Gender2 { // 父类 Enum 的toString
	BOY, GIRL;
}
