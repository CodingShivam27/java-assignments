package com.question4;

public class Demo {

//	public static Bank getBank(String bank) {
//		
//		return ;
//	}
	
	public static void main(String[] args) {
		
		String bank="axis";
		if(bank=="axis") {
			//getBank(bank);
		}
		else if(bank=="icici") {
			//getBank(bank);
		}
		else {
			System.out.println("null");
		}
		
		
		Bank bank1=new AxisBank();
		
		System.out.println(bank1.branchName);
		
		AxisBank gg= (AxisBank)bank1;
		System.out.println(gg.rateOfInterest);
	}

}
