package com.question3;

public class CarBean {

	private int numberOfPassenger;
	private int numberOfms;
	
	public int getNumberOfPassenger() {
		return numberOfPassenger;
	}
	
	public void setNumberOfPassenger(int numberOfPassenger) {
		this.numberOfPassenger = numberOfPassenger;
	}
	
	public int getNumberOfms() {
		return numberOfms;
	}
	
	public void setNumberOfms(int numberOfms) {
		this.numberOfms = numberOfms;
	}
	
	

}

class Sedan extends CarBean{
	
	final int farePerkm=20;
	
}

class HatckBack extends CarBean{
	
	final int farePerkm=15;
	
}

