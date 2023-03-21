public class Homework06P189{
	public static void main(String[] args){
		
		int[]arr = {20,-1,89,2,890,7};
		int temp =0;
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0;j<arr.length-1-i; j++) {
				//从小到大，条件是arr[j]>arr[j+1]
				//从大到小，条件是arr[j]<arr[j+1]
				if(arr[j]>arr[j+1]) {
					temp=arr[j+1] ;
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					}
				}
			}
		System.out.println("======");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
	
	}
}