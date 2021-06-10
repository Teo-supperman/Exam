package com.company.model.dto;

import java.util.ArrayList;
import java.util.List;

import com.company.model.Number;

import lombok.Data;

@Data
public class Examdto {

	private Long id;

	private Long number;

	private List<Number> numbers = new ArrayList<>();

}
