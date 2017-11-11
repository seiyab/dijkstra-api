package com.example.api.domain.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api.domain.model.Task;
import com.example.api.domain.repository.TaskRepository;

@Service
@Transactional
public class TaskService {
	
	@Autowired
	TaskRepository taskRepository;
	
	public Task findOne(Long taskId) {
		return this.taskRepository.findOne(taskId);
	}

	public Task save(Task task) {
		return this.taskRepository.save(task);
	}
}
