package com.example.api.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.api.domain.model.Task;
import com.example.api.domain.model.compositekey.TaskId;

public interface TaskRepository extends JpaRepository<Task, TaskId>{
}
