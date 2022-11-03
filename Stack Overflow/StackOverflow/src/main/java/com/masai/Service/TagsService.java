package com.masai.Service;

import org.springframework.stereotype.Component;

import com.masai.been.Tags;

@Component
public interface TagsService {

	public Tags createTag(Tags tag);
	
}
