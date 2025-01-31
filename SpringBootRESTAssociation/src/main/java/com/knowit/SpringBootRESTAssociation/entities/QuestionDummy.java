package com.knowit.SpringBootRESTAssociation.entities;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class QuestionDummy {
	String qtext;
	String opt1;
	String opt2;
	String opt3;
	String opt4;
	char answer;
	int topicid;
}
