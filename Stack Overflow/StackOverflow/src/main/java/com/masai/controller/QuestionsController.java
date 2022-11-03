package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Service.QuestionsService;
import com.masai.been.Questions;

@RestController
public class QuestionsController {

	@Autowired
	public QuestionsService que;
	
	@PostMapping("/question/create")
	public ResponseEntity<Questions> saveQuestionHandler(@RequestBody Questions q){
		
		return new ResponseEntity<Questions>(que.createQuestion(q) , HttpStatus.CREATED);
	}
	
	@PutMapping("/question/edit/{id}")
    public Questions updateQuestionHandler(@PathVariable("id") int id,@RequestBody Questions q){

		return que.updateQuestion(q);
		
	}
	
	@PostMapping("/question/add-tags/{id}/{tag}")
	public ResponseEntity<String> addTagQuestionHandler(@PathVariable("id") int id,@PathVariable("tag") String tag){
		
		return new ResponseEntity<String>(que.addTagToQuestion(id, tag) , HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/question/get-by-tag")
	public List<Questions> getAllQuestionsByTagHandler(@RequestParam("name")String tag){
		return que.getQuestionsByTag(tag);
	}
	
}
