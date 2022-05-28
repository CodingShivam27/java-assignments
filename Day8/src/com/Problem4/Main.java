package com.Problem4;

public class Main {

	public static void main(String[] args) {
		Animal[] arr=new Animal[3];
		Dog dog=new Dog();
		Cat cat=new Cat();
		Tiger tiger=new Tiger();
		arr[0]=dog;
		arr[1]=cat;
		arr[2]=tiger;
		
		for (int x=0;x<arr.length;x++) {
			arr[x].eat();
			arr[x].walk();
			arr[x].makeNoise();
		}
		
	}

}
