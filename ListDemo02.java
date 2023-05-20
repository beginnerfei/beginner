package com.itheima.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//四种遍历方式
		List<String> lists = new ArrayList<>();
        lists.add("java1");
        lists.add("java2");
        lists.add("java3");

        // for循环
        System.out.println("-----------------------");

        for (int i = 0; i < lists.size(); i++) {
            String ele = lists.get(i);
            System.out.println(ele);
        }


        //迭代器
        System.out.println("------------");
        Iterator<String> it = lists.iterator();
        while (it.hasNext()){
            String ele = it.next();
            System.out.println(ele);
        }

        //foreach  增强for循环
        System.out.println("------------");
        for (String ele : lists) {
            System.out.println(ele);
        }

        //JDK 1.8开始之后的Lambda表达式
        System.out.println("------------");
        lists.forEach(s -> {
            System.out.println(s);
        });
	}

}
