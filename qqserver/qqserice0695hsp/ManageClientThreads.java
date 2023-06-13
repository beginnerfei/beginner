package com.hsp.qqserver.qqserice0695hsp;

import java.util.HashMap;
import java.util.Iterator;

/*
 * 管理和客户端通信的线程
 */
public class ManageClientThreads {

	private static HashMap<String, ServerConnectClientThread> hm = new HashMap<>();

	public static HashMap<String, ServerConnectClientThread> getHm() {
		return hm;
	}

	public static void addClientThread(String userId, ServerConnectClientThread serverConnectClientThread) {

		hm.put(userId, serverConnectClientThread);	// 添加线程对象到 hm 集合

	}

	// 根据userId 返回ServerConnectClientThread线程
	public static ServerConnectClientThread getServerConnectClientThread(String userId) {
		return hm.get(userId);
	}

	// 增加一个方法 从集合中移除某个线程对象
	public static void removeServerConnectClientThread(String userId) {
		hm.remove(userId);
	}

	// 编写方法，可以返回在线用户列表
	public static String getOnlineUser() {
		// 集合遍历 ，遍历 hashmap的key
		Iterator<String> iterator = hm.keySet().iterator();
		String onlineUserList = "";
		while (iterator.hasNext()) {
			onlineUserList += iterator.next().toString() + " ";
		}
		return onlineUserList;
	}
}
