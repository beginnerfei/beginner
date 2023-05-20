package com.itheima.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>(); // 一行经典代码
        list.add("Java");
        list.add("Java");
        list.add("HTML");
        list.add("HTML");
        list.add("MySQL");
        list.add("MySQL");

     
        list.add(2, "黑马"); //在索引位置 2  插入元素
        System.out.println(list);

      
        System.out.println(list.remove(1));  // 根据索引 1 删除元素,返回被删除元素
        System.out.println(list);

       
        System.out.println(list.get(1));  // 根据索引 1 获取元素:public E get(int index):返回集合中指定位置的元素

       
        System.out.println(list.set(1, "教育"));   //返回修改前的值，并修改
        System.out.println(list);   // 修改索引位置处的元素: public E set(int index, E element)
	} 

}
