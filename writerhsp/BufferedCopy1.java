package com.hsp.writerhsp;

import java.io.*;

public class BufferedCopy1 {

	public static void main(String[] args) {

		String srcFilePath = "a.java";
		String destFilePath = "a2.java";
		BufferedReader br = null;
		BufferedWriter bw = null;
		String line;
		try {
			br = new BufferedReader(new FileReader(srcFilePath));
			bw = new BufferedWriter(new FileWriter(destFilePath));

			while ((line = br.readLine()) != null) {
				bw.write(line);
				bw.newLine();
			}
			System.out.println("拷贝完毕");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) {
					br.close();
				}
				if (bw != null) {
					bw.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
