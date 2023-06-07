package com.hsp.stringbufferhsp;

public class StringAndStringBuffer {

	public static void main(String[] args) {

		String str = "hello tom";

		StringBuffer stringBuffer = new StringBuffer(str);
		StringBuffer stringBuffer1 = new StringBuffer();
		
		stringBuffer1 = stringBuffer1.append(str);

		StringBuffer stringBuffer3 = new StringBuffer("韩顺平");

		String s = stringBuffer3.toString();
		String s1 = new String(stringBuffer3);

	}
}
