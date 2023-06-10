package com.hsp.outputstreamhsp;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedCopy2 {

	public static void main(String[] args) {
		String srcFilePath = "a.java";
		String destFilePath = "a3.java";

		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;

		try {
			bis = new BufferedInputStream(new FileInputStream(srcFilePath));
			bos = new BufferedOutputStream(new FileOutputStream(destFilePath));

			byte[] buff = new byte[1024];
			int readLen = 0;
			while ((readLen = bis.read(buff)) != -1) {
				bos.write(buff, 0, readLen);
			}

			System.out.println("文件拷贝完毕");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bis != null) {
					bis.close();
				}
				if (bos != null) {
					bos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}
}
