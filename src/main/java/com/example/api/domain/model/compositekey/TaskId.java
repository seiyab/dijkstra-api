package com.example.api.domain.model.compositekey;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Embeddable
@Data
public class TaskId implements Serializable {
	@Column(name="contest_id")
	public String contestId;
	@Column(name="task")
	public String task;
}
