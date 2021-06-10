package com.company.model.dto;

import java.util.ArrayList;
import java.util.Collection;

import com.company.model.Number;

import lombok.Data;

@Data
public class Examdto {

	private Long id;

	private Long number;

	private Collection<Number> numbers = new ArrayList<>();

}
