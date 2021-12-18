package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.StudentDao;
import com.example.demo.Student.Student;

@Service
public class StudentServieImpl implements StudentService  {

//	List<Student> list;
	@Autowired
	StudentDao st;
	
	public StudentServieImpl() {
		super();
		/*
		 * Student s1 = new Student(1,"Balram Chaudhary","Mnnit Allahabad"); Student s2
		 * = new Student(2,"Aditya Kumar","Mnnit Allahabad"); Student s3 = new
		 * Student(3,"Ravi Chauhan","NIT Raipur"); Student s4 = new
		 * Student(4,"Shipra Chaudhary","NIT Tiruchirapalli"); Student s5 = new
		 * Student(5,"Waliullah Ansari","NIT Goa");
		 * 
		 * list = new ArrayList<>();
		 * 
		 * list.add(s1); list.add(s2); list.add(s3); list.add(s4); list.add(s5);
		 */
		
		
		// TODO Auto-generated constructor stub
	}

	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return  this.st.findAll();
	}

	public Student getOneStudent(Integer id) {
		return this.st.findById(id).get();
		// TODO Auto-generated method stub
		/*
		 * Student st =new Student() ; for(Student s: list) { if(s.getId()==id) { st= s;
		 * break; } } return st;
		 */
	}

	public Student addStudent(Student s) {
		// TODO Auto-generated method stub
		/* list.add(s); */
		return this.st.save(s);
	}

	public Student updateStudent(Student s) {
		return this.st.save(s);
		// TODO Auto-generated method stub
		/*
		 * for(int i=0;i<list.size();i++) { if(s.getId()== list.get(i).getId()) {
		 * list.set(i, s); break; } } return s;
		 */
	}

	public Student deleteStudent(Integer id) {
		Student s = this.st.getById(id);
		this.st.delete(s);
		return s;
		// TODO Auto-generated method stub
		/*
		 * Student st= new Student(); for(int i=0;i<list.size();i++) {
		 * if(id==list.get(i).getId()) { st = list.get(i); list.remove(i); break; } }
		 * return st;
		 */
	}

}
