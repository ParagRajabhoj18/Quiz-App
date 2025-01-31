package com.knowit.SpringBootRESTAssociation.entities;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name="topics")
public class Topic {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int topicid;
	@JsonIgnoreProperties("topicid") //humne line no 35 pe jo List banai hai usme Topic ke properties
//	phirse repeat na ho isiliye unhe Ignore kiya
	@OneToMany(mappedBy = "topicid",cascade=CascadeType.ALL)
	Set<Questions> questions; //Now as we will get the Set of Questions from the Question Table
	
	
	String name;
	String description;

}
