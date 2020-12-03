package com.student.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="student")
public class student {
	
@Id
private long serialNO;
private String name;
private int marks;

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
