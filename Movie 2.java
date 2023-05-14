package com.itheima.arraylist;

public class Movie {
	private String name;
	private double score;
	private String actor;

	public Movie() {

	}

	public Movie(double score, String name, String actor) {

		this.score = score;
		this.name = name;
		this.actor = actor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

}
