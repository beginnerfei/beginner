package com.hsp.maphsp;

import java.util.Properties;

public class Properties1 {

	public static void main(String[] args) {

		// Properties 继承 Hashtable
		Properties properties = new Properties();
		
		properties.put("john", 100);
		properties.put("lucy", 100);
		properties.put("lic", 100);
		properties.put("lic", 88);

		System.out.println("properties=" + properties);

		// 通过k 获取对应值88
		System.out.println(properties.get("lic"));

		// 删除
		properties.remove("lic");
		System.out.println("properties=" + properties);

		// 修改
		properties.put("john", "约翰");
		System.out.println("properties=" + properties);

	}
}
