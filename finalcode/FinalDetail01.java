package com.hsp.finalcode;

public class FinalDetail01 {

	public static void main(String[] args) {

		CC cc = new CC();

		new EE().cal();
	}
}

class AA {

	public final double TAX_RATE = 0.08;// 1.定义时赋值
	public final double TAX_RATE2;
	public final double TAX_RATE3;

	public AA() {// 构造器中赋值
		TAX_RATE2 = 1.1;
	}

	{// 在代码块赋值
		TAX_RATE3 = 8.8;
	}
}

class BB {

	public static final double TAX_RATE = 99.9;
	public static final double TAX_RATE2;

	static {
		TAX_RATE2 = 3.3;
	}

}

final class CC { // final类不能继承，但是可以实例化对象
}

//如果类不是final类，但是含有final方法，则该方法虽然不能重写，但是可以被继承
class DD {
	public final void cal() {
		System.out.println("cal()方法");
	}
}

class EE extends DD {
}
