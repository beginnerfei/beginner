package com.hsp.socket0667;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

@SuppressWarnings({ "all" })
public class SocketTCP02Client {
	public static void main(String[] args) throws IOException {

		Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
		System.out.println("客户端 socket返回=" + socket.getClass());
		//  连接上生成Socket 通过socket.getOutputStream()
		// 得到和 socket对象关联的输出流对象
		OutputStream outputStream = socket.getOutputStream();
		//  通过输出流写入数据到数据通道
		outputStream.write("hello, server".getBytes());
		socket.shutdownOutput();// 设置结束标记

		InputStream inputStream = socket.getInputStream();
		byte[] buf = new byte[1024];
		int readLen = 0;
		while ((readLen = inputStream.read(buf)) != -1) {
			System.out.println(new String(buf, 0, readLen));
		}
		
		inputStream.close();
		outputStream.close();
		socket.close();
		System.out.println("客户端退出");
	}
}
