public class PropertiestDetail{
	public static void main(String[] args){
		
		//p1对象名  new Person();创建的空间数据 是真正的对象
		Person p1 = new Person();
		System.out.println("age="+p1.age+
				"name="+p1.name+"sal="+p1.name+"isPass="+p1.isPass);
	}
}
class Person{
	int age;
	String name;
	double sal;
	boolean isPass;
	
}