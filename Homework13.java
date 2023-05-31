package com.hsp.thiscode;

public class Homework13 {
	public static void main(String[] args) {

		Circlee c = new Circlee();
		PassObject po = new PassObject();
		po.printAreas(c, 5);
	}
}

class Circlee {
	double radius;

	public Circlee() {

	}

	public Circlee(double radius) {
		this.radius = radius;
	}

	public double findArea() {
		return Math.PI * radius * radius; // 返回面积
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
}

class PassObject {
	public void printAreas(Circlee c, int times) {
		System.out.println("radius\tarea");
		for (int i = 1; i <= times; i++) {
			c.setRadius(i);
			System.out.println((double) i + "\t" + c.findArea());
		}
	}
}
