package com.itheima.regex;

import java.util.Iterator;

public class RegexDemo1 {
	public static void main(String[] args) {
		
		System.out.println(cheackQQ("232423435"));
		System.out.println(cheackQQ("23242343a5"));
		System.out.println(cheackQQ(null));
		
		
	}
	
	public static boolean checkQQ2(String qq) {
		
		return qq!=null &&qq.matches("\\d{6,20}");
	}
	
	
	
	
	public static boolean cheackQQ(String qq) {
		
		if(qq == null||qq.length()<6||qq.length()>20){
			return false;
			
		}
		
		
	for (int i = 0; i < qq.length(); i++) {
		
		char ch =qq.charAt(i);
		if(ch<'0'||ch>'9') {
			return false;
		}
		
	}
	return false;
		
		
		
		
	}

}
