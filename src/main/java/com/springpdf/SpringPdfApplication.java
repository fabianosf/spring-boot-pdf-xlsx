package com.springpdf;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springpdf.entity.Student;
import com.springpdf.repository.StudentRepository;

@SpringBootApplication
public class SpringPdfApplication implements CommandLineRunner {

	@Autowired
	StudentRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SpringPdfApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

		List<Student> students = Arrays.asList(new Student("Jack", "Daniels"), new Student("Andy", "Collins"),
				new Student("Peter", "Alvin"), new Student("Coren", "Myth"), new Student("Monica", "Lenin"),
				new Student("Pamela", "Lars"), new Student("Carme", "Sandiego"), new Student("Paul", "Miller"),
				new Student("Linderson", "Morris"), new Student("katry", "Melvin"), new Student("Carlson", "Rimom"));

		repository.saveAll(students);

	}

}
