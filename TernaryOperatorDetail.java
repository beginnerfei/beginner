public class TernaryOperatorDetail {
	public static void main(String[] args) {
		
		int a =3;
		int b = 8;
		int c = a > b ? a++ : b--;
		
		
		System.out.println("c=" + c);
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		
	}
}