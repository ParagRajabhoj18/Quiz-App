package com.knowit.SpringBootRESTAssociation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.knowit.SpringBootRESTAssociation.entities.Topic;




@Repository
public interface TopicRepo extends JpaRepository<Topic, Integer>{

}
