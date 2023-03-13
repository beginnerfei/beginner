public class ArithmeticOperatorExercise01 {
	public static void main(String[] args) {
		
		int i = 1;
		i = i + 1;
		System.out.println(i);
		
		int h = 1;
		h = 1 + h;
		System.out.println(h);
		
		int j1 = 10;
		int j2 = 20;
		int j = j1 ++;
		System.out.print("j1=" + j1);
		System.out.println("j2=" + j2);
		j = --j2;
		System.out.print("j=" + j);
		System.out.println("j2=" + j2);
	}
}