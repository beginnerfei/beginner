package com.hsp.bignumhsp;

import java.math.BigDecimal;

public class BigDecimal1 {
	public static void main(String[] args) {
		
//        double d = 1999.11111111111999999999999977788d;
//        System.out.println(d);
		BigDecimal bigDecimal = new BigDecimal("1999.11");
		BigDecimal bigDecimal2 = new BigDecimal("3");
		System.out.println(bigDecimal);

		System.out.println(bigDecimal.add(bigDecimal2));
		System.out.println(bigDecimal.subtract(bigDecimal2));
		System.out.println(bigDecimal.multiply(bigDecimal2));
		System.out.println(bigDecimal.divide(bigDecimal2, BigDecimal.ROUND_CEILING));
	}
}
