package com.itheima.innerclass;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Outer.Inner in = new Outer().new Inner();
		
		in.setName("内部");
		in.show();
		
		Outer.Inner.test();//访问静态成员方法
		
		
		Outer.Inner in1 = new Outer("爱听课").new Inner();
	}

}
