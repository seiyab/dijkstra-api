package com.example.api.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name="task")
@Data
public class Task {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long taskId;
	private Integer arc;
	private Integer abc;
	private Character problem;
}