package com.ashokit.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Embeddable
@Data
public class StudentComposite implements java.io.Serializable {

	private Integer rollNo;

	@Column(length = 20)
	private String section;

}
