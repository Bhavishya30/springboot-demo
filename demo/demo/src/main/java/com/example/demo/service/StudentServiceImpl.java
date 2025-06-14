package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.Student;
import com.example.demo.respository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService
{
	@Autowired 
	private StudentRepository studentRepository;
	
	@Override 
	public List<Student> getAllStudents()
	{
		return studentRepository.findAll();	
	}
	
	@Override
	public Student addStudent(Student student)
	{
		return studentRepository.save(student);
	}
}
