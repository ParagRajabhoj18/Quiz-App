package com.knowit.SpringBootRESTAssociation.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.knowit.SpringBootRESTAssociation.entities.Topic;
import com.knowit.SpringBootRESTAssociation.repositories.TopicRepo;


@Service
public class TopicService {
	
	@Autowired
	TopicRepo trepo;
	
	public List<Topic> getAll(){
		return trepo.findAll();
	}
	
	public Topic getOne(int topicid) {
		return trepo.findById(topicid).get(); //.get() is the Method Available in the Optional Class
	}
	
	public Topic save(Topic t) {
		return trepo.save(t);
	}
	
	public String delete(int topicid) {
		if (!trepo.existsById(topicid)) {
		    throw new RuntimeException("Topic not found with ID: " + topicid);
		}
		trepo.deleteById(topicid);
		return "Topic and associated questions deleted successfully.";
	    }

}
