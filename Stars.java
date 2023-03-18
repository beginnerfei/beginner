public class Stars {
	public static void main(String[] args) {
		
		int totallevel = 5;
		for(int i=1; i<= totallevel; i++) {
			
			for(int k=1; k<= totallevel-i; k++) {
				System.out.println(" ");
			}
			
			for(int j=1; j<= 2*i-1; j++) {
				
				if(j==1|| j==2*i-1|| i== totallevel) {
				    System.out.print("*");
				}else {
					System.out.println(" ");
					
				}
			}
			System.out.println("");
		}
	}
}