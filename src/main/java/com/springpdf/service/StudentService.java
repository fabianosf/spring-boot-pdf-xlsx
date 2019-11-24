package com.springpdf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springpdf.entity.Student;
import com.springpdf.repository.StudentRepository;

@Service
public class StudentService implements IStudentService{

	@Autowired
	private StudentRepository repository;
	
	@Override
	public List<Student> findAll() {		
		return(List<Student>) repository.findAll();
	}

}
