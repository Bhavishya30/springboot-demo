package com.example.demo.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.*;

@Entity
@Table(name="student")
public class Student {
	@Id
	private int studId;
	private String name;
	private String address;
	private String branch;
	public  Student()
	{}
	
	public Student(int studId,String name,String address,String branch)
	{
		this.studId=studId;
		this.name=name;
		this.address=address;
		this.branch=branch;
	}
	public String getAddress() {
		return address;
	}

	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}

	public void setAddress(String address2) {
		this.address = address2;
		
	}

}
