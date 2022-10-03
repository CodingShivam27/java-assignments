package com.masai.Service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.masai.Been.Tutorial;

@Component
public interface TutorialService {

	public Tutorial createNewTutorial(Tutorial tutorial);
	
	public List<Tutorial> getListTutorial();
	
	public Tutorial getTutorialById(Long id);
	
	public Tutorial updateTutorialById(Tutorial tutorial);
	
	public String deleteTutorialById(Long id);
	
	public String deleteAll();
	
	public List<Tutorial> findAllPublished(boolean publishedStatus);
	
	public List<Tutorial> findAllTutorialWithName(String title);
	
	
}
