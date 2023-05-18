package com.itheima.apiStringbuilder;

public class StringBuilderTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = null;
		System.out.println(toString(arr1));
		int[] arr2 = {10,22,44};
		System.out.println(toString(arr2));
	}

		
		public static String toString(int[] arr) {
			if(arr != null) {
				StringBuilder sb =new StringBuilder("[");
				for(int i = 0;i < arr.length;i++) {
					sb.append(arr[i]).append(i == arr.length-1?"":",");
				}
				sb.append("]");
				return sb.toString();
			}else {
				return null;
			}
		}
	}

 
