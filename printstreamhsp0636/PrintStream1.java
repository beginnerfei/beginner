package com.hsp.printstreamhsp0636;

import java.io.IOException;
import java.io.PrintStream;

public class PrintStream1 {

	public static void main(String[] args) throws IOException {

		PrintStream out = System.out;

		out.print("john, hello");
		out.write("韩顺平,你好".getBytes());
		out.close();

		// 我们可以去修改打印流输出的位置/设备
		// 1. 输出修改成到 "e:\\f1.txt"
		// 2. "hello, 韩顺平教育~" 就会输出到 e:\f1.txt
		// 3. public static void setOut(PrintStream out) {
		// checkIO();
		// setOut0(out); // native 方法，修改了out
		// }
		System.setOut(new PrintStream("e:\\f1.txt"));
		System.out.println("hello, 韩顺平");

	}
}
