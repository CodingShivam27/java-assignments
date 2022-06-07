package com.problem1;

public class AccountDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Acc="12345467567";
		Account acc=new Account(Acc);
		acc.deposid(5000);
		
		try {
			double ans=acc.withdrow(5000);
			System.out.println("You have "+ans+"Rs left in your account");
		}
		catch(InsuffcientFundsException err) {
			System.out.println(err.getMessage());
		}
	}

}
