public class ForeConvert {
	public static void main(String[] orgs) {
		//演示强制类型转换
		int n1 = (int)1.9;
		System.out.println("n1="+ n1);//1
		
		int n2 = 2000;
		byte b1 =(byte)n2;
		System.out.println("b1=" + b1);
	}
}