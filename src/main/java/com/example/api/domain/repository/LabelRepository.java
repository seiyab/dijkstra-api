package com.example.api.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.api.domain.model.Label;

public interface LabelRepository extends JpaRepository<Label, Integer> {
	List<Label> findByAlgorithm_AlgorithmId(Integer algorithmId);
}
