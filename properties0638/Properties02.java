package com.hsp.properties0638;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Properties02 {

	public static void main(String[] args) throws IOException {
		
		Properties properties = new Properties();

		properties.load(new FileReader("mysql.properties"));
		properties.list(System.out);

		String user = properties.getProperty("user");
		String pwd = properties.getProperty("pwd");
		System.out.println("用户名=" + user);
		System.out.println("密码是=" + pwd);

	}
}
