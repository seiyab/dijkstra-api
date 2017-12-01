package com.example.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.api.model.table.Task;
import com.example.api.model.table.compositekey.TaskId;

public interface TaskRepository extends JpaRepository<Task, TaskId>{
}
