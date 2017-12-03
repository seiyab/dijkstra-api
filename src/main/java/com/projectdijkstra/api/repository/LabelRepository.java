package com.projectdijkstra.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projectdijkstra.api.model.table.Label;

public interface LabelRepository extends JpaRepository<Label, Integer> {
	List<Label> findByAlgorithm_AlgorithmId(Integer algorithmId);
}
