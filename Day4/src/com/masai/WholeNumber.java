package com.masai;

public class WholeNumber {
	
	int num=53;
	
	public static void main(String[] arg) {
		WholeNumber d1= new WholeNumber();
		
		if(d1.num<0) {
			System.out.println("Error");
		}
		else if(d1.num%2==1) {
			System.out.println(d1.num);
		}
		else {
			int even=d1.num%10;
			
			int ans=(10-even)+d1.num;
			System.out.println(ans);	
		}
	}

}
