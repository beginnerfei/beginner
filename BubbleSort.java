public class BubbleSort{
	public static void main(String[] args){
		
		int[]arr= {24,69,80,57,13};
		int temp=0;
		
		for(int j=0;j<4;j++) {
			if(arr[j]>arr[j+1]) {
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				
			}
		}
		System.out.println("-1-");
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j]+"\t");
		}
		for(int j=0;j<3;j++) {
			if(arr[j]>arr[j+1]) {
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
			System.out.println("\n-2-");
		for(int j=0;j<arr.length;j++) {
				System.out.print(arr[j]+"\t");
		}
	}
}	