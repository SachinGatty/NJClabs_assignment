package com.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entity.student;
import com.student.repository.studentRepo;

@Service
public class studentservice {
	@Autowired
	 private studentRepo stud;
	
	public List<student> getAllStud() {
		
			List<student> studList = stud.findAll();
			return studList;
	}
	
	public student addStudent(student data) {
		student studData = stud.save(data);
		return studData;
}
}
