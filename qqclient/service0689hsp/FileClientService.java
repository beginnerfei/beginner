package com.hsp.qqclient.service0689hsp;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.hsp.qqcommon0688.Message;
import com.hsp.qqcommon0688.MessageType;

/*
 * 文件传输服务
 */
public class FileClientService {

	public void sendFileToOne(String src, String dest, String senderId, String getterId) {

		Message message = new Message(); // 读取src文件 --> message
		message.setMesType(MessageType.MESSAGE_FILE_MES);
		message.setSender(senderId);
		message.setGetter(getterId);
		message.setSrc(src);
		message.setDest(dest);

		FileInputStream fileInputStream = null; // 需要将文件读取
		byte[] fileBytes = new byte[(int) new File(src).length()];

		try {
			fileInputStream = new FileInputStream(src);
			fileInputStream.read(fileBytes); // 将src文件读入到程序的字节数组
			message.setFileBytes(fileBytes); // 将文件对应的字节数组设置message
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fileInputStream != null) { // 关闭
				try {
					fileInputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		System.out.println("\n" + senderId + " 给 " + getterId + " 发送文件: " + src + " 到对方的电脑的目录 " + dest);
		// 发送 提示信息
		try {
			ObjectOutputStream oos = new ObjectOutputStream(ManageClientConnectServerThread
					.getClientConnectServerThread(senderId).getSocket().getOutputStream());
			oos.writeObject(message);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
