package com.hsp.homework0769hsp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

@SuppressWarnings({ "all" })
public class Homework01Server {
	public static void main(String[] args) throws IOException {
		
		ServerSocket serverSocket = new ServerSocket(9999);//通过 accept() 返回多个Socket[多个客户端连接服务器的并发]
		System.out.println("服务端9999端口监听 等待连接");

		Socket socket = serverSocket.accept();
		InputStream inputStream = socket.getInputStream();//读取客户端写入到数据通道的数据
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
		String s = bufferedReader.readLine();
		String answer = "";
		if ("name".equals(s)) {
			answer = "韩顺平";
		} else if ("hobby".equals(s)) {
			answer = "编写java程序";
		} else {
			answer = "你说的啥";
		}
		OutputStream outputStream = socket.getOutputStream();
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
		bufferedWriter.write(answer);
		bufferedWriter.newLine();// 插入换行符 表示回复内容结束
		bufferedWriter.flush();// 注意需要手动flush

		bufferedWriter.close();
		bufferedReader.close();
		socket.close();
		serverSocket.close();

	}
}
