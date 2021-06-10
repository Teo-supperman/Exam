package com.company.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.sun.istack.NotNull;

import lombok.Data;

@Entity
@Data
public class Exam {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long examId;
	@NotNull
	private Long numberExam;
	@OneToMany(mappedBy = "numberId")
	private Collection<Number> numbers = new ArrayList<>();


}
