package com.hsp.qqclient.service0689hsp;

import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.net.Socket;

import com.hsp.qqcommon0688.Message;
import com.hsp.qqcommon0688.MessageType;

public class ClientConnectServerThread extends Thread {

	private Socket socket;// 该线程需要持有Socket

	public ClientConnectServerThread(Socket socket) {// 构造器可以接受一个Socket对象
		this.socket = socket;
	}

	@Override
	public void run() {
		while (true) {
			try {
				System.out.println("客户端线程，等待从读取从服务器端发送的消息");
				ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());

				Message message = (Message) ois.readObject();// 如果服务器没有发送Message对象,线程会阻塞

				if (message.getMesType().equals(MessageType.MESSAGE_RET_ONLINE_FRIEND)) {
					String[] onlineUsers = message.getContent().split(" ");// 取出在线列表信息，并显示
					System.out.println("\n=======当前在线用户列表========");
					for (int i = 0; i < onlineUsers.length; i++) {
						System.out.println("用户: " + onlineUsers[i]);
					}

				} else if (message.getMesType().equals(MessageType.MESSAGE_COMM_MES)) {// 普通的聊天消息
					System.out.println(
					// 把从服务器转发的消息，显示到控制台
							"\n" + message.getSender() + " 对 " + message.getGetter() + " 说: " + message.getContent());
				} else if (message.getMesType().equals(MessageType.MESSAGE_TO_ALL_MES)) {
					// 显示在客户端的控制台
					System.out.println("\n" + message.getSender() + " 对大家说: " + message.getContent());
				} else if (message.getMesType().equals(MessageType.MESSAGE_FILE_MES)) {// 如果是文件消息
					// 让用户指定保存路径
					System.out.println("\n" + message.getSender() + " 给 " + message.getGetter() + " 发文件: "
							+ message.getSrc() + " 到我的电脑的目录 " + message.getDest());

					// 取出message的文件字节数组，通过文件输出流写出到磁盘
					FileOutputStream fileOutputStream = new FileOutputStream(message.getDest(), true);
					fileOutputStream.write(message.getFileBytes());
					fileOutputStream.close();
					System.out.println("\n 保存文件成功");

				} else {
					System.out.println("是其他类型的message, 暂时不处理");
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

	public Socket getSocket() {   // 为了更方便的得到Socket
		return socket;
	}
}
