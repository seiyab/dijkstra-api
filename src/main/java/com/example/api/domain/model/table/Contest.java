package com.example.api.domain.model.table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="contest")
@Data
public class Contest {
	@Id
	@Column(name="contest_id")
	private String contestId;
	
	@Column(name="name")
	private String name;
}
