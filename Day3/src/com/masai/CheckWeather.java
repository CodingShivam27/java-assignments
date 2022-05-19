package com.masai;

public class CheckWeather {
	
	static void myCode(boolean isSnowing , boolean isRaining , double temperature) {
		//System.out.println(isSnowing);
		
		if(isRaining==false||isSnowing==false||temperature<50.0) {
			System.out.println("Let's stayt home.");
		}
		else {
			System.out.println("Let's go out!");
		}
	}
	
	public static void main(String[] arg) {
		boolean isSnowing = true;
		boolean isRaining = true;
		double temperature = 60.0;
		
		myCode(isSnowing,isRaining,temperature);
	}
	
}
