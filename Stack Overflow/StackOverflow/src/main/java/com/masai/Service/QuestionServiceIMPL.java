package com.masai.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.masai.been.Questions;
import com.masai.been.Tags;
import com.masai.repository.QuestionsDao;
import com.masai.repository.TagsDao;

public class QuestionServiceIMPL implements QuestionsService{

	@Autowired
	public TagsDao tgs;
	
	@Autowired
	public QuestionsDao qdao;
	
	@Override
	public Questions createQuestion(Questions que) {
		// TODO Auto-generated method stub
		Optional<Questions> opt = qdao.findById(que.getId());
		Questions q=null;
		if(opt.isPresent()) {
			
		}
		else {
			q=qdao.save(que);
		}
		return q;
	}

	@Override
	public Questions updateQuestion(Questions que) {
		// TODO Auto-generated method stub
		Optional<Questions> opt = qdao.findById(que.getId());
		if(opt.isPresent()) {
			//return new throw ("tutorial not found by this id: "+tutorial.getId());
			return qdao.save(que);
		}else {
			return null;
		}
		
	}

	@Override
	public String addTagToQuestion(int id,String tag) {
		// TODO Auto-generated method stub
		Optional<Questions> opt = qdao.findById(id);
		if(opt.isPresent()) {
			List<Tags> list=tgs.findAll();
			for (Tags t:list) {
				if(t.getTagName().equals(tag)) {
					Questions q=opt.get();
					q.setTags(t);
					t.getQlist().add(q);
					tgs.save(t);
					qdao.save(q);
					
					return "Done";
				}
			}
		}
		
		return "Question not found";
	}

	@Override
	public List<Questions> getQuestionsByTag(String tag) {
		// TODO Auto-generated method stub
		List<Tags> list=tgs.findAll();
		for (Tags t:list) {
			if(t.getTagName().equals(tag)) {
				
				return t.getQlist();
			}
		}
		return null;
	}

}
