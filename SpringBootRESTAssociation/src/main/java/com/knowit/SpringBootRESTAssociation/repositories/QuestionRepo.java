package com.knowit.SpringBootRESTAssociation.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.knowit.SpringBootRESTAssociation.entities.Questions;

@Repository
public interface QuestionRepo extends JpaRepository<Questions, Integer> {
	//here INTEGER is the Data Type of the Primary Key
	

}
