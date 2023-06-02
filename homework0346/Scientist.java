package com.hsp.homework0346;

public class Scientist extends Employee {

	private double bonus;

	public Scientist(String name, double sal) {
		super(name, sal);
	}

	@Override
	public void printSal() {
		System.out.print("科学家 ");
		System.out.println(getName() + " 年工资是: " + (getSal() * getSalMonth() + bonus));
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
}
