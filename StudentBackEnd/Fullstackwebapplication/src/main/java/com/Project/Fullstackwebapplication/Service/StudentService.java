package com.Project.Fullstackwebapplication.Service;

import java.util.List;

import com.Project.Fullstackwebapplication.Model.Student;

public interface StudentService {
public Student addStudent(Student student);
public List<Student> getAllStudents();
public Student getOneStudentById(int id);
public Student deleteOneStudentById(int id);
}
