package com.student.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.entity.student;


@Repository
public interface studentRepo extends CrudRepository<student, Long> {
	public List<student> findAll();
	public student save(student studentDetails);
}
