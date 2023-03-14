package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.student;

public interface studentService {
List<student> getAllStudents();
	
	
	student saveStudent(student student);
	
	student getStudentById(Long id);
	student updateStudent(student student);
	void deleteStudentById(Long id);
}
