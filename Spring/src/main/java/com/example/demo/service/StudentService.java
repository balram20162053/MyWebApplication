package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Student.Student;

@Service
public interface StudentService {
	
	public List<Student> getAllStudent();
	public Student getOneStudent(Integer id);
	public Student addStudent(Student s);
	public Student updateStudent(Student s);
	public Student deleteStudent(Integer id);
	
	

}
