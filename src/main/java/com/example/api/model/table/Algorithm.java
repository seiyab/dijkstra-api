package com.example.api.model.table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="algorithm")
@Data
public class Algorithm {
	
	@Id
	@Column(name="algorithm_id")
	private Integer algorithmId;
	
	@Column(name="name_jp")
	private String nameJp;
	
	@Column(name="name_en")
	private String nameEn;
}
