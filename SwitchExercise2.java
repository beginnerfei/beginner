import java.util.Scanner;

public class SwitchExercise2 {
	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入一个字符(a-e)");
		int month = myScanner.nextInt();
		
		switch(month) {
		case 3,4,5:
			System.out.println("这是春季");
		break;
		case 6,7,8:
			System.out.println("这是夏季");
		break;
		case 9,10,11:
			System.out.println("这是秋季");
		break;
		case 12,1,2:
			System.out.println("这是冬季");
		break;
		default:
			System.out.println("输入有误，应为1-12");
	
		
		
		
		}
		
		
	}
}