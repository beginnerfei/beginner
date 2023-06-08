package com.hsp.maphsp;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapFor {

	public static void main(String[] args) {

		Map map = new HashMap();
		map.put("邓超", "孙俪");
		map.put("王宝强", "马蓉");
		map.put("宋喆", "马蓉");
		map.put("刘令博", null);
		map.put(null, "刘亦菲");
		map.put("鹿晗", "关晓彤");

		Set keyset = map.keySet();
		System.out.println("======第一种方式======");
		for (Object key : keyset) {
			System.out.println(key + "-" + map.get(key));
		}

		System.out.println("======第二种方式======");
		Iterator iterator = keyset.iterator();
		while (iterator.hasNext()) {
			Object key = iterator.next();
			System.out.println(key + "-" + map.get(key));
		}

		Collection values = map.values();

		System.out.println("======取出所有的value 增强for======");
		for (Object value : values) {
			System.out.println(value);
		}
		System.out.println("======取出所有的value 迭代器======");
		Iterator iterator2 = values.iterator();
		while (iterator2.hasNext()) {
			Object value = iterator2.next();
			System.out.println(value);

		}

		// 第三组: 通过EntrySet 来获取 k-v
		Set entrySet = map.entrySet();// EntrySet<Map.Entry<K,V>>
		// (1) 增强for
		System.out.println("=====使用EntrySet 的 for增强(第3种)=====");
		for (Object entry : entrySet) {
			// 将entry 转成 Map.Entry
			Map.Entry m = (Map.Entry) entry;
			System.out.println(m.getKey() + "-" + m.getValue());
		}

		System.out.println("======使用EntrySet 的 迭代器(第4种)=====");
		Iterator iterator3 = entrySet.iterator();
		while (iterator3.hasNext()) {
			Object entry = iterator3.next();
			Map.Entry m = (Map.Entry) entry;
			System.out.println(m.getKey() + "-" + m.getValue());
		}

	}
}
