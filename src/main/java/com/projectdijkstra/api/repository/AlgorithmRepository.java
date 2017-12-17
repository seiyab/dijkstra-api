package com.projectdijkstra.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projectdijkstra.api.model.table.Algorithm;

public interface AlgorithmRepository extends JpaRepository<Algorithm, Integer> {

}
