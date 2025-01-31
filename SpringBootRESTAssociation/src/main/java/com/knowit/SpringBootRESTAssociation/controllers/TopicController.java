package com.knowit.SpringBootRESTAssociation.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.knowit.SpringBootRESTAssociation.entities.Topic;
import com.knowit.SpringBootRESTAssociation.services.TopicService;

@RestController
public class TopicController {

	@Autowired
	TopicService tservice;
	
	@GetMapping("/getAllTopics")
	public List<Topic>getAll(){
		return tservice.getAll();
	}
	
	@GetMapping("/getTopic/{topicid}")
	public Topic getTopic(@PathVariable int topicid){
		return tservice.getOne(topicid);
	}
	
	@PostMapping("/saveTopic")
	public Topic saveTopic(@RequestBody Topic t) {
		return tservice.save(t);
	}
	
	
	@GetMapping("/deleteTopic/{topicid}")
    public void deleteTopic(@PathVariable int topicid) {
	tservice.delete(topicid);
    }
	
	

}
