package com.knowit.SpringBootRESTAssociation.controllers;
import java.util.List;
import org.aspectj.weaver.patterns.TypePatternQuestions.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.knowit.SpringBootRESTAssociation.entities.QuestionDummy;
import com.knowit.SpringBootRESTAssociation.entities.Questions;
import com.knowit.SpringBootRESTAssociation.entities.Topic;
import com.knowit.SpringBootRESTAssociation.services.QuestionService;
import com.knowit.SpringBootRESTAssociation.services.TopicService;
//@CrossOrigin(origins = "http://localhost:3000") // when we have our Front End and Back on Different servers
@RestController
public class QuestionController {

	@Autowired
	QuestionService qservice;
	@Autowired
	TopicService tService;

	@GetMapping("/getAllQuestions")
	public List<Questions> getAll() {
		return qservice.getAll();
	}

	@GetMapping("/getQuestions/{qid}")
	public Questions getOne(@PathVariable int qid) {
		return qservice.getOne(qid);
	}

//	@PostMapping("/saveQues")
//	public Questions saveQues(@RequestBody Questions q) {
//		return qservice.save(q);
//		
//	}

		@PostMapping("/saveQuestion")
		public Questions saveQuestion(@RequestBody QuestionDummy q) {
			// Now we cant directly add the Questions into the DB so therefore we make use
			// of Dummy Question Db Class
			Topic t=tService.getOne(q.getTopicid());
			Questions qu = new Questions();
			qu.setQtext(q.getQtext());
			qu.setOpt1(q.getOpt1());
			qu.setOpt2(q.getOpt2());
			qu.setOpt3(q.getOpt3());
			qu.setOpt4(q.getOpt4());
			qu.setAnswer(q.getAnswer());
			qu.setTopicid(t);
			
			return qservice.save(qu);
		}
	
	 // Delete a question by ID
    @GetMapping("/deleteQuestion/{qid}")
    public void deleteQuestion(@PathVariable int qid) {
	qservice.delete(qid); // Delete the question
    }
    
    
    

}
