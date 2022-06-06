package com.question2;

public class Loan {

	public double calculateLoanAmount(Employee employeeObj) {
		
		if(employeeObj instanceof PermanentEmployee) {
			
			int am=15;
			double ans=(am/100)*employeeObj.salary;
			return ans;
		}
		if(employeeObj instanceof TemporaryEmployee) {
			
			int am=10;
			double ans=(am/100)*employeeObj.salary;
			return ans;
		}else {
			return 0.0;
		}
		
		
	}
	
}
