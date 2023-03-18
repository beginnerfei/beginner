public class BreakExercise {
	public static void main(String[] args) {
		
		int sum = 0;
		int n = 0;
		
		for(int i=1; i<=100; i++) {
			sum +=1;
			if(sum>20) {
				System.out.println("和>20时，当前数i=" + i);
				n=i;
				break;
			}
			
		}
		System.out.println("当前数=" + 	n );
	}
}