package cm.hsp.chapter10;

public class StaticExercise03 {

}

class Person {
	private int id;
	private static int total = 0;

	public static void setTotalPerson(int total) {
		// this.total = total;错误，在static方法中，不可以使用this 关键字

		Person.total = total;
	}

	public Person() {
		total++;
		id = total;
	}

	public static void m() {
		System.out.println("total的值=" + total);
	}
}

class TestPerson {
	public static void main(String[] args) {

		Person.setTotalPerson(3);
		new Person(); // 最后total的值是4
		Person.m();
	}
}