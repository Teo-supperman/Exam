package com.company.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.company.model.dto.Numberdto;
import com.sun.istack.NotNull;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
public class Exam {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long examId;
	@NotNull
	private Long numberExam;
	@OneToMany(mappedBy = "numberId", cascade = CascadeType.ALL)
	@EqualsAndHashCode.Exclude
	private List<Number> numbers = new ArrayList<>();


}
