package com.question2;

public abstract class Parent {

	final int number;
	
	public Parent(int n) {
		number=n;
	}

	public int getNumber() {
		return number;
	}

	public abstract void method1();
	
	public final void method2() {
		System.out.println("I am inside method 2");
	}
	
	public void method3() {
		System.out.println("I am inside method3");
	}
	
}
