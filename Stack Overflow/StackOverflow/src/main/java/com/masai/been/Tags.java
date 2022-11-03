package com.masai.been;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.UniqueElements;

@Entity
public class Tags {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@UniqueElements
	private String tagName;
	
	private String tagDiscription;
	
	@OneToMany
	private List<Questions> Qlist =new ArrayList<>() ;
	
	public Tags() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public String getTagDiscription() {
		return tagDiscription;
	}

	public void setTagDiscription(String tagDiscription) {
		this.tagDiscription = tagDiscription;
	}

	public List<Questions> getQlist() {
		return Qlist;
	}

	public void setQlist(List<Questions> qlist) {
		Qlist = qlist;
	}

	public Tags(int id, String tagName, String tagDiscription, List<Questions> qlist) {
		super();
		this.id = id;
		this.tagName = tagName;
		this.tagDiscription = tagDiscription;
		Qlist = qlist;
	}

	
	
	
}
