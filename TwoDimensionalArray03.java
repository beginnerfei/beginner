public class TwoDimensionalArray03{
	public static void main(String[] args){
		
		//数组元素个数不同
		int[][]arr = new int[3][];
		
		for(int i=0;i<arr.length; i++) {
			arr[i]=new int[i+1];
			//遍历一维数组并赋值
			for(int j=0;j<arr[i].length; j++){
				arr[i][j]=i+1;//赋值
			}
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=0;j<arr[i].length; j++) {
				System.out.print(arr[i][j] +"");
			}
			System.out.println();//换行
		}
	}
	
}