package com.example.api.domain.model.table;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.example.api.domain.model.table.compositekey.TaskId;
import lombok.Data;


@Entity
@Table(name="task")
@Data
public class Task {

	@EmbeddedId
	private TaskId taskId;
	
	@ManyToOne
	@JoinColumn(name="contest_id", insertable=false, updatable=false)
	private Contest contest;
	
	@Column(name="url")
	private String url;
}