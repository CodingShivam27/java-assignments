package com.problem2;

import java.util.Scanner;

public class UserRegistration {

	public void registerUser(String username,String userCountry) throws InvalidCountryException {
		
		String india=new String("India");
		
		if (userCountry.equals(india)) {
			System.out.println("User registration done successfully");
		}
		else {
			InvalidCountryException ice=new InvalidCountryException("User Outside India cannot be registered");
			throw ice;
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Your Name:");
		String username=input.nextLine();
		System.out.println("Enter Your Contry:");
		String userCountry=input.nextLine();
		
		
		UserRegistration ur=new UserRegistration();
		try {
			ur.registerUser(username, userCountry);
		}
		catch(InvalidCountryException err) {
			System.out.println(err.getMessage());
		}
	}

}
