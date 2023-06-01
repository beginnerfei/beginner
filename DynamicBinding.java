package com.hsp.poly1;

public class DynamicBinding {

	public static void main(String[] args) {
		// a 的编译类型 A, 运行类型 B
		AA a = new BB();// 向上转型
		System.out.println(a.sum());// ?40 -> 30
		System.out.println(a.sum1());// ?30-> 20
	}
}

class AA {
	public int i = 10;
	// 动态绑定机制:

	public int sum() {
		return getI() + 10;// 20 + 10
	}

	public int sum1() {
		return i + 10;// 10 + 10
	}

	public int getI() {
		return i;
	}
}

class BB extends AA {
	public int i = 20;

//    public int sum() {
//        return i + 20;
//    }

	public int getI() {
		return i;
	}

//    public int sum1() {
//        return i + 10;
//    }
}
