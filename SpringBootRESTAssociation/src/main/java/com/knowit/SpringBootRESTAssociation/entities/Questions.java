package com.knowit.SpringBootRESTAssociation.entities;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name="questions")
public class Questions {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int qid;
	String qtext;
	String opt1;
	String opt2;
	String opt3;
	String opt4;
	char answer;
	@JsonIgnoreProperties("questions")
	//To ignore the properties from the question entity so that it doesn't get repeated again and again
	@ManyToOne
	@JoinColumn(name="topicid")
	Topic topicid;

}
