package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.student;
import com.example.demo.repository.studentRepo;
//Describing all the services to be performed like get,findAll,save
//Using service to act as service provider
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
