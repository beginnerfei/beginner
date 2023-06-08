package com.hsp.maphsp;

import java.util.HashMap;
import java.util.Map;

public class Map1 {

	    public static void main(String[] args) {
	       
	        Map map = new HashMap();
	        map.put("no1", "韩顺平");
	        map.put("no2", "张无忌");
	        map.put("no1", "张三丰");
	        map.put("no3", "张三丰");
	        map.put(null, null); 
	        map.put(null, "abc");
	        map.put("no4", null);
	        map.put("no5", null);
	        map.put(1, "赵敏");
	        map.put(new Object(), "金毛狮王");
	 
	        System.out.println(map.get("no2"));
	        System.out.println("map=" + map);



	    }
	}
