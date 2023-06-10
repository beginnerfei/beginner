package com.hsp.printwriter0637;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriter1 {
	public static void main(String[] args) throws IOException {

		// PrintWriter printWriter = new PrintWriter(System.out);
		PrintWriter printWriter = new PrintWriter(new FileWriter("f2.txt"));
		printWriter.print("hi, 北京你好");
		printWriter.close();
	}
}
