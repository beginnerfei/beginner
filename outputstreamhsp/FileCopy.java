package com.hsp.outputstreamhsp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {

		String srcFilePath = "Koala.jpg";
		String destFilePath = "Koala3.jpg";
		FileInputStream fileInputStream = null;
		FileOutputStream fileOutputStream = null;

		try {

			fileInputStream = new FileInputStream(srcFilePath);
			fileOutputStream = new FileOutputStream(destFilePath);
			byte[] buf = new byte[1024];
			int readLen = 0;
			while ((readLen = fileInputStream.read(buf)) != -1) {
				fileOutputStream.write(buf, 0, readLen);

			}
			System.out.println("拷贝ok");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fileInputStream != null) {
					fileInputStream.close();
				}
				if (fileOutputStream != null) {
					fileOutputStream.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
