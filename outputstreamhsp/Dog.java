package com.hsp.outputstreamhsp;

import java.io.Serializable;

public class Dog implements Serializable {
	    private String name;
	    private int age;
	    private static String nation;
	    private transient String color;
	    private Master master = new Master();

	    private static final long serialVersionUID = 1L;

	    public Dog(String name, int age, String nation, String color) {
	        this.name = name;
	        this.age = age;
	        this.color = color;
	        this.nation = nation;
	    }

	    @Override
	    public String toString() {
	        return "Dog{" +
	                "name='" + name + '\'' +
	                ", age=" + age +
	                ", color='" + color + '\'' +
	                '}' + nation + " " +master;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }
	}
