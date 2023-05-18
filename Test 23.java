package com.itheima.innerclassanonymous;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal a = new Animal() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("老虎跑的快");
			}
			
		};
		a.run();
	}

}
