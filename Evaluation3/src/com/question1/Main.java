package com.question1;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Scanner input=new Scanner(System.in);
			System.out.println("Enter the number of elements in the array");
			int len=input.nextInt();
			System.out.println("Enter the element in the array");
			int[] arr=new int[len];
			for (int x=0;x<len;x++) {
				int ele=input.nextInt();
				arr[x]=ele;
			}
			System.out.println("Enter the index of the array element you want to access");
			String ac=input.next();
			int acc=Integer.parseInt(ac);
			System.out.println("The array element at index "+arr+" = "+arr[acc]);
			System.out.println("The array element successfully accessed");

		}
		catch(ArrayIndexOutOfBoundsException err){
			System.out.println("java.lang.ArrayIndexOutOfBoundsException");
		}
		catch(NumberFormatException err) {
			System.out.println("java.lang.NumberFormatException");
		}
		
		
	}

}
