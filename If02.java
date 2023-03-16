import java.util.Scanner;

public class If02 {
	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入年龄");
		int age = myScanner.nextInt();
		if(age > 18) {
;
		}else {
			System.out.println("你的年龄不大，这次放过你了");
			
		}
		System.out.println("程序继续...");
	}
}