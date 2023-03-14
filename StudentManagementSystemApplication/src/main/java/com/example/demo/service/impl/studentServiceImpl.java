package com.example.demo.service.impl;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.student;
import com.example.demo.repository.studentRepository;
import com.example.demo.service.studentService;

@Service

public class studentServiceImpl implements studentService{
private studentRepository studentRepository;
	
	public studentServiceImpl(com.example.demo.repository.studentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public student saveStudent(student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	@Override
	public student getStudentById(Long id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id).get();
	}

	@Override
	public student updateStudent(student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
	}

}
