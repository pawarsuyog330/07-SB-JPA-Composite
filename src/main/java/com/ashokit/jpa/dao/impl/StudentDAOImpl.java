package com.ashokit.jpa.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.ashokit.jpa.dao.StudentDAO;
import com.ashokit.jpa.entity.StudentComposite;
import com.ashokit.jpa.entity.StudentEntity;

@Repository
@Transactional
public class StudentDAOImpl implements StudentDAO {

	@PersistenceContext
	EntityManager manager;
	
	@Override
	public void saveEntity(StudentEntity entity) {
		manager.persist(entity);
	}

	@Override
	public StudentEntity findStudentById(StudentComposite id) {
		return manager.find(StudentEntity.class, id);
	}

}
