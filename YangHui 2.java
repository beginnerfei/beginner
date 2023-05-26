package com.hsp.code;

public class YangHui {

	public static void main(String[] args) {
	
		int[][] yangHui = new int[12][];
		for (int i = 0; i < yangHui.length; i++) { // 遍历yangHui的每一个元素

			yangHui[i] = new int[i + 1];

			for (int j = 0; j < yangHui[i].length; j++) {

				if (j == 0 || j == yangHui[i].length - 1) {
					yangHui[i][j] = 1;
				} else {
					yangHui[i][j] = yangHui[i - 1][j] + yangHui[i - 1][j - 1];
				}
			}
		}

		for (int i = 0; i < yangHui.length; i++) { 
			for (int j = 0; j < yangHui[i].length; j++) {
				System.out.print(yangHui[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
