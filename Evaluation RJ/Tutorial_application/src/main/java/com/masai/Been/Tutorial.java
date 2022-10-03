package com.masai.Been;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Tutorial {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long Tutorial_id;
	private String Tutorial_Tital;
	private String Tutorial_description;
	private boolean published_Status;
	
	
	public long getTutorial_id() {
		return Tutorial_id;
	}
	public void setTutorial_id(long tutorial_id) {
		Tutorial_id = tutorial_id;
	}
	public String getTutorial_Tital() {
		return Tutorial_Tital;
	}
	public void setTutorial_Tital(String tutorial_Tital) {
		Tutorial_Tital = tutorial_Tital;
	}
	public String getTutorial_description() {
		return Tutorial_description;
	}
	public void setTutorial_description(String tutorial_description) {
		Tutorial_description = tutorial_description;
	}
	public boolean getPublished_Status() {
		return published_Status;
	}
	public void setPublished_Status(boolean published_Status) {
		this.published_Status = published_Status;
	} 
	
	
	
}
