package com.hsp.equals;

public class ToString {

	public static void main(String[] args) {


		Monster monster = new Monster("小妖怪", "巡山的", 1000);
		System.out.println(monster.toString() + " hashcode=" + monster.hashCode());

		System.out.println("====当直接输出一个对象时，toString 方法会被默认的调用====");
		System.out.println(monster); // 等价 monster.toString()

	}
}

class Monster {
	private String name;
	private String job;
	private double sal;

	public Monster(String name, String job, double sal) {
		this.name = name;
		this.job = job;
		this.sal = sal;
	}

	@Override
	public String toString() { // 重写后，一般是把对象的属性值输出
		return "Monster{" + "name='" + name + '\'' + ", job='" + job + '\'' + ", sal=" + sal + '}';
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("fin..");
	}
}
