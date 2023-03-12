public class ForceConvertDetail {
	public static void main(String[] args) {
		
		//强转符号只针对于最近的操作数有效，往往会使用小括号提升优先级
		int x = (int)(10*3.5+6*1.5);
		System.out.println(x);
		
		
		int m = 100;
		char c3 =(char)m;
		System.out.println(c3);
	}
}