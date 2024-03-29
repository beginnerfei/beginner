package com.hsp.socket0667;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;

@SuppressWarnings({ "all" })
public class SocketTCP03Client {
	public static void main(String[] args) throws IOException {

		Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
		System.out.println("客户端socket返回=" + socket.getClass());

		OutputStream outputStream = socket.getOutputStream();

		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
		bufferedWriter.write("hello, server字符流");
		bufferedWriter.newLine();// 插入一个换行符 表示写入的内容结束,注意要求对方使用readLine()!!
		bufferedWriter.flush();// 如果使用的字符流 手动刷新 否则数据不会写入数据通道

		InputStream inputStream = socket.getInputStream();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
		String s = bufferedReader.readLine();
		System.out.println(s);

		bufferedReader.close();// 关闭外层流
		bufferedWriter.close();
		socket.close();
		System.out.println("客户端退出");
	}
}
