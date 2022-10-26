package com.masai.been;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Value;

@Entity
public class URL {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "emp_seq")
	public int id;
	
	
	public String actual_url;
	
	
	public String short_url;
	
	@Value("7 Days")
	public String expiry;

	@Value("true")
	public boolean valid;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getActual_url() {
		return actual_url;
	}

	public void setActual_url(String actual_url) {
		this.actual_url = actual_url;
	}

	public String getShort_url() {
		return short_url;
	}

	public void setShort_url(String short_url) {
		this.short_url = short_url;
	}

	public String getExpiry() {
		return expiry;
	}

	public void setExpiry(String expiry) {
		this.expiry = expiry;
	}

	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}

	public URL(int id, String actual_url, String short_url, String expiry, boolean valid) {
		super();
		this.id = id;
		this.actual_url = actual_url;
		this.short_url = short_url;
		this.expiry = expiry;
		this.valid = valid;
	}
	
	public URL() {
		// TODO Auto-generated constructor stub
	}
}
