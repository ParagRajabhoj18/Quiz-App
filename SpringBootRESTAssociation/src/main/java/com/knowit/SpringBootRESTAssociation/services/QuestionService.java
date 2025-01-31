package com.knowit.SpringBootRESTAssociation.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.knowit.SpringBootRESTAssociation.entities.Questions;
import com.knowit.SpringBootRESTAssociation.repositories.QuestionRepo;


@Service
public class QuestionService {

	@Autowired
	QuestionRepo quesrepo;
	
	public List<Questions> getAll(){
		return quesrepo.findAll();
	}
	
	public Questions getOne(int qid) {
		return quesrepo.findById(qid).get();
	}
	
	public Questions save(Questions q) {
		return quesrepo.save(q);
	}
	
	
	public String delete(int qid) {
		if (!quesrepo.existsById(qid)) {
		    throw new RuntimeException("Question not found with ID: " + qid);
		}
		quesrepo.deleteById(qid);
		return "Question deleted successfully.";
	    }
}
