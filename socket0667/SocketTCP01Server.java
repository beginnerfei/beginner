package com.hsp.socket0667;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketTCP01Server {
	public static void main(String[] args) throws IOException {

		ServerSocket serverSocket = new ServerSocket(9999);
		System.out.println("服务端 在9999端口监听 等待连接");

		Socket socket = serverSocket.accept();
		System.out.println("服务端socket =" + socket.getClass());

		InputStream inputStream = socket.getInputStream();

		byte[] buf = new byte[1024];
		int readLen = 0;
		while ((readLen = inputStream.read(buf)) != -1) {
			System.out.println(new String(buf, 0, readLen));// 根据读取到的实际长度 显示内容
		}

		inputStream.close();
		socket.close();
		serverSocket.close();// 关闭

	}
}
