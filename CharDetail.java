public class CharDetail {
	public static void main(String[] args) {
		//在java中，char的本质是一个整数，在输出时，是unicode码对应的字符
		char c1 = 97;
		System.out.print(c1);//a
		
		char c2 = 'a';
		System.out.println((int)c2);
		
		char c3 = '韩';
		System.out.println((int)c3);
		
		char c4 = 38889;
		System.out.println(c4);//韩
		
		System.out.println('a' + 10);
		
		//课堂小测试
		char c5 ='b' + 1;
		System.out.println((int)c5);
		System.out.println(c5);
	}
}