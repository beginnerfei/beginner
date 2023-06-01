package com.hsp.extend;

public class Pupil {
	public String name;
    public int age;
    private double score;//成绩

    public void setScore(double score) {
        this.score = score;
    }
    public void testing() {
        System.out.println("小学生 " + name + " 正在考小学数学..");
    }
    public void showInfo() {
        System.out.println("学生 " + name + " 年龄 " + age + " 成绩 " + score);
    }
}
