public class IfExercise01 {
	public static void main(String[] args) {
		
		double d1 = 34.5;
		double d2 = 2.6;
		if(d1 > 10.0 && d2 < 20.0) {
			System.out.println("两个数的和是" + (d1 + d2));
		}
		
		int num1 = 10;
		int num2 = 5;
		int sum = num1 + num2;
		if(sum % 3 == 0 && sum % 5 == 0) {
			System.out.println("和已经被3又能被5整除");
		}else {
			System.out.println("和不能被3和5整除");
		}
		
		
	     
		int year = 2023;
		if((year % 4 == 0 && year % 100 != 0)|| year % 400 == 0) {
;
		}else {
			System.out.println(year + "不是 云年");
		}
	}
}