package com.example.api.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.api.model.json.TaskResponse;
import com.example.api.service.TaskService;

@RestController
@RequestMapping("/tasks")
public class TaskController {

  @Autowired
  TaskService taskService;

  @GetMapping("")
  public List<TaskResponse> tasks(@RequestParam("algorithm_id") Integer algorithmId) {
    return taskService.findTasksByAlgorithmId(algorithmId);
  }
}
