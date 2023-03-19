public class ArrayExercise01{
	public static void main(String[] args) {
		
		char[]chars = new char[26];
		
		for(int i=0; i<chars.length; i++) {
			chars[i] = (char)('A' + i);//A+i是int类型，需要强转
			
		}
		System.out.println("===shuzu====");
		for(int i=0; i<chars.length; i++) {
			System.out.println(chars[i]+"");
		}
			
	}
}