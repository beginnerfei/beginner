package com.hsp.innerclass;

public class InnerClassExercise01 {

	public static void main(String[] args) {

		f1(new IL() {  	// 当做实参直接传递 简洁高效
			@Override
			public void show() {
				System.out.println("这是一副名画~~");
			}
		});
	
		f1(new Picture());

	}

	public static void f1(IL il) { 	// 静态方法 形参是接口类型
		il.show();
	}
}


interface IL {
	void show();
}

class Picture implements IL {

	@Override
	public void show() {
		System.out.println("这是一副名画XX");
	}
}
