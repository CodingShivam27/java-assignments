package com.question3;

import java.util.Scanner;

public class AccountDetails {
	
	public  Account getAccountDetails() {
		
		Scanner input=new Scanner(System.in);
		
		Account ac=new Account();
		System.out.println("Enter Account Id:");
		int id=input.nextInt();
		ac.setAccountId(id);
		
		System.out.println("Enter Account Type:");
		String type=input.next();
		ac.setAccountType(type);
		
		System.out.println("Enter Account Balance;");
		int amount=input.nextInt();
		if(amount<=0) {
			System.out.println("Amount should be positive");
			getAccountDetails();
			return ac;
		}
		else{
			ac.setBalance(amount);
			return ac;
		}
	}
	
	
	public int getWithdrawAmount() {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter amount to be withdrown");
		int amount=input.nextInt();
		if (amount<=0) {
			System.out.println("Amount should be positive");
			getWithdrawAmount();
			return amount;
		}
		else{
			return amount;
		}
	}
	
	
	public static void main(String[] args) {
		
		AccountDetails account=new AccountDetails();
		
		Account ac=account.getAccountDetails();
		
		int amount=account.getWithdrawAmount();
		
		ac.withdraw(amount);
		
//		AccountDetails a=new AccountDetails();
//		a.getAccountDetails();
//		a.getWithdrawAmount();
		
	}
}
