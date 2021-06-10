package com.company.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.repository.NumberRepository;

@Service
public class NumberService {
	@Autowired
	private NumberRepository numberRepository;
	
	
}
