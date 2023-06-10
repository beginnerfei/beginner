package com.hsp.outputstreamhsp;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream1 {
	public static void main(String[] args) {

	}

	@Test
	public void writeFile() {

		String filePath = "a.txt";
		FileOutputStream fileOutputStream = null;
		try {
			// 得到 FileOutputStream对象
			// new FileOutputStream(filePath) 创建方式，当写入内容是，会覆盖原来的内容
			// new FileOutputStream(filePath, true) 创建方式，当写入内容是，是追加到文件后面
			fileOutputStream = new FileOutputStream(filePath, true);
			// fileOutputStream.write('H');// 写入一个字节
			String str = "hsp,world!";// 写入字符串
			// str.getBytes() 可以把 字符串-> 字节数组
			// fileOutputStream.write(str.getBytes());
			/*
			 * write(byte[] b, int off, int len) 将 len字节从位于偏移量 off的指定字节数组写入此文件输出流
			 */
			fileOutputStream.write(str.getBytes(), 0, 3);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fileOutputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
