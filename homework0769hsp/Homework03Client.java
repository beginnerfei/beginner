package com.hsp.homework0769hsp;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

import com.hsp.upload.StreamUtils;

public class Homework03Client {

	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(System.in);
		System.out.println("输入下载文件名");
		String downloadFileName = scanner.next();

		Socket socket = new Socket(InetAddress.getLocalHost(), 9999);//  客户端连接服务端
		OutputStream outputStream = socket.getOutputStream();
		outputStream.write(downloadFileName.getBytes());
		socket.shutdownOutput();

		BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
		byte[] bytes = StreamUtils.streamToByteArray(bis);
	
		String filePath = "\\" + downloadFileName + ".mp3";
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filePath));
		bos.write(bytes);

		bos.close();
		bis.close();
		outputStream.close();
		socket.close();

		System.out.println("客户端下载完毕，正确退出");

	}
}
