package com.hsp.polyparameter;

public class PloyParameter {

	public static void main(String[] args) {
		Worker tom = new Worker("tom", 2500);
		Manager milan = new Manager("milan", 5000, 200000);
		PloyParameter ployParameter = new PloyParameter();
		ployParameter.showEmpAnnual(tom);
		ployParameter.showEmpAnnual(milan);

		ployParameter.testWork(tom);
		ployParameter.testWork(milan);

	}

	public void showEmpAnnual(Employee e) {
		System.out.println(e.getAnnual());// 动态绑定机制.
	}

	public void testWork(Employee e) {
		if (e instanceof Worker) {
			((Worker) e).work();   // 有向下转型
		} else if (e instanceof Manager) {
			((Manager) e).manage();// 有向下转型
		} else {
			System.out.println("不做处理...");
		}
	}
}
