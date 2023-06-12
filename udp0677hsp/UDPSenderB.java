package com.hsp.udp0677hsp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

@SuppressWarnings({ "all" })
public class UDPSenderB {
	public static void main(String[] args) throws IOException {

		DatagramSocket socket = new DatagramSocket(9998);
		byte[] data = "hello 明天吃大便".getBytes(); 
		//  封装的 DatagramPacket对象 data 内容字节数组  data.length 主机(IP) 端口
		DatagramPacket packet = new DatagramPacket(data, data.length, InetAddress.getByName("192.168.12.1"), 9999);

		socket.send(packet);
		
		byte[] buf = new byte[1024];// 接收从A端回复的信息
		packet = new DatagramPacket(buf, buf.length);

		socket.receive(packet);//接受数据

		int length = packet.getLength();
		data = packet.getData();
		String s = new String(data, 0, length);
		System.out.println(s);	// packet拆包 取出数据

		socket.close();
		System.out.println("B端退出");
	}
}
