package com.example.demo.service;

import java.util.List;

import com.example.demo.bean.Student;

public interface StudentService {
	List<Student> getAllStudents();
	Student addStudent(Student student);

}
