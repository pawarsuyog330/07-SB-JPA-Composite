package com.ashokit.jpa.dao;

import com.ashokit.jpa.entity.StudentComposite;
import com.ashokit.jpa.entity.StudentEntity;

public interface StudentDAO {

	void saveEntity(StudentEntity entity);
	
	StudentEntity findStudentById(StudentComposite id);
}
