package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.model.Student;
import com.student.repository.StudentRepository;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;


@RestController
public class StudentController {

	@Autowired
	StudentRepository stud;
	//get all students
	
	@GetMapping ("/ViewAll")
	public List<Student> getAllStudents()
	{
		List <Student> students = stud.findAll();
		return students; 
	}
	
	@GetMapping("/byRollno/{id}")
	 public Student geStudent(@PathVariable int id)
	 {
		Student student = stud.findById(id).get();
		return student;
	 }
	
	@PostMapping("/student/add")
	public ResponseEntity<Student> createStudent(@RequestBody Student student) {
		Student newStudent = stud.save(student);
		return ResponseEntity.status(HttpStatus.CREATED).body(newStudent);	
	}
	
	
	@PutMapping("/student/update/{id}")
	public Student updateStudents(@PathVariable int id) {
	   Student student = stud.findById(id).get();
	   student.setStud_name("Ram");
	   student.setStud_percentage(92);
	   stud.save(student);
	   return student;   
	}
	
	
	@DeleteMapping("/student/delete/{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void removeStudent(@PathVariable int id) {
		Student student = stud.findById(id).get();
		stud.delete(student);
		
	}
}
