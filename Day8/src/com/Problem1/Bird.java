package com.Problem1;

public class Bird {
	
	public Bird(int num) {
		super();
	}
	public Bird() {
		
	}
	
	public void fly(){
		System.out. println("Bird is flying");
	}
}
class Parrot extends Bird{
	@Override
	public void fly(){
		System.out. println("I am flying");
	}
	
	public void sing(){
		System.out.println("I am Singing");
	}
}
