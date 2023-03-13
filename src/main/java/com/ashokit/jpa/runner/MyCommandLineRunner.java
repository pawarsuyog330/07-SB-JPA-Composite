package com.ashokit.jpa.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ashokit.jpa.dao.StudentDAO;
import com.ashokit.jpa.entity.StudentComposite;
import com.ashokit.jpa.entity.StudentEntity;

@Component
public class MyCommandLineRunner implements CommandLineRunner {

	@Autowired
	StudentDAO dao;

	@Override
	public void run(String... args) throws Exception {
		StudentComposite composite = new StudentComposite();
		composite.setRollNo(101);
		composite.setSection("A");
		/* 
		StudentEntity entity = new StudentEntity();
		entity.setId(composite);
		entity.setMarks(580);
		entity.setSName("Suyog Pawar");

		dao.saveEntity(entity);
*/
		StudentEntity se=dao.findStudentById(composite);
		System.out.println(se.getSName()+" "+se.getMarks());

	}

}
