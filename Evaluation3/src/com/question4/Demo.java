package com.question4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter username");
		String name=input.next();
		if(Pattern.matches("[a-zA-Z3-8]", name)) {
			
		}
		
	}

}
