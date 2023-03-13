package com.ashokit.jpa.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="STUDENTS")
public class StudentEntity {

	@EmbeddedId
	private StudentComposite id;
	
	@Column(length = 20)
	private String sName;
	
	private Integer marks;
	
	
}
