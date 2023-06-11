package com.hsp.homework0641;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Properties;

import org.junit.jupiter.api.Test;

public class Homework03 {
	public static void main(String[] args) throws IOException {

		String filePath = "src\\dog.properties";
		Properties properties = new Properties();
		properties.load(new FileReader(filePath));
		String name = properties.get("name") + ""; // Object -> String
		int age = Integer.parseInt(properties.get("age") + "");// Object -> int
		String color = properties.get("color") + "";// Object -> String

		Dog dog = new Dog(name, age, color);
		System.out.println("======dog对象信息======");
		System.out.println(dog);
		String serFilePath = "\\dog.dat";
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(serFilePath));
		oos.writeObject(dog);

		oos.close();
		System.out.println("dog对象，序列化完成");
	}

	// 在编写一个方法，反序列化dog
	@Test
	public void m1() throws IOException, ClassNotFoundException {
		String serFilePath = "e:\\dog.dat";
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(serFilePath));
		Dog dog = (Dog) ois.readObject();

		System.out.println("======反序列化后 dog======");
		System.out.println(dog);

		ois.close();

	}
}

class Dog implements Serializable {
	private String name;
	private int age;
	private String color;

	public Dog(String name, int age, String color) {
		this.name = name;
		this.age = age;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Dog{" + "name='" + name + '\'' + ", age=" + age + ", color='" + color + '\'' + '}';
	}
}
