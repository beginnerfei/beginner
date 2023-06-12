package com.hsp.qqclient.service0689hsp;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;

import com.hsp.qqcommon0688.Message;
import com.hsp.qqcommon0688.MessageType;
import com.hsp.qqcommon0688.User;

/*
 * 完成用户登录验证和用户注册等功能
 */
public class UserClientService {

	private User u = new User(null, null);
	private Socket socket;

	public boolean checkUser(String userId, String pwd) {
		boolean b = false;

		u.setUserId(userId);// 创建User对象
		u.setPasswd(pwd);

		try {
			// 连接到服务端 发送u对象
			socket = new Socket(InetAddress.getByName("127.0.0.1"), 9999);

			ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
			oos.writeObject(u);// 得到ObjectOutputStream对象 发送User对象

			ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
			Message ms = (Message) ois.readObject();// 读取

			if (ms.getMesType().equals(MessageType.MESSAGE_LOGIN_SUCCEED)) {// 登录

				// 创建一个和服务器端保持通信的线程-> 创建一个类 ClientConnectServerThread
				ClientConnectServerThread clientConnectServerThread = new ClientConnectServerThread(socket);
				// 启动客户端的线程
				clientConnectServerThread.start();
				// 这里为了后面客户端的扩展，我们将线程放入到集合管理
				ManageClientConnectServerThread.addClientConnectServerThread(userId, clientConnectServerThread);
				b = true;
			} else {
				socket.close();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return b;

	}

	// 向服务器端请求在线用户列表
	public void onlineFriendList() {

		// 发送一个Message  类型MESSAGE_GET_ONLINE_FRIEND
		Message message = new Message();
		message.setMesType(MessageType.MESSAGE_GET_ONLINE_FRIEND);
		message.setSender(u.getUserId());

		// 发送给服务器

		try {
			// 从管理线程的集合中，通过userId, 得到这个线程对象
			ClientConnectServerThread clientConnectServerThread = ManageClientConnectServerThread
					.getClientConnectServerThread(u.getUserId());
			// 通过这个线程得到关联的socket
			Socket socket = clientConnectServerThread.getSocket();
			// 得到当前线程的Socket 对应的 ObjectOutputStream对象
			ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
			oos.writeObject(message); // 发送一个Message对象，向服务端要求在线用户列表
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// 编写方法 退出客户端 并给服务端发送一个退出系统的message对象
	public void logout() {
		Message message = new Message();
		message.setMesType(MessageType.MESSAGE_CLIENT_EXIT);
		message.setSender(u.getUserId());// 一定要指定是哪个客户端id

		// 发送message
		try {
			// ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
			ObjectOutputStream oos = new ObjectOutputStream(ManageClientConnectServerThread
					.getClientConnectServerThread(u.getUserId()).getSocket().getOutputStream());
			oos.writeObject(message);
			System.out.println(u.getUserId() + " 退出系统 ");
			System.exit(0);// 结束进程
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
