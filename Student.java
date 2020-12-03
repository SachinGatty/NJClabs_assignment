package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="student")
public class student {
	
//id to act as unique identifier
@Id
private long serialNO;
private String name;
private int marks;
//getter to return the variable and setter to set the value
public long getSerialNO() {
	return serialNO;
}
public void setSerialNO(long serialNO) {
	this.serialNO = serialNO;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}


}
