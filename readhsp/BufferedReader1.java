package com.hsp.readhsp;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReader1 {
	public static void main(String[] args) throws Exception {

		String filePath = "e:\\a.java";
		BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));

		String line;
		while ((line = bufferedReader.readLine()) != null) {
			System.out.println(line);
		}
		bufferedReader.close();

	}
}
