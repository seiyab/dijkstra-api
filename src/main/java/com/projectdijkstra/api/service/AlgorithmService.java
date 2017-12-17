package com.projectdijkstra.api.service;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.projectdijkstra.api.model.json.AlgorithmResponse;
import com.projectdijkstra.api.repository.AlgorithmRepository;

@Service
public class AlgorithmService {

  @Autowired
  AlgorithmRepository algorithmRepository;

  public List<AlgorithmResponse> findAllAlgorithms() {
    return algorithmRepository.findAll().stream().map(AlgorithmResponse::of)
        .collect(Collectors.toList());
  }

}
