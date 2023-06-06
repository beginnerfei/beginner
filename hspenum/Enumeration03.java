package com.hsp.hspenum;

public class Enumeration03 {

	public static void main(String[] args) {
		System.out.println(Season2.AUTUMN);
		System.out.println(Season2.SUMMER);
	}
}

enum Season2 {//使用关键字 enum 替代 class

	// 定义了四个对象, 固定
//    public static final Season SPRING = new Season("春天", "温暖");
//    public static final Season WINTER = new Season("冬天", "寒冷");
//    public static final Season AUTUMN = new Season("秋天", "凉爽");
//    public static final Season SUMMER = new Season("夏天", "炎热");

	SPRING("春天", "温暖"), WINTER("冬天", "寒冷"), AUTUMN("秋天", "凉爽"), SUMMER("夏天", "炎热")/* , What() */;

	private String name;
	private String desc;

	private Season2() {

	}

	private Season2(String name, String desc) {
		this.name = name;
		this.desc = desc;
	}

	public String getName() {
		return name;
	}

	public String getDesc() {
		return desc;
	}

	@Override
	public String toString() {
		return "Season{" + "name='" + name + '\'' + ", desc='" + desc + '\'' + '}';
	}
}
