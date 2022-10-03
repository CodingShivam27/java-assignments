package com.masai.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Been.Tutorial;
import com.masai.repository.TutorialDao;

@Service
public class TutorialServiceImpl implements TutorialService {

	@Autowired
	private TutorialDao tutoDao;
	
	@Override
	public Tutorial createNewTutorial(Tutorial tutorial) {
		Optional<Tutorial> opt = tutoDao.findById(tutorial.getTutorial_id());
		if(opt.isPresent()) {
			return tutoDao.save(tutorial);
		}else {
			//return new throw 
		}
		return null;
		
	}

	@Override
	public List<Tutorial> getListTutorial() {
		List<Tutorial> tList = tutoDao.findAll();
		if(tList.isEmpty()) {
			//return ("List is empty")
		}else {
			return tList;
		}
		return null;
	}

	@Override
	public Tutorial getTutorialById(Long id) {
		Optional<Tutorial> opt = tutoDao.findById(id);
		if(opt.isPresent()) {
			//return new throw ("tutorial not found by this id: "+id);
			
		}else {
			return opt.get();
		}
		return null;
	}

	@Override
	public Tutorial updateTutorialById(Tutorial tutorial) {
		Optional<Tutorial> opt = tutoDao.findById(tutorial.getTutorial_id());
		if(opt.isPresent()) {
			//return new throw ("tutorial not found by this id: "+tutorial.getId());
			
		}else {
			return tutoDao.save(tutorial);
		}
		return null;
	}

	@Override
	public String deleteTutorialById(Long id) {
		Optional<Tutorial> opt = tutoDao.findById(id);
		if(opt.isPresent()) {
			//return new throw ("tutorial not found by this id: "+id);
			
		}else {
			Tutorial t1 = opt.get();
			tutoDao.delete(t1);
			 return "Tutorial deleted Successfully by this id: "+id;
		}
		return null;
	}

	@Override
	public String deleteAll() {
		tutoDao.deleteAll();
		 return "Tutorials deleted Successfully";
	}

	@Override
	public List<Tutorial> findAllPublished(boolean status) {
		List<Tutorial> tList = tutoDao.findAll();
		List<Tutorial> ans= new ArrayList<>();
		if(tList.isEmpty()) {
			//return ("List is empty")
		}else {
			for(Tutorial t: tList) {
				boolean stat=t.getPublished_Status();
				if(stat==status) {
					ans.add(t);
				}
			}
			return ans;
		}
		return null;
	}

	@Override
	public List<Tutorial> findAllTutorialWithName(String title) {
		List<Tutorial> tList = tutoDao.findAll();
		List<Tutorial> ans= new ArrayList<>();
		if(tList.isEmpty()) {
			//return ("List is empty")
		}else {
			for(Tutorial t: tList) {
				String name=t.getTutorial_Tital();
				if(name.contains(title)) {
					ans.add(t);
				}
			}
			return ans;
		}

		
		return null;
	}
}
