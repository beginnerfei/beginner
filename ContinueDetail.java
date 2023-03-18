public class ContinueDetail {
	public static void main(String[] args) {
		
		label1:
			for(int j=0;j<4;j++) {
		lable2:
			    for(int i=0; i<10; i++) {
					if(i==2) {
						continue label1;//continue 默认控制lable2
					}
					System.out.println("i=" + i);
				}
				
			}
			
	}
}