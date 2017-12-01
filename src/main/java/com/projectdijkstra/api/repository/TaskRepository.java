package com.projectdijkstra.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projectdijkstra.api.model.table.Task;
import com.projectdijkstra.api.model.table.compositekey.TaskId;

public interface TaskRepository extends JpaRepository<Task, TaskId>{
}
