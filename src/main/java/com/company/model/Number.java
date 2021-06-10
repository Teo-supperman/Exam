package com.company.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Number {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long numberId;
	private Long number;
	@ManyToOne
	@JoinColumn(name = "examId")
	private Exam exam;
}
