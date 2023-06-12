package com.hsp.qqclient.service0689hsp;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

import com.hsp.qqcommon0688.Message;
import com.hsp.qqcommon0688.MessageType;

/*
 * 提供和消息相关的服务方法
 */
public class MessageClientService {
	public void sendMessageToAll(String content, String senderId) {
		// 构建message
		Message message = new Message();
		message.setMesType(MessageType.MESSAGE_TO_ALL_MES);// 群发消息这种类型
		message.setSender(senderId);
		message.setContent(content);
		message.setSendTime(new Date().toString());// 发送时间设置到message对象
		System.out.println(senderId + " 对大家说 " + content);
		// 发送给服务端

		try {
			ObjectOutputStream oos = new ObjectOutputStream(ManageClientConnectServerThread
					.getClientConnectServerThread(senderId).getSocket().getOutputStream());
			oos.writeObject(message);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/*
	 *  content内容    senderId 发送用户id   getterId 接收用户id
	 */
	public void sendMessageToOne(String content, String senderId, String getterId) {
		Message message = new Message();
		message.setMesType(MessageType.MESSAGE_COMM_MES);// 普通的聊天消息这种类型
		message.setSender(senderId);
		message.setGetter(getterId);
		message.setContent(content);
		message.setSendTime(new Date().toString());// 发送时间设置到message对象
		System.out.println(senderId + " 对 " + getterId + " 说 " + content);
		// 发送给服务端

		try {
			ObjectOutputStream oos = new ObjectOutputStream(ManageClientConnectServerThread
					.getClientConnectServerThread(senderId).getSocket().getOutputStream());
			oos.writeObject(message);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
