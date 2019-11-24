package com.springpdf.controller;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springpdf.entity.Student;
import com.springpdf.service.IStudentService;
import com.springpdf.util.GenerateExcel;
import com.springpdf.util.GeneratePdf;

@RestController
@RequestMapping("/api/student")
public class StudentController {

	@Autowired
	private IStudentService studentService;	
	

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/studentpdf", method = RequestMethod.GET, produces = MediaType.APPLICATION_PDF_VALUE)
	public ResponseEntity<InputStreamResource> studentsReport() {
		@SuppressWarnings("rawtypes")
		List students = (List<Student>) studentService.findAll();
		ByteArrayInputStream bis = GeneratePdf.studentsReport(students);

		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Disposition", "inline; filename=studentsreport.pdf");
		return ResponseEntity.ok().headers(headers).contentType(MediaType.APPLICATION_PDF)
				.body(new InputStreamResource(bis));
	}
	
	
	@RequestMapping(value = "/students.xlsx") 
	public ResponseEntity<InputStreamResource>excelStudentsReport() throws IOException{
		List<Student> students = (List<Student>) studentService.findAll();
		
		ByteArrayInputStream in = GenerateExcel.customersToExcel(students);
		
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Disposition", "attachament; filename=students.xlsx");
		return ResponseEntity
				.ok()
				.headers(headers)
				.body(new InputStreamResource(in));
	}
	
	
	

}

 