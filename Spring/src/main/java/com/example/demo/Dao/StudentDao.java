package com.example.demo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Student.Student;

@Repository
public interface StudentDao  extends JpaRepository<Student,Integer>{

}
