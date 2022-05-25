package com.masai;

import java.util.Scanner;

public class ReverseString {

	public static String reversString(String input){
		
		
		int len=input.length();
		String[] arr=null;
		arr=input.split("");
		//System.out.println(arr);
		String[] ansArr=new String[arr.length];
		
		String ans="";
		for (int x=0;x<len;x++) {
			ansArr[x]=arr[len-(x+1)];
			ans+=ansArr[x];
			//System.out.println(input[x]);
		}
		return ans;
	}
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to reverse");
		String orignalString = sc.nextLine();
		String result = reversString(orignalString);
		System.out.println("Original String is :"+ orignalString);
		System.out.println("Reversed String is :"+ result);
	}

}
