package com.hsp.homework0436hsp;

public class Person {

	private String name;
	private Vehicles vehicles;

	public Person(String name, Vehicles vehicles) {
		this.name = name;
		this.vehicles = vehicles;
	}

	public void passRiver() {
		// 判断 当前的 vehicles 属性是null 就获取一艘船
		// Boat boat = VehiclesFactory.getBoat();
		// boat.work();
		// 防止始终使用的是传入的马 instanceOf
		// if (vehicles == null) {
		// vehicles instanceof Boat 是判断 当前的 vehicles是不是Boat
		// (1) vehicles = null : vehicles instanceof Boat => false
		// (2) vehicles = 马对象 ：vehicles instanceof Boat => false
		// (3) vehicles = 船对象 ：vehicles instanceof Boat => true
		if (!(vehicles instanceof Boat)) {
			vehicles = VehiclesFactory.getBoat();
		}
		vehicles.work();
	}

	public void common() {
		// 得到马儿
		// 判断一下，当前的 vehicles 属性是null, 就获取一匹马
		// if (vehicles == null) {
		if (!(vehicles instanceof Horse)) {
			// 这里使用的是多态
			vehicles = VehiclesFactory.getHorse();
		}
		// 这里体现使用接口调用
		vehicles.work();
	}

	public void passFireHill() {	// 过火焰山
		if (!(vehicles instanceof Plane)) {
			vehicles = VehiclesFactory.getPlane();
		}
		vehicles.work();

	}
}

// 有Person类 有name和Vehicles属性 在构造器中为两个属性赋值
