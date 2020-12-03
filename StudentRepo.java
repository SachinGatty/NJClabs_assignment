package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.student;

//Repository to storage and retrieval instead od select*
@Repository
public interface studentRepo extends CrudRepository<student, Long> {
	public List<student> findAll();
	public student save(student studentDetails);
}
