package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Student.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService service;
	
	
	//For Get All students
	
	@GetMapping("/student")
	public List<Student> getAllStudent(){
		return this.service.getAllStudent();
	}
	
	@GetMapping("/student/{id}")
	public Student getOneStudent(@PathVariable("id") Integer id) {
		return this.service.getOneStudent(id);
	}
	
	@PostMapping("/student")
	public Student addStudent(@RequestBody Student s) {
		return this.service.addStudent(s);
	}
	
	@PutMapping("/student")
	public Student updateStudent(@RequestBody Student s) {
		return this.service.updateStudent(s);
	}
	
	@DeleteMapping("/student/{id}")
	public Student deleteStudent(@PathVariable("id") Integer id) {
		return this.service.deleteStudent(id);
	}
	
}
