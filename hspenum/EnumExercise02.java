package com.hsp.hspenum;

public class EnumExercise02 {

	public static void main(String[] args) {
		
		Week[] weeks = Week.values();
		// 遍历，使用增强for循环
		System.out.println("======所有星期的信息如下======");
		for (Week week : weeks) {
			System.out.println(week);
		}
	}
}

enum Week {
	// 定义Week的枚举对象
	MONDAY("星期一"), TUESDAY("星期二"), WEDNESDAY("星期三"), THURSDAY("星期四"), FRIDAY("星期五"), SATURDAY("星期六"), SUNDAY("星期日");

	private String name;

	private Week(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}
