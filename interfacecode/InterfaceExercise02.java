package com.hsp.interfacecode;

public class InterfaceExercise02 {

	public static void main(String[] args) {

	}
}

interface A {
	int x = 0; // public static final int x = 0;
}

class B {
	int x = 1;
}

class C extends B implements A {
	public void pX() {

		System.out.println(A.x + " " + super.x);
	}

	public static void main(String[] args) {
		new C().pX();
	}
}
