package com.Project.Fullstackwebapplication.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project.Fullstackwebapplication.Model.Student;
import com.Project.Fullstackwebapplication.Service.StudentService;
@Service
public class StudentServiceIMPL implements StudentService{
	@Autowired
	private StudentRepository studentrepo;
	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		return studentrepo.save(student);
	}
	@Override
	public List<Student> getAllStudents() {
		return studentrepo.findAll();
	}
	@Override
	public Student getOneStudentById(int id) {
		Student student=studentrepo.findById(id).get();
//		List<Student> list=studentrepo.findAll();
//		Predicate<? super Student> predicate=stud -> stud.getId()==id;
//		return (Student) list.stream().filter(predicate).findFirst().get();
		return student;
	}
	@Override
	public Student deleteOneStudentById(int id) {
		Student student=studentrepo.findById(id).get();
		studentrepo.deleteById(id);
		return student;
		
	}
	

}
