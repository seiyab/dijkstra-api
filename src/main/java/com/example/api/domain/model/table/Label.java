package com.example.api.domain.model.table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="label")
@Data
public class Label {
	
	@Id
	@Column(name="label_id")
	private Integer labelId;

	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="contest_id"),
		@JoinColumn(name="task")
	})
	private Task task;
	
	@ManyToOne
	@JoinColumn(name="algorithm_id", referencedColumnName="algorithm_id")
	private Algorithm algorithm;
	
}
