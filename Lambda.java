package com.itheima.lambda;

public class Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Swimming s1 = () -> System.out.println("老师游泳贼溜~~~~~");
      go(s1);

      System.out.println("---------------------");

      go(() -> System.out.println("学生游泳很开心~~~"));


  }

  public static void go(Swimming s){
      System.out.println("开始。。。");
      s.swim();
      System.out.println("结束。。。");
  }
}

@FunctionalInterface // 函数式接口的标志，里面只能有一个抽象方法
interface Swimming{
  void swim();

}
