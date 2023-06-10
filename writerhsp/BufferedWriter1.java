package com.hsp.writerhsp;

import java.io.BufferedWriter;

import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter1 {
	public static void main(String[] args) throws IOException {
		String filePath = "ok.txt";
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath));
		bufferedWriter.write("hello, 韩顺平!");
		bufferedWriter.newLine();
		bufferedWriter.write("hello2, 韩顺平!");
		bufferedWriter.newLine();
		bufferedWriter.write("hello3, 韩顺平!");
		bufferedWriter.newLine();

		bufferedWriter.close();

	}
}
