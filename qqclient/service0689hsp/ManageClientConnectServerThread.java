package com.hsp.qqclient.service0689hsp;

import java.util.HashMap;

/*
 * 管理客户端 连接到服务器端的线程 
 */
public class ManageClientConnectServerThread {

	private static HashMap<String, ClientConnectServerThread> hm = new HashMap<>();

	// 将某个线程加入到集合
	public static void addClientConnectServerThread(String userId,
			ClientConnectServerThread clientConnectServerThread) {
		hm.put(userId, clientConnectServerThread);
	}

	// 通过userId 可以得到对应线程
	public static ClientConnectServerThread getClientConnectServerThread(String userId) {
		return hm.get(userId);
	}

}
