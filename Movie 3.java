package com.itheima.collection;

import java.security.interfaces.DSAPublicKey;

public class Movie {

	
	 private String name;
	    private double score;
	    private String actor;
	    
	    
		public Movie() {
			super();
		}
		public Movie(String name, double score, String actor) {
			super();
			this.name = name;
			this.score = score;
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
	    
	    
	    
		
		public String toString() {
			return "Movie{" +"name='" + name + '\'' +", score=" + score +
                ", actor='" + actor + '\'' + '}';
			
		}
		
}
