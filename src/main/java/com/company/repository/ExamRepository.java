package com.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.model.Exam;

public interface ExamRepository extends JpaRepository<Exam, Long>{

}
