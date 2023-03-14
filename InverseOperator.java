public class InverseOperator {
	public static void main(String[] args) {
		
		System.out.println(60 > 20);
		System.out.println(!(60 > 20));
		
		boolean b = (10 > 1) ^ (3 < 5);
		System.out.println("b=" + b);
		
		boolean c = (10 > 1) ^ (3 > 5);
		System.out.println("c=" + c);
	}
}
	