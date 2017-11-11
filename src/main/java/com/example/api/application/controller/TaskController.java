package com.example.api.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.domain.model.Task;
import com.example.api.domain.service.TaskService;

@RestController
@RequestMapping("/tasks")
public class TaskController {
	
	@Autowired
	TaskService taskService;
	
	@GetMapping("/{taskId}")
	public Task task(@PathVariable long taskId) {
		return taskService.findOne(taskId);
	}
}
