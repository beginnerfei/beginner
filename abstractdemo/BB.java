package com.hsp.abstractdemo;

public class BB extends Template{

	public void job() {

		long num = 0;
		for (long i = 1; i <= 80000; i++) {
			num *= i;
		}
	}
}
