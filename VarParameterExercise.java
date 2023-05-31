package com.hsp.migong;

public class VarParameterExercise {

	public static void main(String[] args) {
		HspMethodqqq hm = new HspMethodqqq();
		System.out.println(hm.showScore("milan", 90.1, 80.0));
		System.out.println(hm.showScore("terry", 90.1, 80.0, 10, 30.5, 70));
	}
}

class HspMethodqqq {

	public String showScore(String name, double... scores) {

		double totalScore = 0;
		for (int i = 0; i < scores.length; i++) {
			totalScore += scores[i];
		}
		return name + " 有 " + scores.length + "门课的成绩总分为=" + totalScore;
	}
}
