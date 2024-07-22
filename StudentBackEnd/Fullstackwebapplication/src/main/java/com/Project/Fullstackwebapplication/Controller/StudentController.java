package com.Project.Fullstackwebapplication.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Project.Fullstackwebapplication.Model.Student;
import com.Project.Fullstackwebapplication.Service.StudentService;

@RestController
@CrossOrigin
public class StudentController {
	@Autowired
	private StudentService service;
@PostMapping("/students")
public String addStudent(@RequestBody Student student)
{
	service.addStudent(student);
	return "new Student added";
}
@GetMapping("/students")
public List<Student> getStudent()
{
	return service.getAllStudents();
}
@GetMapping("/students/{id}")
public Student getStudent(@PathVariable int id)
{
	return  service.getOneStudentById(id);
}
@DeleteMapping("/students/{id}")
public Student deleteOneStudentById(@PathVariable int id)
{
	return  service.deleteOneStudentById(id);
}
}
