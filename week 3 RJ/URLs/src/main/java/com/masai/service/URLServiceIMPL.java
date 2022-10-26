package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Repository.URLDao;
import com.masai.been.URL;

@Service
public class URLServiceIMPL implements URLService {

	@Autowired
	URLDao dao;
	
	@Override
	public String createURL(URL url) {
		
		Optional<URL> opt = dao.findById(url.getId());
		if(!opt.isPresent()) {
			dao.save(url);
			return "Done";
			
		}else {
			return "URL already exist";
		}
		
		
	}

	@Override
	public URL getURL() {
		List<URL> list=dao.findAll();
		URL url=null;
		for (URL u:list) {
			if(u.isValid()) {
				url=u;
			}
		}
		
		dao.deleteById(url.getId());
		
		return url;
	
	}

}
