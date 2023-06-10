package com.hsp.filehsp;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
 
public class Directory1 {
	public static void main(String[] args) {

	}

	@Test
	public void m1() {

		String filePath = "news1.txt";
		File file = new File(filePath);
		if (file.exists()) {
			if (file.delete()) {
				System.out.println(filePath + "删除成功");
			} else {
				System.out.println(filePath + "删除失败");
			}
		} else {
			System.out.println("该文件不存在");
		}

	}

	@Test
	public void m2() {

		String filePath = "D:\\demo02";
		File file = new File(filePath);
		if (file.exists()) {
			if (file.delete()) {
				System.out.println(filePath + "删除成功");
			} else {
				System.out.println(filePath + "删除失败");
			}
		} else {
			System.out.println("该目录不存在...");
		}

	}

	@Test
	public void m3() {

		String directoryPath = "demo\\a\\b\\c";
		File file = new File(directoryPath);
		if (file.exists()) {
			System.out.println(directoryPath + "存在");
		} else {
			if (file.mkdirs()) { // 创建一级目录使用mkdir() ，创建多级目录使用mkdirs()
				System.out.println(directoryPath + "创建成功");
			} else {
				System.out.println(directoryPath + "创建失败");
			}
		}

	}
}
