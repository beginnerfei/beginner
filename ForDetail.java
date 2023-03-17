public class ForDetail {
	public static void main(String[] args) {
		
		
		for(int i=1;i<10;i++) {
			System.out.println("循环语句"+i);
		}
		
		
		int count = 3;
		for(int i=0,j=0; i < count; i++,j+=2) {
			System.out.println("i="+i+"j="+j);
		}
	}
}