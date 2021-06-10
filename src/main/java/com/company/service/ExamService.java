package com.company.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.model.Exam;
import com.company.model.Number;
import com.company.model.dto.Examdto;
import com.company.repository.ExamRepository;
import com.company.repository.NumberRepository;

@Service
public class ExamService {
	@Autowired
	private ExamRepository examRepository;

	@Autowired
	private NumberRepository numberRepository;

	public Examdto create(Examdto examdto) {
		Exam exam = new Exam();
		exam.setNumberExam(examdto.getNumber());
		List<Number> numbers = new ArrayList<>();
		for (Number number : examdto.getNumbers()) {
			if (numberRepository.findById(number.getNumberId()) != null) {
				numbers.add(number);
			}
		}
		examRepository.save(exam);
		return examdto;
	}

	public Examdto update(Examdto examdto, Long id) {
		Optional<Exam> optional = examRepository.findById(id);
		Exam exam = optional.get();
		if (exam != null) {
			exam.setExamId(id);
			exam.setNumberExam(examdto.getNumber());
			List<Number> numbers = new ArrayList<>();
			for (Number number : examdto.getNumbers()) {
				if (numberRepository.findById(number.getNumberId()) != null) {
					numbers.add(number);
				}
			}
		}
		exam = examRepository.save(exam);
		examdto.setId(exam.getExamId());
		examdto.setNumber(exam.getNumberExam());
		examdto.setNumbers(exam.getNumbers());
		return examdto;
	}

	public void delete(Long[] id) {
		// TODO Auto-generated method stub

	}

	public List<Examdto> findAll() {
		List<Examdto> examdtos = new ArrayList<>();
		List<Exam> exams = examRepository.findAll();
		for (Exam exam : exams) {
			Examdto examdto = new Examdto();
			examdto.setId(exam.getExamId());
			examdto.setNumber(exam.getNumberExam());
			examdto.setNumbers(exam.getNumbers());
		}
		return examdtos;
	}
}
