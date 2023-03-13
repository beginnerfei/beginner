public class ArithmeticOperator {
	public static void main(String[] args) {
		
		System.out.println(10/4);
		System.out.println(10.0/4);
		
		double d = 10/4;
		System.out.println(d);
		
		System.out.println(10%3);
		System.out.println(-10%3);
		System.out.println(10%-3);
		System.out.println(-10%-3);
		
		int i = 10;
		i++;//自增 等价于 i = i + 1;
		++i;//自增 等价于 i = i + 1；
		System.out.println("i=" + i);//11
		//前++ i++先自增后赋值
		//后++ ++i先赋值后自增
		int j = 8;
		int k = ++j; 
		System.out.println("k=" + k + "j="  + j);
		
		int m = 8;
		int n = m++; 
		System.out.println("n=" + n + "m="  + m);
	}
	
}