package com.masai.been;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "emp_seq")
	public int address_id;
	
	@NotNull
	public String street;
	
	@NotNull
	public String city;
	
	@NotNull
	public String state;
	
	@NotNull
	public String country;
	
	@ManyToOne
	public Employee employee;

	public Address(int address_id, @NotNull String street, @NotNull String city, @NotNull String state,
			@NotNull String country, Employee employee) {
		super();
		this.address_id = address_id;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.employee = employee;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public int getAddress_id() {
		return address_id;
	}

	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(int address_id, String street, String city, String state, String country) {
		super();
		this.address_id = address_id;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	
	
	
}
