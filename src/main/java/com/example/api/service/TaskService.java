package com.example.api.service;

import java.util.List;
import java.util.stream.Collectors;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.api.model.json.TaskResponse;
import com.example.api.model.table.Label;
import com.example.api.model.table.Task;
import com.example.api.repository.LabelRepository;
import com.example.api.repository.TaskRepository;

@Service
@Transactional
public class TaskService {

  @Autowired
  TaskRepository taskRepository;

  @Autowired
  LabelRepository labelRepository;

  public List<TaskResponse> findTasksByAlgorithmId(Integer algorithmId) {
    List<Label> labels = this.labelRepository.findByAlgorithm_AlgorithmId(algorithmId);
    List<Task> tasks = labels.stream().map(label -> label.getTask()).collect(Collectors.toList());
    return tasks.stream().map(TaskResponse::of).collect(Collectors.toList());
  }
}
