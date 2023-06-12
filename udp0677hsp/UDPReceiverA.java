package com.hsp.udp0677hsp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPReceiverA {
	public static void main(String[] args) throws IOException {
		
		DatagramSocket socket = new DatagramSocket(9999);//创建DatagramSocket 在9999接收数据

		byte[] buf = new byte[1024];
		DatagramPacket packet = new DatagramPacket(buf, buf.length);//接收数据

		System.out.println("接收端A 等待接收数据");
		socket.receive(packet);

		int length = packet.getLength();// 实际接收到的数据字节长度
		byte[] data = packet.getData();// 接收到数据
		String s = new String(data, 0, length);
		System.out.println(s);

		data = "好的, 明天见".getBytes();

		packet = new DatagramPacket(data, data.length, InetAddress.getByName("192.168.12.1"), 9998);

		socket.send(packet);
		socket.close();
		System.out.println("A端退出");

	}
}
