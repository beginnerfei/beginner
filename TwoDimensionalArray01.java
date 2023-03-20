public class TwoDimensionalArray01{
	public static void main(String[] args){
		
		int[][]arr= {{0,0,0,0,0,0,0},{0,0,10,0,0,0},
				{0,2,0,3,0,0},{0,0,0,0,0,0,0}};
		
		System.out.println("二维数组的元素个数"+arr.length);
		System.out.println("第3个一位数组的第四个值"+arr[2][3]);
		for(int i=0;i<arr.length; i++) {//遍历二维数组的每一个元素
			//遍历二维数组的每一个元素（数组）
			//arr[i].length 得到对应的每一个一位数组的长度
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
		System.out.println();
		}
	}
}