package com.hsp.socket0667;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

@SuppressWarnings({ "all" })
public class SocketTCP02Server {
	public static void main(String[] args) throws IOException {

		ServerSocket serverSocket = new ServerSocket(9999);
		System.out.println("服务端在9999端口监听 等待连接");
	
		Socket socket = serverSocket.accept();
		System.out.println("服务端socket =" + socket.getClass());
		
		InputStream inputStream = socket.getInputStream();//读取客户端写入到数据通道的数据
		
		byte[] buf = new byte[1024];
		int readLen = 0;//  IO读取
		while ((readLen = inputStream.read(buf)) != -1) {
			System.out.println(new String(buf, 0, readLen));// 根据读取到的实际长度显示内容
		}
	
		OutputStream outputStream = socket.getOutputStream();
		outputStream.write("hello, client".getBytes());//获取socket相关联的输出流
		
		socket.shutdownOutput();// 设置结束标记

		outputStream.close();// 关闭
		inputStream.close();
		socket.close();
		serverSocket.close();

	}
}
