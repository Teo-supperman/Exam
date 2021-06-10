package com.company.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.company.model.dto.Examdto;
import com.company.service.ExamService;

@Controller
@RequestMapping("/exam")
public class ExamController {
	@Autowired
	private ExamService examService;

	@PostMapping
	public Examdto create(@RequestBody Examdto examdto) {
		return examService.create(examdto);
	}

	@PutMapping("{id}")
	public Examdto update(@RequestBody Examdto examdto, @PathVariable("id") Long id) {
		return examService.update(examdto, id);

	}
	@DeleteMapping
	public void deleteCategory(@RequestBody Long[] id) {
		examService.delete(id);
	}
	@GetMapping
	public List<Examdto> examdtos() {
		return examService.findAll();
	}
}
