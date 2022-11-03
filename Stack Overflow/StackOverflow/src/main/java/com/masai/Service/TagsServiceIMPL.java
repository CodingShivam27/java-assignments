package com.masai.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.masai.been.Tags;
import com.masai.repository.TagsDao;

public class TagsServiceIMPL implements TagsService{

	@Autowired
	public TagsDao tgs;
	
	@Override
	public Tags createTag(Tags tag) {
		// TODO Auto-generated method stub
		Optional<Tags> opt = tgs.findById(tag.getId());
		Tags t=null;
		if(opt.isPresent()) {
			
		}
		else {
			t=tgs.save(tag);
		}
		
		return t;
	}

}
