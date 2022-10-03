package com.masai;

public class AdultUser implements LibraryUser{
	
	private int age;
	private String bookType;
	
	public int getKidUsersAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBookType() {
		return bookType;
	}

	public void setBookType(String bookType) {
		this.bookType = bookType;
	}

	@Override
	public void registerAccount() {
		
		if(this.age > 12) {
			System.out.println("You have successfully registered under a Adult Account");
		}
		else {
			System.out.println("Sorry, Age must be greater than 12 to register as an adult");
		}
	}

	@Override
	public void requestBook() {
		
		if(this.bookType.equalsIgnoreCase("Fiction") && this.age > 12) {
			System.out.println("Book Issued successfully, please return the book within 7 days");
		}
		else {
			System.out.println("Oops, you are allowed to take only adult Fiction books");
		}
		
	}
}
