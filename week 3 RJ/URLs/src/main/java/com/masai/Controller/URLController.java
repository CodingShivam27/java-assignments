package com.masai.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.been.URL;
import com.masai.service.URLServiceIMPL;

@RestController
public class URLController {

	@Autowired
	URLServiceIMPL url;
	
	@PostMapping("/short-url/create")
	public ResponseEntity<String> saveUrlHandler(@RequestBody URL u){
		return  new ResponseEntity<String>(url.createURL(u),HttpStatus.CREATED);
	}
	
	@GetMapping("/url/:short_url")
	public ResponseEntity<URL> getUrlHandler(){
		return new ResponseEntity<URL>(url.getURL(),HttpStatus.ACCEPTED);
	}
}
