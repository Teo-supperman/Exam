package com.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.model.Number;

public interface NumberRepository extends JpaRepository<Number, Long> {

	boolean findByNumber(Long number);

}
