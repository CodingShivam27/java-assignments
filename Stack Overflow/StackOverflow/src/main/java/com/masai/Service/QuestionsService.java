package com.masai.Service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.masai.been.Questions;

@Component
public interface QuestionsService {

	public Questions createQuestion(Questions que);
	
	public Questions updateQuestion(Questions que);
	
	public String addTagToQuestion(int id,String tag);
	
	public List<Questions> getQuestionsByTag(String tag);
	
}
