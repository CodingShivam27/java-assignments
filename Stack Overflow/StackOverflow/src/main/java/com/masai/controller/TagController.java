package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Service.TagsService;
import com.masai.been.Tags;

@RestController
public class TagController {

	@Autowired
	public TagsService tgs;
	
	@PostMapping("/tag/add")
	public ResponseEntity<Tags> saveTagHandler(@RequestBody Tags tag){
		
		return new ResponseEntity<Tags>(tgs.createTag(tag) , HttpStatus.CREATED);
	}
	
}
