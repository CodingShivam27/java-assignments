package com.masai.been;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "emp_seq")
	public int employee_id;
	
	@NotNull
	public String firstname;
	
	@NotNull
	public String lastname;
	
	@NotNull
	@Pattern(regexp = "(0/91)?[7-9][0-9]{9}", message = "Invalid Mobile No.")
	public String cell_phone;
	
	@NotNull
	@OneToMany
	public List<Address> address_id=new ArrayList<>();
	
	

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getCell_phone() {
		return cell_phone;
	}

	public void setCell_phone(String cell_phone) {
		this.cell_phone = cell_phone;
	}

	public List<Address> getAddress_id() {
		return address_id;
	}

	public void setAddress_id(List<Address> address_id) {
		this.address_id = address_id;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int employee_id, String firstname, String lastname, String cell_phone, List<Address> address_id) {
		super();
		this.employee_id = employee_id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.cell_phone = cell_phone;
		this.address_id = address_id;
	}
	
	
	
}
