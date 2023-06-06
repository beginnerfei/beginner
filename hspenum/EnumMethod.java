package com.hsp.hspenum;

public class EnumMethod {
	public static void main(String[] args) {

		Season2 autumn = Season2.AUTUMN;
		System.out.println(autumn.name());
		System.out.println(autumn.ordinal());

		Season2[] values = Season2.values();
		System.out.println("=====遍历取出枚举对象(增强for)======");
		for (Season2 season : values) {// 增强for循环
			System.out.println(season);
		}

		// valueOf：将字符串转换成枚举对象，要求字符串必须 为已有的常量名，否则报异常
		// 根据你输入的 "AUTUMN" 到 Season2的枚举对象去查找 找到了，就返回，如果没有找到，就报错
		
		Season2 autumn1 = Season2.valueOf("AUTUMN");
		System.out.println("autumn1=" + autumn1);
		System.out.println(autumn == autumn1);

		// compareTo：比较两个枚举常量，比较的就是编号

		System.out.println(Season2.AUTUMN.compareTo(Season2.SUMMER));

		// 补充了一个增强forxunh
//	        int[] nums = {1, 2, 9};
//	        //普通的for循环
//	        System.out.println("=====普通的for=====");
//	        for (int i = 0; i < nums.length; i++) {
//	            System.out.println(nums[i]);
//	        }
//	        System.out.println("=====增强的for=====");
//	        //执行流程是 依次从nums数组中取出数据，赋给i, 如果取出完毕，则退出for
//	        for(int i : nums) {
//	            System.out.println("i=" + i);
//	        }
	}
}
