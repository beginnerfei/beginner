package com.hsp.api0666;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class API_ {

	public static void main(String[] args) throws UnknownHostException {

		InetAddress localHost = InetAddress.getLocalHost();
		System.out.println(localHost);

		InetAddress host1 = InetAddress.getByName("DESKTOP-S4MP84S");
		System.out.println("host1=" + host1);

		InetAddress host2 = InetAddress.getByName("www.baidu.com");
		System.out.println("host2=" + host2);

		String hostAddress = host2.getHostAddress();
		System.out.println("host2 对应的ip = " + hostAddress);

		String hostName = host2.getHostName();
		System.out.println("host2对应的主机名/域名=" + hostName);

	}
}
