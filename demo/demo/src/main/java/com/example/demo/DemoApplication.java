package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.bean.Student;
import com.example.demo.respository.StudentRepository;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{
	@Autowired
	private StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	

	
	@Override
	public void run(String ...args)
	{
		studentRepository.save(new Student(1001,"Rajesh","Trivandrum","IT"));
		studentRepository.save(new Student(1002,"Smitha","Chennai","Mech"));
		studentRepository.save(new Student(1003,"Kishore","Kochi","CS"));
		studentRepository.save(new Student(1004,"Sandeep","Mumbai","EE"));
		studentRepository.save(new Student(1005,"Saranya","Trivandrum","IT"));
		
	}

}
