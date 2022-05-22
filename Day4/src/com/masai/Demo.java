package com.masai;

public class Demo {
	
	public Demo(){
		System.out.println("from empty");
	}
	public Demo(String s){
		this();
		System.out.println("form string");
	}
	public Demo(int i){
		this("name");
		System.out.println("from int");
	}
	public Demo(float f){
		this(20);
		System.out.println("from float");
	}
	
	
	public static void main(String[] arg) {
		Demo d1= new Demo(20.0f);
	}
	
	
}
