public class testP75 {
	public static void main(String[] args) {
		
		int x = 5;
		int y = 5;
		if(x++== 6 & ++y==6) {
			x = 11;
		}
		System.out.println("x=" + x + "y=" + y);
	
		
		int a = 5;
		int b = 5;
		if(a++== 6 && ++b==6) {
			a = 11;
		}
		System.out.println("a=" + a + "b=" + b);
		
		int c = 5;
		int d = 5;
		if(c++== 6 || ++d==6) {
			c = 11;
		}
		System.out.println("c=" + c + "d=" + d);
		
		int e = 5;
		int f = 5;
		if(e++== 6 | ++f==6) {
			e = 11;
		}
		System.out.println("e=" + e + "f=" + f);
		
		boolean g = true;
		boolean h = false;
		short j = 46;
		if( (j++==46) && (h=true) ) j++;
		if((g=false)||(++j==49) ) j++;
		System.out.println("j=" + j);
		
	}
}
	