package com.question2;

import java.util.Scanner;

public class Child extends Parent {

	public Child(int n) {
		super(n);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println(getNumber());
		System.out.println("I am inside method 1");
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number between 1 to 10 : ");
		int Number= input.nextInt();
		if(Number >= 1 && Number <= 10) {
			Parent p = new Child(Number);
			p.method1();
			p.method2();
			p.method3();
		}
		else {
			System.out.println("Invalid number");
		}
		
	}

}
