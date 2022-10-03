package com.masai.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.masai.Been.Tutorial;
import com.masai.Service.TutorialService;

@RestController
@RequestMapping("/api")
public class TutorialController {

	@Autowired
	private TutorialService tutoService;
	
	@PostMapping("/tutorials")
	public ResponseEntity<Tutorial> saveTutorialHandler(@RequestBody Tutorial tutorial){
		
		return new ResponseEntity<Tutorial>(tutoService.createNewTutorial(tutorial) , HttpStatus.CREATED);
	}
	
	@GetMapping("/tutorials")
	public List<Tutorial> getTutorialsHandler(){
		return tutoService.getListTutorial();
	}
	
	@GetMapping("/tutorials/{id}")
	public Tutorial getTutorialsByIdHandler(@PathVariable("id") Long id){
		
		return tutoService.getTutorialById(id);
	}
	
	@PutMapping("/tutorials/{id}")
    public Tutorial updateTutorialsByIdHandler(@PathVariable("id") Long id,@RequestBody Tutorial tutorial){
		
		tutorial.setTutorial_id(id);
		return tutoService.updateTutorialById(tutorial);
	}
	
	@DeleteMapping("/tutorials/{id}")
	public String deleteTutorialByIdhandler(@PathVariable("id") Long id) {
		return tutoService.deleteTutorialById(id);
	}
	
	@DeleteMapping("/tutorials")
	public String deleteAllTutorialHandler() {
		return tutoService.deleteAll();
	}
	
	@GetMapping("/tutorials/published")
	public List<Tutorial> getAllTutorialByPublishedHandler(){
		return tutoService.findAllPublished(true);
	}
	
	@GetMapping("/tutorials")
	public List<Tutorial> getAllTutorialByTitle(@RequestParam(name="title") String title){
		
		return tutoService.findAllTutorialWithName(title);
	}

	
}
