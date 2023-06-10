package com.hsp.readhsp;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FileReader1 {
	public static void main(String[] args) {

	}

	@Test
	public void readFile01() {
		String filePath = "story.txt";
		FileReader fileReader = null;
		int data = 0;
		try {
			fileReader = new FileReader(filePath);
			while ((data = fileReader.read()) != -1) {
				System.out.print((char) data);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fileReader != null) {
					fileReader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	@Test
	public void readFile02() {
		System.out.println("~~~readFile02 ~~~");
		String filePath = "story.txt";
		FileReader fileReader = null;

		int readLen = 0;
		char[] buf = new char[8];
		try {
			fileReader = new FileReader(filePath);
			while ((readLen = fileReader.read(buf)) != -1) {
				System.out.print(new String(buf, 0, readLen));
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fileReader != null) {
					fileReader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
