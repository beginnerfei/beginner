package com.hsp.filehsp;

import org.junit.jupiter.api.Test;
import java.io.*;

public class FileCreate {
	public static void main(String[] args) {

	}

	@Test
	public void create01() {
		String filePath = "news1.txt";//mac系统会创建在当前目录
		File file = new File(filePath);

		try {
			file.createNewFile();
			System.out.println("文件创建成功");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Test
	public void create02() {
		File parentFile = new File("e:\\");
		String fileName = "news2.txt";
		File file = new File(parentFile, fileName);

		try {
			file.createNewFile();
			System.out.println("创建成功");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void create03() {
		// String parentPath = "e:\\";
		String parentPath = "e:\\";
		String fileName = "news4.txt";
		File file = new File(parentPath, fileName);

		try {
			file.createNewFile();
			System.out.println("创建成功");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
