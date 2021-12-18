package com.example.demo.Student;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
	
@Id
private Integer  id;
private String name;
private String school;
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(Integer id, String name, String school) {
	super();
	this.id = id;
	this.name = name;
	this.school = school;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSchool() {
	return school;
}
public void setSchool(String school) {
	this.school = school;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", school=" + school + "]";
}

}
