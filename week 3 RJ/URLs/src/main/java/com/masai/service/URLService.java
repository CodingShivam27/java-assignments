package com.masai.service;

import org.springframework.stereotype.Component;

import com.masai.been.URL;

@Component
public interface URLService {
	
	public String createURL(URL url);
	
	public URL getURL();
}
