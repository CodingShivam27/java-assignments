package com.masai.been;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.validator.constraints.UniqueElements;

@Entity
public class Questions {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@UniqueElements
	private String title;
	
	private String discription;

	@ManyToOne
	private Tags tags;
	
	public Questions() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public Tags getTags() {
		return tags;
	}

	public void setTags(Tags tags) {
		this.tags = tags;
	}

	public Questions(int id, String title, String discription, Tags tags) {
		super();
		this.id = id;
		this.title = title;
		this.discription = discription;
		this.tags = tags;
	}
	
	
	
	
	
	
}
