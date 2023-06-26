package com.hsp.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 演示正则表达式的使用
 */
public class RegExp11 {

	public static void main(String[] args) {

		 String content = "https://https://www.bilibili.com/video/BV1fh411y7R8/?p=318&spm_id_from=pageDriver&vd_source=d6f8c246cc272f102f6e327c63bb83f2";
		//String content = "http://edu.3dsmax.tech/yg/bilibili/my6652/KU";

		/*
		 * 1. 先确定 url 的开始部分 https:// | http:// 
		 * 2.然后通过 ([\w-]+\.)+[\w-]+ 匹配  www.bilibili.com 
		 * 3. /video/BV1fh411y7R8?from=sear 匹配(\/[\w-?=&/%.#]*)?
		 */
		String regStr = "^((http|https)://)?([\\w-]+\\.)+[\\w-]+(\\/[\\w-?=&/%.#]*)?$";// 注意：[. ? *]表示匹配就是.本身

		Pattern pattern = Pattern.compile(regStr);
		Matcher matcher = pattern.matcher(content);
		if (matcher.find()) {
			System.out.println("满足格式");
		} else {
			System.out.println("不满足格式");
		}

		// 如果使用Pattern的matches 整体匹配 比较简洁
		System.out.println(Pattern.matches(regStr, content));

	}
}
