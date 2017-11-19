package com.example.api.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.domain.model.Label;
import com.example.api.domain.repository.LabelRepository;

@RestController
@RequestMapping("/tasks")
public class TaskController {
	
	@Autowired
	LabelRepository labelRepository;
	
	@GetMapping("/{algorithmId}")
	public List<Label> tasks(@PathVariable Integer algorithmId) {
		return labelRepository.findByAlgorithm_AlgorithmId(algorithmId);
	}
}
