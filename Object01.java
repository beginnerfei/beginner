public class Object01{
	public static void main(String[] args){
		
		/*
		String cat1Name = "小白";
		int cat1Age =3;
		String cat1Color = "白色";
		
		String cat2Name = "花花";
		int cat2Age =10;
		String cat2Color = "花色";
		
		
		String[]cat1 = {"小白","3","白色"};
		String[]cat2 = {"花花","10","花色"};
		*/
		//使用面向对象OOP的方法来解决养猫问题
		//实例化一只猫 创建一只猫,
		Cat cat1 = new Cat(); //cat1 cat2 分别就是一个对象（猫对象）
		cat1.name = "小白";
		cat1.age = 3;
		cat1.color = "白色";
		
		Cat cat2 = new Cat();
		cat2.name = "小花";
		cat2.age = 10;
		cat2.color = "花色";
		
		System.out.println("第一只猫信息"+cat1.name+
				cat1.age+cat1.color);
		System.out.println("第2只猫信息"+cat2.name+
				cat2.age+cat2.color);
	}
		
}
class Cat{

	String name;
	int age;
	String color;
}	
