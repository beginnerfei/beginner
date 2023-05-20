package cpm.itheima.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ages = { 34, 12, 42, 23 };
		Arrays.sort(ages);
		System.out.println(Arrays.toString(ages));

		Integer[] ages1 = { 34, 12, 42, 23 };

		Arrays.sort(ages1);
		System.out.println(Arrays.toString(ages1));

		System.out.println("-------------------------");
		Student[] students = new Student[3]; // 学生类型的数组
		students[0] = new Student("吴磊", 23, 175.5);
		students[1] = new Student("谢鑫", 18, 185.5);
		students[2] = new Student("王亮", 20, 195.5);
		System.out.println(Arrays.toString(students));

		Arrays.sort(students, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {

				return Double.compare(o2.getHeight(), o1.getHeight());//double.compare 专门比较小数
			}
		});
		System.out.println(Arrays.toString(students));
	}

}
