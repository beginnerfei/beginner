public class MethodDetail02{
	public static void main(String[] args){
		
		A a = new A();
		a.sayOk();
		a.m1();
	}	
}
class A{
	public void print(int n) {
		System.out.println(n);
	}
	public void sayOk() {
		print(10);
		System.out.println("继续sayok");
	}
	public void m1() {
		System.out.println("m1方法调用");
		B b = new B();
		b.hi();
	}
}
class B{
	public void hi() {
		System.out.println("执行b中的hi");
	}
}