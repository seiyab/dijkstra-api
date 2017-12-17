package com.projectdijkstra.api.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.projectdijkstra.api.model.json.AlgorithmResponse;
import com.projectdijkstra.api.service.AlgorithmService;

@RestController
@RequestMapping("/algorithms")
public class AlgorithmController {

  @Autowired
  AlgorithmService algorithmService;

  @GetMapping("/list")
  public List<AlgorithmResponse> list() {
    return algorithmService.findAllAlgorithms();
  }
}
