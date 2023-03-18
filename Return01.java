public class Return01{
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			if(i==3) {
				System.out.println("你好" + i);
				//break;
				//continue;
				return;
			}
			System.out.println("我好");
		}
		System.out.println("大家好");
	}
}