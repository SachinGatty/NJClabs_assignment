package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.student;
import com.example.demo.service.studentservice;

//Restcontroller for restfull services
@RestController

@RequestMapping("/studentRecord")
public class methodController {
	
	@Autowired
	private studentservice stud;
	
    
//  GetMApping will retrieve the data from database table. 
    @GetMapping("/studentData")
    public List<student> getStudentData() {
        return stud.getAllStud();
    }
    
	//PostMapping will posts data into the database table
    @PostMapping("/addStudent")
    public student addstud(@RequestBody student studentData) {
       return stud.addStudent(studentData);
       
    }
    
   
   
}
