package com.example.api.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.api.domain.model.table.Task;
import com.example.api.domain.model.table.compositekey.TaskId;

public interface TaskRepository extends JpaRepository<Task, TaskId>{
}
