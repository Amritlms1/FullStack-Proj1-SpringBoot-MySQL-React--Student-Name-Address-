package com.Project.Fullstackwebapplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Project.Fullstackwebapplication.Model.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

}
