package com.masai;

import java.util.Scanner;

public class LibraryInterfaceDemo {

	private static Scanner sc = new Scanner(System.in);

	public static void registration(int age) {

		LibraryUser lu;
		String type;
		if (age > 12) {
			lu = new AdultUser();
			((AdultUser) lu).setAge(age);
			lu.registerAccount();
			System.out.println("Enter Book Type you want: ");
			type = sc.next();
			((AdultUser) lu).setBookType(type);

			lu.requestBook();
		} 
		else {
			lu = new KidUsers();
			((KidUsers) lu).setAge(age);
			lu.registerAccount();
			System.out.println("Enter Book Type you want: ");
			type = sc.next();
			
			((KidUsers) lu).setBookType(type);
			
			lu.requestBook();
		}

	}

	public static void main(String[] args) {

		System.out.println("Wlecome to library..");

		System.out.println("Enter your age for register:- ");

		int age = sc.nextInt();
		
		LibraryInterfaceDemo.registration(age);

	}
}
