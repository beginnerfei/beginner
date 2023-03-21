public class Object03{
	public static void main(String[] args){
		
		Person p1 = new Person();
		p1.age=10;
		p1.name="小明";
		Person p2 = p1;
		p1.age = 60 ;
		
		System.out.println(p2.age);
	}
}
class Person {
	String name;
	int age;
}